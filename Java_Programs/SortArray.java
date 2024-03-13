import java.util.ArrayList; // import to add ArrayList class
import java.util.Collections; // import to sort ArrayList

// interface who's method will be defined with lambda expressions
@FunctionalInterface
interface SortingIDs {
	// method contract for sorting array list
	void sortIDs(ArrayList<Integer> idsArray);
}

public class SortArray {

	public static void main(String[] args) {

		// lambda expression to sort elements of ArrayList in ascending order
		SortingIDs ascendingSort = (ArrayList<Integer> idsArray) -> {
			
			// sorts ArrayList in ascending order
			Collections.sort(idsArray);
		};

		// lambda expression to sort elements of ArrayList in descending order
		SortingIDs descendingSort = (ArrayList<Integer> idsArray) -> {
			
			// sorts ArrayList in descending order
			Collections.sort(idsArray, Collections.reverseOrder());
		};

		// create an array list of integers
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		// adding 5 different employee IDs
		System.out.println("Adding 5 employee IDs");
		ids.add(6377068);
		ids.add(6481312);
		ids.add(6134813);
		ids.add(5983861);
		ids.add(6142839);
		
		// printing the 5 IDs
		System.out.println("Printing 5 employee IDs:");
		for (int i = 0; i < ids.size(); i++) {

			System.out.print(ids.get(i) + " ");
		}
		System.out.println();
		
		// sorting the array list in ascending order using the lambda expression
		ascendingSort.sortIDs(ids);
		
		// printing the 5 IDs
		System.out.println("Printing 5 employee IDs in ascending order:");
		for (int i = 0; i < ids.size(); i++) {

			System.out.print(ids.get(i) + " ");
		}
		System.out.println();

		// sorting the array list in descending order using the lambda expression
		descendingSort.sortIDs(ids);

		// printing the 5 IDs
		System.out.println("Printing 5 employee IDs in descending order:");
		for (int i = 0; i < ids.size(); i++) {

			System.out.print(ids.get(i) + " ");
		}
		System.out.println();
	}

}
