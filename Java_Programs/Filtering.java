import java.util.ArrayList; // getting ArrayList class from java.time package
import java.util.Scanner; // getting Scanner class from java.time package

// interfaces with one abstract method (functional interface) can be used for lambda 
// expressions. @FunctionalInterface is an annotation that helps define the interface 
// for the compiler. It is not necessary but good practice to add them
@FunctionalInterface
interface FilteringCustomers {

	// method is created but is not defined since this is part of an interface.
	// we can define the method by using lambda expressions and we can create 
	// multiple different lambda expressions. note that the method defines 
	// a contract that the lambda expression must follow, i.e. having one 
	// parameter of type ArrayList<Customer> and it must return an ArrayList<Customer>
	public ArrayList<Customer> filter(ArrayList<Customer> a);
}

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

	// overriding the toString() method for printing Customer instances/objects
	@Override
	public String toString() {
		return id + " " + name + " " + age + " " + email + " " + salary;
	}

	// used to return a filtered customer ArrayList depending on which filter we use
	// fc holds the type of filter and c is the customer ArrayList we are filtering on
	public static ArrayList<Customer> filter(FilteringCustomers fc, ArrayList<Customer> c) {
		
		return fc.filter(c);
	}

}

// file name should be the same as the public class.
// note that the java virtual machine will load this class 
// first because it contains the main function
public class Filtering {

	// this variable holds a lambda expression to filter the customers by salary
	// we are able to define the method in the interface and set it to a variable
	// (customerSalaries) is a parameter that we pass into the method
	static FilteringCustomers filterBySalary = (ArrayList<Customer> customerSalaries) -> {
		
		// creating a new ArrayList to hold customers who make over 50,000
		ArrayList<Customer> richCustomers = new ArrayList<Customer>();
		
		// loop through entire customer list
		for (int i = 0; i < customerSalaries.size(); i++) {

			// check to see if current customer has a salary over 50,000
			if (customerSalaries.get(i).salary > 50000) {
				
				// add customer to the new ArrayList
				richCustomers.add(customerSalaries.get(i));
			}
		}
		
		// returning filtered ArrayList
		return richCustomers;
	};

	// this variable holds a lambda expression to filter the customers by age
	static FilteringCustomers filterByAge = (ArrayList<Customer> customerAges) -> {
		
		// creating a new ArrayList to hold customers who are over 30
		ArrayList<Customer> oldCustomers = new ArrayList<Customer>();
		
		// loop through entire customer list
		for (int i = 0; i < customerAges.size(); i++) {

			// check to see if current customer is over 30 years old
			if (customerAges.get(i).age > 30) {
				
				// add customer to the new ArrayList
				oldCustomers.add(customerAges.get(i));
			}
		}
		
		// returning filtered ArrayList
		return oldCustomers;
	};

	// this variable holds a lambda expression to filter the customers by email
	static FilteringCustomers filterByEmail = (ArrayList<Customer> customerEmails) -> {

		// creating a new ArrayList to hold customers with a yahoo email
		ArrayList<Customer> yahooCustomers = new ArrayList<Customer>();
		
		// loop through entire customer list
		for (int i = 0; i < customerEmails.size(); i++) {

			// check to see if current customer has a yahoo email
			if (customerEmails.get(i).email.contains("@yahoo.com")) {
				
				// add customer to the new ArrayList
				yahooCustomers.add(customerEmails.get(i));
			}
		}
		
		// returning filtered ArrayList
		return yahooCustomers;
	};

	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {

		// creating an empty ArrayList that holds Customer objects
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		// adding customer objects to the ArrayList
		customers.add(new Customer(1,"Jeff",23,"jeff@yahoo.com",5000));
		customers.add(new Customer(2,"Elizabeth",24,"elizabeth@yahoo.com",15000));
		customers.add(new Customer(3,"Dominga",52,"dominga@gmail.com",1000));
		customers.add(new Customer(4,"Lorenzo",53,"lorenzo@gmail.com",55000));
		customers.add(new Customer(5,"Denise",28,"denise@yahoo.com",51000));
		
		System.out.println("Printing all customers:");
		// prints the entire ArrayList
		for (int i = 0; i < customers.size(); i++) {

			System.out.println(customers.get(i));
		}
		System.out.println();
		
		// holds the filtered ArrayList
		ArrayList<Customer> richCustomers = Customer.filter(filterBySalary, customers);
		System.out.println("Printing all customers with a salary over $50,000:");
		// prints the filtered ArrayList
		for (int i = 0; i < richCustomers.size(); i++) {

			System.out.println(richCustomers.get(i).name + " $" + richCustomers.get(i).salary);
		}
		System.out.println();

		// holds the filtered ArrayList
		ArrayList<Customer> oldCustomers = Customer.filter(filterByAge, customers);
		System.out.println("Printing all customers with an age over 30:");
		// prints the filtered ArrayList
		for (int i = 0; i < oldCustomers.size(); i++) {

			System.out.println(oldCustomers.get(i).name + " " + oldCustomers.get(i).age);
		}
		System.out.println();

		// holds the filtered ArrayList
		ArrayList<Customer> yahooCustomers = Customer.filter(filterByEmail, customers);
		System.out.println("Printing all customers with a yahoo email:");
		// prints the filtered ArrayList
		for (int i = 0; i < yahooCustomers.size(); i++) {

			System.out.println(yahooCustomers.get(i).name + " " + yahooCustomers.get(i).email);
		}
		System.out.println();
	}

}