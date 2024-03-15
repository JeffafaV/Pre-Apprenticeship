import java.util.ArrayList; // used for ArrayList class
import java.util.Collections; // used for sorting

// holds main method
// file name must be the same as public class name
public class LambdaOnSort {

	// the main method is the entry point of the program
	public static void main(String[] args) {
		
		// array list that holds employee IDs
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		// adding IDs to the array list
		System.out.println("Adding 5 employee IDs");
		ids.add(6377068);
		ids.add(6481312);
		ids.add(6134813);
		ids.add(5983861);
		ids.add(6142839);
		
		// printing all IDs
		System.out.println("Printing 5 employee IDs:");
		for (int i = 0; i < ids.size(); i++) {
			
			System.out.print(ids.get(i) + " ");
		}
		System.out.println();
		
		// instead of a comparator we can define a sort with a lambda expression
		// equivalent to Collections.sort(ids); (sorts in ascending order)
		// this sorts the array list in ascending order using a lambda expression
		Collections.sort(ids, (id1, id2) -> (id1 > id2) ? 1 : (id1 < id2) ? -1 : 0);
		
		/*
			comparators have three return types:
			returns negative value(-1), if and only if obj1 has to come before obj2.
			returns positive value(+1), if and only if obj1 has to come after obj2.
			returns zero(0), if and only if obj1 and obj2 are equal.
		*/

		// printing all IDs
		System.out.println("Printing 5 employee IDs in ascending order:");
		for (int i = 0; i < ids.size(); i++) {
			
			System.out.print(ids.get(i) + " ");
		}
		System.out.println();

		/*
			the ? is a conditional operator. basically if the condition to the left 
			of ? is true then it will return the item to the left of the :, if it is 
			false it will return the item to the right of the :. this one is kind of 
			tricky because to the right of the first : there is another ? conditional 
			operator in which case it will check that condition and return depending 
			on if its true or false. this is equivalent to an if/else if/else statement
		*/
		// equivalent to Collections.sort(ids, Collections.reverseOrder()); (sorts in descending order)
		// this sorts the array list in descending order using a lambda expression
		Collections.sort(ids, (id1, id2) -> (id1 > id2) ? -1 : (id1 < id2) ? 1 : 0);
		
		/*
			I believe the main point of adding a custom compartor or lambda expression 
			is for user defined classes where you have to define what makes a class 
			object greater than or less than another class object
		*/

		// printing all IDs
		System.out.println("Printing 5 employee IDs in descending order:");
		for (int i = 0; i < ids.size(); i++) {
			
			System.out.print(ids.get(i) + " ");
		}
		System.out.println();
	}

}
