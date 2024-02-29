import java.util.ArrayList; // getting ArrayList class from java.time package
import java.util.Scanner; // getting Scanner class from java.time package

// class used to hold variables belonging to a customer
// the class has no access modifier giving it default access
// this means that the class is visible in the same package
class Customer {

	// public access variables meaning they can be accessed outside of class
	public int id; // holds id number
	public String name; // holds customer name
	public int age; // holds customer age
	public String email; // holds customer email
	public int salary; // holds customer salary
	
	// default constructor for creating a Customer object
	// this also has default access meaning it is visible in the same package
	Customer(int i, String n, int a, String e, int s) {

		id = i; // set id to i
		name = n; // set name to n
		age = a; // set age to a
		email = e; // set email to e
		salary = s; // set salary to s
	}
}

// interface with one method that will be defined in the FilteringCollection class
interface Arr {

	public ArrayList<Customer> arr(ArrayList<Customer> a);
}

// file name should be the same as the public class.
// note that the java virtual machine will load this class 
// first because it contains the main function
public class FilteringCollection {

	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {

		// creating an empty ArrayList that holds Customer objects
		ArrayList<Customer> c = new ArrayList<Customer>();
		
		// adding customer objects to the ArrayList
		c.add(new Customer(1,"Jeff",23,"jeff@email.com",5000));
		c.add(new Customer(2,"Elizabeth",24,"elizabeth@email.com",15000));
		c.add(new Customer(3,"Dominga",52,"dominga@email.com",1000));
		c.add(new Customer(4,"Lorenzo",53,"lorenzo@email.com",55000));
		c.add(new Customer(5,"Denise",28,"denise@email.com",51000));
		
		System.out.println("Printing all customers:");

		// prints the entire ArrayList
		for (int i = 0; i < c.size(); i++) {

			// notice how we access member variables of objects in an ArrayList
			System.out.println(c.get(i).name + " $" + c.get(i).salary);
		}

		System.out.println();
		
		// holds a lambda expression
		Arr rich = (cArr) -> {
			
			// creating a new ArrayList
			// the ArrayList will store all customers with a salary bigger than 50,000
			ArrayList<Customer> rCust = new ArrayList<Customer>();
			
			// loop through entire customer list
			for (int i = 0; i < cArr.size(); i++) {

				// check to see if current customer has a salary bigger than 50,000
				if (cArr.get(i).salary > 50000) {
					
					// add customer to the new ArrayList
					rCust.add(cArr.get(i));
				}
			}
			
			// returning filtered ArrayList
			return rCust;
		};
		
		// holds the filtered ArrayList
		ArrayList<Customer> r = rich.arr(c);
		
		System.out.println("Printing all customers with a salary over $50,000:");

		// prints the filtered ArrayList
		for (int i = 0; i < r.size(); i++) {

			// notice how we access member variables of objects in an ArrayList
			System.out.println(r.get(i).name + " $" + r.get(i).salary);
		}
		
	}

}