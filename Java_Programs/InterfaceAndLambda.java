package com.Jeff.handson;
import java.util.ArrayList;
import java.util.Scanner;

interface Arr {
	public ArrayList<Integer> arr(ArrayList<Integer> a);
}

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		System.out.println("Adding 5 employee salaries");
		for (int i = 0; i < 5; i++)
		{
			salaries.add(sc.nextInt());
		}
		
		System.out.println("Printing 5 employee salaries:");
		for (int i = 0; i < salaries.size(); i++)
		{
			System.out.print(salaries.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Doubling 5 employee salaries");
		
		Arr twice = (salArr) -> {
			for (int i = 0; i < salArr.size(); i++)
			{
				salArr.set(i, salArr.get(i)*2);
			}
			return salArr;
		};
		
		salaries = twice.arr(salaries);
		
		System.out.println("Printing 5 employee salaries:");
		for (int i = 0; i < salaries.size(); i++)
		{
			System.out.print(salaries.get(i) + " ");
		}
		
		sc.close();
	}

}