import java.time.Year; // getting Year class from java.time package
import java.time.YearMonth; // geeting YearMonth class from java.time package
import java.util.Scanner; // getting Scanner class from java.util package

// file name should be the same as the public class
public class DaysInMonth {

	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {

		// creating a scanner object to allow user input
		Scanner sc = new Scanner(System.in);
		
		// boolean used for condition in the do while loop
		boolean b = true;
		
		// a do while loop will go through the body at least once
		do
		{
			// displaying prompt and taking user input for year
			System.out.print("Enter year: ");
			int year = sc.nextInt();

			// displaying prompt and taking user input for month
			System.out.print("Enter month: ");
			int month = sc.nextInt();
			
			// try statement runs code in body and checks for any errors
			try
			{
				// creating Year object using the year the user inputted
				Year y = Year.of(year); // can cause error if year is invalid
				// creating YearMonth object using the month the user inputted
				YearMonth ym = y.atMonth(month); // can cause error if month is invalid

				// Note that the next two lines of code won't run if error occured
				// displays prompt for the number of days in a certain month
				System.out.println("The number of days in " + ym.getMonth() + " of " + 
				ym.getYear() + " is " + ym.lengthOfMonth());
				// sets b to false
				b = false;
			}
			// catch statement runs code in body if error/exception was found in try block
			catch (Exception e)
			{
				// displays prompt for bad input
				System.out.println("Invalid input. Try again.");
			}
		}
		// continues looping until b is false which is when the user enters correct input
		while (b == true);
		
		// terminates scanner
		sc.close();
	}

}
