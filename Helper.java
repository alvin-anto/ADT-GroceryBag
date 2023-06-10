/**
 * This Helper class performs various operations on the array.
 */
package adtGroceryBag;

import java.io.*;

/**
 * @author alvinanto
 *
 */
public class Helper {

	/**
	 * The void method start() starts the program and calls create and display methods and perform various operations on the array list.
	 * @throws IOException
	 */
	public static void start() throws IOException
	{
		//creates a new GroceryBagADT and stores it to groceryList reference variable
		GroceryBagADT groceryList = new GroceryBagADT();
		
		//calls the create method which creates the grocerylist
		create(groceryList);
		
		//calls the display method which displays the items in the grocery bag
		display(groceryList);
		
		//leaves a blank line
		System.out.println();
		
		//removes the last item from the grocery bag
		groceryList.removeLast();
		
		//calls the display method which displays the items in the grocery bag
		display(groceryList);
		
		//leaves a blank line 
		System.out.println();
		
		//removes a random item from the grocery list.
		groceryList.removeRandom();
		
		//calls the display method which displays all the items from the list.
		display(groceryList);
		
		//leaves a blank line
		System.out.println();
		
		//prints the index number of the element of the array which contains "Chicken".
		System.out.println(groceryList.get("Chicken"));
		
		//prints the item at index 3 in the array.
		System.out.println(groceryList.get(3));
		
		//prints the actual number of items in the grocery bag.
		System.out.println(groceryList.size());
		
		//prints true if the grocery bag is empty and false if not.
		System.out.println(groceryList.isEmpty());
		
		//clears all the items from the grocery bag.
		groceryList.makeEmpty();
		
		//prints the number of items in the grocery bag.
		System.out.println(groceryList.size());
		
		
	}
	
	/**
	 * The void method create(GroceryBagADT bag) creates the grocery bag array by adding items from the text file "Grocery_List.txt".
	 * @param bag
	 * @throws IOException
	 */
	public static void create(GroceryBagADT bag) throws IOException
	{
		//creates a new FileReader object with "Grocery_List.txt".
		FileReader file1 = new FileReader("Grocery_List.txt");
		
		//creates a new BufferedReader object with file1.
		BufferedReader file2 = new BufferedReader(file1);
		
		//reads the first line from the text file.
		String line = file2.readLine();
		
		//the loop is ran till there is no other lines in the text file and the item on each line is added as a new item to the grocery bag array
		while (line != null)
		{
			bag.insert(line);
			line = file2.readLine();
		}
		//close the files used for taking input from the text file.
		file2.close();
		file1.close();
	}
	
	
	/**
	 * The void method display(GroceryBagADT bag) displays all the items in the grocery bag array.
	 * @param bag
	 */
	public static void display(GroceryBagADT bag)
	{
		if (bag.size() == 0)
		{//prints a message if the grocery bag is empty and there is no item to display.
			System.out.println("The bag is empty. There is nothing to display");
		}
		else
		{//displays each item in the grocery bag
			for (int i = 0; i < bag.size(); i++)
			{
				System.out.println(bag.get(i));
			}
		}
	}

}
