import java.util.ArrayList; // import for ArrayList to hold an array of salaries
import java.util.Scanner; // import for Scanner for input

// interface who's method will be defined with lambda expressions
@FunctionalInterface
interface ChangingSalary {
	
	// method supplies contract for lambda expression
	public void change(ArrayList<Integer> salaryArray);
}

// public class name must be the same as file name
public class UpdateSalaries {

	// lambda expression to double salary with an ArrayList<Integer> parameter
	static ChangingSalary doubleSalary = (ArrayList<Integer> salaryArray) -> {

		// loop through array list
		for (int i = 0; i < salaryArray.size(); i++) {
			
			// the first parameter is the index and the second is the new value
			salaryArray.set(i, salaryArray.get(i) * 2); // doubling salary
		}

	};

	// lambda expression to triple salary with an ArrayList<Integer> parameter
	static ChangingSalary tripleSalary = (ArrayList<Integer> salaryArray) -> { 

		// loop through array list
		for (int i = 0; i < salaryArray.size(); i++) {

			// the first parameter is the index and the second is the new value
			salaryArray.set(i, salaryArray.get(i) * 3); // tripling salary
		}

	};

	// main function or entry point of program
	public static void main(String[] args) {
		
		// scanner used for input
		Scanner sc = new Scanner(System.in);

		// array list of type integer to hold 5 salaries
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		System.out.println("Add 5 employee salaries: ");
		for (int i = 0; i < 5; i++) {

			// add a salary to the array list
			salaries.add(sc.nextInt());
		}
		
		// printing array list
		System.out.println("Printing 5 employee salaries:");
		for (int i = 0; i < salaries.size(); i++) {

			System.out.print(salaries.get(i) + " ");
		}
		
		System.out.println();
		
		// doubles the salary by using the lambda expression
		// note that salaryArray references salaries and can change its values
		// meaning that the values of salaries will change (be doubled)
		doubleSalary.change(salaries);
		
		// print the doubled salaries
		System.out.println("Doubling and printing 5 employee salaries:");
		for (int i = 0; i < salaries.size(); i++) {

			System.out.print(salaries.get(i) + " ");
		}

		System.out.println();

		// triples the salary by using the lambda expression
		// the values of salaries will be tripled
		tripleSalary.change(salaries);
		
		// print the tripled salaries
		System.out.println("Tripling and printing 5 employee salaries:");
		for (int i = 0; i < salaries.size(); i++) {

			System.out.print(salaries.get(i) + " ");
		}
		
		// close or free the scanner
		sc.close();
	}

}