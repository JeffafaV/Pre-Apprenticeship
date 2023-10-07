package com.Jeff.handson;

class GetPost
{
	private String str;
	
	public String getStr()
	{
		return str;
	}
	
	public void postStr(String s)
	{
		str = s;
	}
}

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPost obj = new GetPost();
		
		System.out.println("Sending data");
		obj.postStr("hello");
		
		System.out.println("Accessing data");
		System.out.println(obj.getStr());
	}
}
