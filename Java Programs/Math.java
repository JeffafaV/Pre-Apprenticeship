import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt();
		
		System.out.println("Addition: " + (firstNum + secondNum));
		System.out.println("Division: " + firstNum / secondNum);
		System.out.println("Parantheses: " + ((firstNum + secondNum) * (firstNum - secondNum)));
		
		sc.close();
	}

}
