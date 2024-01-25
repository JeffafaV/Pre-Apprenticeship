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
		
		// boolean used as a condition in the do while loop
		boolean b = true;
		
		// a do while loop will go through the body at least once
		do
		{
			System.out.print("Enter year: ");
			int year = sc.nextInt();
			System.out.print("Enter month: ");
			int month = sc.nextInt();
			/*
			System.out.print("Enter day: ");
			int day = sc.nextInt();
			*/
			try
			{
				Year y = Year.of(year);
				YearMonth ym = y.atMonth(month);
				System.out.println("The number of days in " + ym.getMonth() + " of " + 
				ym.getYear() + " is " + ym.lengthOfMonth());
				/*System.out.println("The number of days in " + ld + " is " + daysInMonth);*/
				b = false;
			}
			catch (Exception e)
			{
				System.out.println("Invalid input. Try again.");
			}
		} while (b == true); // continues looping until the user enters correct input
		
		// terminates scanner
		sc.close();
	}

}
