/**
 * This program creates a grocery bag program with the help of an array. Each item can be added, removed, and many other operations can be performed on the grocery bag.
 */
package adtGroceryBag;

/**
 * @author alvinanto
 *
 */
public class GroceryBagADT implements GroceryBagADT_Interface 
{
	//declares an array of Object data type in order to store the grocery list array
	private Object[] groceryBag;
	
	//declares a variable actualSize as int to store the size of the array
	private int actualSize;
	
	/**
	 * Constructs a newly created Object[] array with 100 elements
	 */
	public GroceryBagADT() 
	{
		//initializing the actualSize to 0
		actualSize = 0;
		
		//creates a new Object[] array of 100 elements and store it to the variable groceryBag
		groceryBag = new Object[100];
		
	}
	
	/**
	 * The method insert(Object item) inserts the item to the array. it inserts the item to the next available space and increases the actualSize by 1.
	 * @param the item to be inserted
	 * @throws ArrayException
	 */
	public void insert(Object item) throws ArrayException
	{
		if (groceryBag.length == size())
		{//throws an exception if the array is already full
			throw new ArrayException("Sorry. The grocery bag is full. Cannot add any more item ");
		}
		else
		{//adds the item after the last element and increases the actual size by 1.
			groceryBag[size()] = item;
			actualSize++;
		}
	}
	
	/**
	 * The method removeLast() method removes the last element of the array and decreases the actualSize by 1.
	 * @throws ArrayException
	 */
	public void removeLast() throws ArrayException
	{
		if (isEmpty())
		{// throws an exception if the array is already empty.
			throw new ArrayException("The grocery bag is already empty. There is no item to remove.");
		}
		else
		{//removes the last element and decreases the actualSize by 1
			groceryBag[size()-1] = null;
			actualSize--;
		}
	}
	
	/**
	 * The method removeRandom() method removes a random element from the array and moves every element to the right of it to one element to the left so it does not have any empty elements.
	 * @throws ArrayException
	 */
	public void removeRandom() throws ArrayException
	{
		if (size() == 0)
		{//throws an exception if the grocery bag is already empty.
			throw new ArrayException("The grocery bag is already empty. There is no item to remove.");
		}
		else
		{//removes a random element from the array and moves every element to the right of it to one element to the left so it does not have any empty elements.
			//stores a random number between 0 and actualSize-1 (including 0 and actualSize-1) to the int variable k
			int k = ((int)(Math.random()*size()));
			groceryBag[k] = null;
			for (int i = k + 1; i < size(); i++)
			{
				groceryBag[i-1] = groceryBag[i];
			}
			removeLast();
		}
	}
	
	/**
	 * The method get(Object item) returns the index number of the first occurence of item in the array or -1 if the item is not in the array. Also, a message is print.
	 * @param the item, the index number of which is returned.
	 * @return the index number if the first occurence of the item.
	 */
	public int get(Object item)
	{
		for (int i = 0; i < size(); i++)
		{
			if (groceryBag[i].equals(item))
			{//returns the index number if the item matches the element
				return i;
			}
			else
			{// continue onto the next index if the current iteration index does not match the item
				continue;
			}
		}
		System.out.println("Item not in the list");
		return -1;
	}

	/**
	 * The method get(int index) returns the item in the index number in the array.
	 * @param index the index number of the item to be returned
	 * @return the item at the index
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public Object get(int index) throws ArrayIndexOutOfBoundsException
	{
		if ((index < 0) || (index >= groceryBag.length))
		{//throws an exception if the index number is invalid.
			throw new ArrayIndexOutOfBoundsException("The index value is invalid. The index value should be in the range [0,99]");
		}
		else
		{//returns the item at the index number.
			return groceryBag[index];
		}
	}
	
	/**
	 * The method size() returns the number of items in the grocery bag.
	 * @return the size of the grocery bag.
	 */
	public int size()
	{
		return actualSize;
	}
	
	/**
	 * The method isEmpty() checks if the array is empty or not.
	 * @return true if the array is empty and false if its not.
	 */
	public boolean isEmpty()
	{
		if (size() == 0)
		{//returns true if the size is 0.
			return true;
		}
		else
		{//returns false if the size is not 0.
			return false;
		}
	}
	
	/**
	 * The method makeEmpty() clears all the elements in the array and make the size 0.
	 */
	public void makeEmpty()
	{
		for (int i = 0; i < size(); i++)
		{
			groceryBag[i] = null;
		}
		actualSize = 0;
	}
	
}
