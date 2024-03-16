import java.util.Scanner; // used for user input

// class holds the main method
// file name must be the same as public class name
public class PrintingMath {

	// entry point of program
	public static void main(String[] args) {
		
		// create scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// gets user input for the first number
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		
		// gets user input for the second number
		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt();
		
		/*
			just some interesting notes to take account to. you can print both text 
			and variables together with the + operator. however, you can also do 
			arithmatic operations with the + operator when printing. this can sometimes 
			end up printing something you don't want. for example you may just want to 
			print two numbers separately (not added) and they end up being added. or 
			vice versa where you want to print them added and they print the numbers 
			separately. I found that it is probably best to add parentheses around the 
			equation if you want to print the arithmetic, especially if there is a + 
			operator. if you want to print the numbers separately then you can separate 
			the numbers with some closed quotations between the two.
		*/

		// the numbers are not calculated and are printed separately
		System.out.println("Print both numbers: " + firstNum + "" + secondNum);
		// the numbers are added together and are then printed
		System.out.println("Print addition: " + (firstNum + secondNum));
		// the numbers are multiplied and then printed.
		// parantheses aren't needed but can be included
		System.out.println("Print multiplication: " + firstNum * secondNum);
		// the equation is surrounded by parentheses and the result is printed
		System.out.println("Print equation: " + ((firstNum + secondNum) * (firstNum - secondNum)));
		
		// terminates the user input stream
		sc.close();
	}

}
