/**
 * 
 */
package acadglidAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author nikhil
 *
 */
public class DuplicateRemover {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args) 
	{
		Collection<String> objCollection1 = new ArrayList<String>(); // create collection with input type String
		
		System.out.println("Please enter values you want to add in collection, Press q to quit entering"); // notify user to enter values where Q is to quit user from entering
		
		Scanner objScanner = new Scanner(System.in); // creating object of scanner to take user input
		
		while(!("q".equalsIgnoreCase(objScanner.next()))) // till user Quits
		{
			objCollection1.add(objScanner.next()); // add value to Collection
		}
		
		objScanner.close(); // closing scanner object to avoid resource leakage
		
		Collection<String> objCollection2 = new ArrayList<String>(); // create second collection for duplicate entry removal
		
		for (Iterator<String> iterator = objCollection1.iterator(); iterator.hasNext();) // iterate over collection created by user inputs
		{
			if(!objCollection2.contains(iterator) || objCollection2.isEmpty()) // add element to collection if collection is empty or doesn't contain element
			{
				objCollection2.add(iterator.next());
			}
			
		}
		
		System.out.println("Here is your list after removing duplicate enteries"); // print all enteries after removing duplicate values
		for (Iterator<String> iterator = objCollection1.iterator(); iterator.hasNext();)  
		{
			System.out.println(iterator.next()); // printing all values
			
		}
	}

}
