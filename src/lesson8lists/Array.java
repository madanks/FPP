package lesson8lists;
import java.util.*;
public class Array {

	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());
             // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      al.add("Hello");
	      al.add(17.2);
	      al.add("Hello");
	      al.ensureCapacity(15);
	      al.add(null);
	      System.out.println("Contents of al: " + al + "Size : " + al.size());
	      
	      ArrayList<String> friendsnames= new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harsh");
			friendsnames.add("John");
			//friendsnames.add(20);
			
			/*ArrayList to Array Conversion */
			String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

			/*Displaying Array elements*/
			for(String k: frnames)
			{
				System.out.println(k);
			}
	   	}
}
