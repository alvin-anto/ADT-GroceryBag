/**
 * The exception class handles the error when an invalid or out of bounds index number is used.
 */
package adtGroceryBag;

/**
 * @author alvinanto
 *
 */
public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException{
	
	public ArrayIndexOutOfBoundsException(String message) 
	{
		super(message);
	}

}
