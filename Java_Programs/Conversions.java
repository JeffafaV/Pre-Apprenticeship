import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Currency labels and options:");
		System.out.println("e = Euros");
		System.out.println("c = Chinese Yuan");
		System.out.println("r = Indian Rupees");
		System.out.println("b = Bitcoin");
		System.out.println();
		System.out.print("Enter the currency you want to convert to USD: ");
		
		char currLabel = sc.next().charAt(0);
		String currency;
		
		switch (currLabel)
		{
		case 'e':
			currency = "Euros";
			break;
			
		case 'c':
			currency = "Yuan";
			break;
			
		case 'r':
			currency = "Rupees";
			break;
			
		case 'b':
			currency = "Bitcoin";
			break;
			
		default:
			System.out.println("Invalid input. Try again.");
			sc.close();
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
