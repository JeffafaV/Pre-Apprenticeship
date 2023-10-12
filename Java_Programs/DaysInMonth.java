package com.Jeff.handson;
import java.time.LocalDate;
import java.util.Scanner;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		
		do
		{
			System.out.print("Enter year: ");
			int year = sc.nextInt();
			System.out.print("Enter month: ");
			int month = sc.nextInt();
			System.out.print("Enter day: ");
			int day = sc.nextInt();
			
			try
			{
				LocalDate ld = LocalDate.of(year, month, day);
				int daysInMonth = ld.lengthOfMonth();
				System.out.println("The number of days in " + ld + " is " + daysInMonth);
				b = false;
			}
			catch (Exception e)
			{
				System.out.println("Invalid input. Try again.");
			}
		} while (b == true);
		
		sc.close();
	}
}
