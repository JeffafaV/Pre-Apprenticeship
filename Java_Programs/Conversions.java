// imporing scanner class from the java.util package
import java.util.Scanner;

// file name should be the same as the public class
public class Conversions {
	
	// main functiion is the entry point of the program
	// it needs to have the public and static keywords
	public static void main(String[] args) {

		// creating a scanner object to allow user input
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.print("Enter amount of " + currency + ": ");
		int amount = sc.nextInt();
		
		double usd = 0;
		
		switch (currLabel)
		{
		case 'e':
			usd = amount * 1.16;
			break;
			
		case 'c':
			usd = amount * 0.15;
			break;
			
		case 'r':
			usd = amount * 0.015;
			break;
			
		case 'b':
			usd = amount * 6923.80;
			break;
		}
		
		System.out.println(amount + " " + currency + " in U.S. dollars is: $" + usd);
		System.out.println();
		
		System.out.print("Enter number: ");
		int firstNum = sc.nextInt();
		int tempNum1 = firstNum;
		int sumOfDigits = 0;
		
		while (tempNum1 > 0)
		{
			int digit1 = tempNum1 % 10;
			sumOfDigits += digit1;
			tempNum1 /= 10;
		}
		
		System.out.println("The sum of all the digits in " + firstNum + " is " + sumOfDigits);
		System.out.println();
		
		System.out.print("Enter number: ");
		int secondNum = sc.nextInt();
		int tempNum2 = secondNum;
		int numReversed = 0;
		
		while (tempNum2 > 0)
		{
			int digit2 = tempNum2 % 10;
			numReversed = numReversed * 10 + digit2;
			tempNum2 /= 10;
		}
		
		System.out.println("The reverse of " + secondNum + " is " + numReversed);
		
		sc.close();
	}

}
