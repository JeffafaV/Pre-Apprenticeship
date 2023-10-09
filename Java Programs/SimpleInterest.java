package com.Jeff.handson;

import java.util.Scanner;

public class HandsOn {
	public static double fv(double cv, double air, double t)
	{
		return cv * (1 + air * t);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Simple interest calculator for investments");
		
		System.out.print("Enter current value of investment: ");
		double curVal = sc.nextDouble();
		
		System.out.print("Enter annual interest rate (in decimal): ");
		double inRate = sc.nextDouble();
		
		System.out.print("Enter time holding investment (in years): ");
		double time = sc.nextDouble();
		
		System.out.println("The future value of this investment will be $" + fv(curVal, inRate, time));
		
		sc.close();
	}
}