package com.Jeff.handson;
import java.util.ArrayList;
import java.util.Scanner;

class Customer
{
	public int id;
	public String name;
	public int age;
	public String email;
	public int salary;
	
	Customer(int i, String n, int a, String e, int s)
	{
		id = i;
		name = n;
		age = a;
		email = e;
		salary = s;
	}
}

interface Arr
{
	public ArrayList<Customer> arr(ArrayList<Customer> a);
}

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> c = new ArrayList<Customer>();
		c.add(new Customer(1,"Jeff",23,"jeff@email.com",5000));
		c.add(new Customer(2,"Elizabeth",24,"elizabeth@email.com",15000));
		c.add(new Customer(3,"Dominga",52,"dominga@email.com",1000));
		c.add(new Customer(4,"Lorenzo",53,"lorenzo@email.com",55000));
		c.add(new Customer(5,"Denise",28,"denise@email.com",51000));
		
		System.out.println("Printing all customers:");
		for (int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i).name + " $" + c.get(i).salary);
		}
		System.out.println();
		
		Arr rich = (cArr) -> {
			ArrayList<Customer> rCust = new ArrayList<Customer>();
			
			for (int i = 0; i < cArr.size(); i++)
			{
				if (cArr.get(i).salary > 50000)
				{
					rCust.add(cArr.get(i));
				}
			}
			
			return rCust;
		};
		
		ArrayList<Customer> r = rich.arr(c);
		
		System.out.println("Printing all customers with a salary over $50,000:");
		for (int i = 0; i < r.size(); i++)
		{
			System.out.println(r.get(i).name + " $" + r.get(i).salary);
		}
		
		sc.close();
	}

}