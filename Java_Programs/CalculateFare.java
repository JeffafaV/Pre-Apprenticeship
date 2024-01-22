// imporing scanner class from the java.util package
import java.util.Scanner;

// file name should be the same as the public class
public class CalculateFare {
	
	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {
		
		// creating a scanner object to allow user input
		Scanner sc = new Scanner(System.in);
		// string to hold the user's choice
		// currently it is set to yes
		String userChoice = "yes";
		
		// checks to see if userChoice equals to yes
		// keeps looping until userChoice != yes
		while (userChoice.equals("yes"))
		{
			// outputs prompt to enter miles and takes user input for miles
			System.out.print("Enter the # of miles to travel: ");
			int miles = sc.nextInt();
			
			//outputs prompt to enter class and takes user input for userClass
			System.out.print("Enter the class (1/2/3) of journey: ");
			int userClass = sc.nextInt();
			
			// double used to hold the price of the fare
			// will be set in switch statement
			double price;
			
			// switch statement with userClass as the case
			switch (userClass)
			{
				// userClass = 1
				case 1:
					// algorithm used depends on the number of miles
					// and price will be calculated
					if (miles <= 100)
					{
						price = miles * 3;
					}
					else if (miles <= 250)
					{
						price = 100 * 3 + (miles - 100) * 2.50;
					}
					else
					{
						price = 100 * 3 + 150 * 2.50 + (miles - 250) * 2;
					}
					
					// outputs total cost using price
					System.out.println("Total cost = $" + price);
					
					break;
					
				// userClass = 2
				case 2:
					// algorithm used depends on the number of miles
					// and price will be calculated
					if (miles <= 100)
					{
						price = miles * 2;
					}
					else if (miles <= 250)
					{
						price = 100 * 2 + (miles - 100) * 1.50;
					}
					else
					{
						price = 100 * 2 + 150 * 1.50 + (miles - 250) * 1;
					}
					
					// outputs total cost using price
					System.out.println("Total cost = $" + price);
					
					break;
					
				// userClass = 3
				case 3:
					// algorithm used depends on the number of miles
					// and price will be calculated
					if (miles <= 100)
					{
						price = miles * 1.50;
					}
					else if (miles <= 250)
					{
						price = 100 * 1.50 + (miles - 100) * 1;
					}
					else
					{
						price = 100 * 1.50 + 150 * 1 + (miles - 250) * 0.50;
					}
					
					// outputs total cost using price
					System.out.println("Total cost = $" + price);
					
					break;
					
				// userClass = invalid input
				default:
					// outputs prompt for wrong input
					System.out.println("Wrong class input. Try again.");
			}
			
			// outputs prompt and asks user if they want to use again
			System.out.print("Do you want to calculate another fare (yes/no): ");
			
			// takes user input and turns their input into lower case
			userChoice = sc.next();
			userChoice = userChoice.toLowerCase();
		}
		
		// terminating the scanner
		sc.close();
	}

}
