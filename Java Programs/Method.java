package com.Jeff.handson;

import java.util.Scanner;

public class HandsOn {
	public static String middle(String s)
	{
		String t;
		int index;
		
		if (s.length() % 2 == 0)
		{
			index = s.length() / 2 - 1;
			t = s.substring(index, index+2);
			return t;
		}
		
		index = s.length() / 2;
		t = s.substring(index, index+1);
		return t;
	}
	
	public static void table(int start, int finish)
	{
		for (int i = start; i <= finish; i++)
		{
			for (int j = start; j <= finish; j++)
			{
				System.out.print((i+j) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("The middle character(s) in " + s + " is " + middle(s));
		
		System.out.println();
		System.out.print("Enter start of table: ");
		int start = sc.nextInt();
		System.out.print("Enter end of table: ");
		int end = sc.nextInt();
		
		System.out.println("Printing table:");
		table(start, end);
		
		sc.close();
	}
}