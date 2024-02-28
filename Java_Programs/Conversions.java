// imporing scanner class from the java.util package
import java.util.Scanner;

// file name should be the same as the public class
public class Conversions {
	
	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {

		// creating a scanner object to allow user input
		Scanner sc = new Scanner(System.in);
		
		// this conversion is used to find the usd amount of a currency
		// displaying prompt and user options for conversion
		System.out.println("Currency abbreviations and names:");
		System.out.println("e = Euros");
		System.out.println("c = Chinese Yuan");
		System.out.println("r = Indian Rupees");
		System.out.println("b = Bitcoin");
		System.out.println();
		System.out.print("Enter the currency's abbreviation you want to convert to USD: ");
		
		// taking char input from user for currency abbreviation
		char currLabel = sc.next().charAt(0);
		// string used to hold currency name 
		String currency;
		
		// switch statement with currLabel as the case
		switch (currLabel)
		{
			// setting currency variable to its respected name 
			// depending on the value of currLabel
			
			// currLabel = 'e'
			case 'e':
				currency = "Euros";
				break;
				
			// currLabel = 'c'
			case 'c':
				currency = "Yuan";
				break;
				
			// currLabel = 'r'
			case 'r':
				currency = "Rupees";
				break;
				
			// currLabel = 'b'
			case 'b':
				currency = "Bitcoin";
				break;
				
			// currLabel = invalid input
			default:
				// displaying prompt for bad input
				System.out.println("Invalid input. Try again.");
				
				// terminating the scanner
				sc.close();
				// terminating the program
				return;
		}
		
		// displays prompt and asks the user for the amount of their chosen currency
		System.out.print("Enter amount of " + currency + ": ");
		int amount = sc.nextInt();
		
		// double used to hold the usd amount
		double usd = 0;
		
		// switch statement with currLabel as the case
		switch (currLabel)
		{
			// setting usd variable to its respected amount 
			// depending on the value of currLabel

			// currLabel = 'e'
			case 'e':
				usd = amount * 1.16;
				break;
				
			// currLabel = 'c'
			case 'c':
				usd = amount * 0.15;
				break;
				
			// currLabel = 'r'
			case 'r':
				usd = amount * 0.015;
				break;
				
			// currLabel = 'b'
			case 'b':
				usd = amount * 6923.80;
				break;
		}
		
		// displays prompt for conversion of currency
		System.out.println(amount + " " + currency + " in U.S. dollars is: $" + usd);
		System.out.println();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// this is a separate conversion used to find the sum of all digits in a number
		// displays prompt and asks the user for a number
		System.out.print("Enter number: ");
		int firstNum = sc.nextInt();
		
		// temp variable used to hold firstNum as it changes
		int tempNum1 = firstNum;
		// used to hold the sum of all the digits in firstNum
		int sumOfDigits = 0;
		
		// continue looping until tempNum1 is less than or equal to 0
		while (tempNum1 > 0)
		{
			// used to hold the last digit of tempNum1
			int digit1 = tempNum1 % 10;
			// add last digit to sumOfDigits
			sumOfDigits += digit1;
			// divide tempNum1 by 10 to exclude its last digit
			tempNum1 /= 10;
		}
		
		// displays prompt for the sum of all digits in a number
		System.out.println("The sum of all the digits in " + firstNum + " is " + sumOfDigits);
		System.out.println();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// this is a separate conversion used to find the reverse of a number
		// displays prompt and asks the user for a number
		System.out.print("Enter number: ");
		int secondNum = sc.nextInt();

		// temp variable used to hold secondNum as it changes
		int tempNum2 = secondNum;
		// used to hold the reverse of secondNum
		int numReversed = 0;
		
		// continue looping until tempNum2 is less than or equal to 0
		while (tempNum2 > 0)
		{
			// used to hold the last digit of tempNum2
			int digit2 = tempNum2 % 10;
			// multiply 10 to numReversed and then add digit2
			// multiplying by 10 is what's pushing the last digit to the front
			numReversed = numReversed * 10 + digit2;
			// divide tempNum2 by 10 to exclude its last digit
			tempNum2 /= 10;
		}
		
		// displays prompt for the the reverse of a number
		System.out.println("The reverse of " + secondNum + " is " + numReversed);
		
		// terminates the scanner
		sc.close();
	}

}
