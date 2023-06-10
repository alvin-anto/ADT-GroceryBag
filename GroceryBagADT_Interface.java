/**
 * The interface for the GroceryBagADT class which specifies all the methods that the class must have.
 */
package adtGroceryBag;

/**
 * @author alvinanto
 *
 */
public interface GroceryBagADT_Interface 
{
	//adds an item to the end of the list of the grocery bag.
	public void insert(Object item);
	
	//removes the item at the end of the grocery bag.
	public void removeLast();
	
	//removes an item at a random index from the grocery bag.
	public void removeRandom();
	
	//gets the index of the first occurrence of an item from the grocery bag.
	public int get(Object item);
	
	//get a reference to an item at position index of the grocery bag
	public Object get(int index);
	
	//checks how many items are there in the grocery bag.
	public int size();
	
	//checks to see if the grocery bag is empty/
	public boolean isEmpty();
	
	//empties the grocery bag.
	public void makeEmpty();
	
	
}
