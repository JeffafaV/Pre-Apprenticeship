import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter seconds: ");
		int seconds = sc.nextInt();
		
		int hours = seconds / 3600;
		seconds = seconds % 3600;
		
		int minutes = seconds / 60;
		seconds = seconds % 60;
		
		System.out.println("Hours = " + hours);
		System.out.println("Minutes = " + minutes);
		System.out.println("Seconds = " + seconds);
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		if (age < 1)
		{
			System.out.print("This person is an infant");
		}
		else if (age >= 1 && age < 3)
		{
			System.out.print("This person is a toddler");
		}
		else if (age >= 3 && age < 13)
		{
			System.out.print("This person is a child");
		}
		else if (age >= 13 && age < 18)
		{
			System.out.print("This person is a teenager");
		}
		else if (age >= 18 && age < 65)
		{
			System.out.print("This person is an adult");
		}
		else
		{
			System.out.print("This person is a senior");
		}
		
		sc.close();
	}

}
