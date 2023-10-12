package com.Jeff.handson;
import java.util.ArrayList;
import java.util.Collections;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		System.out.println("Adding 5 employee IDs");
		ids.add(6377068);
		ids.add(6481312);
		ids.add(6134813);
		ids.add(5983861);
		ids.add(6142839);
		
		System.out.println("Printing 5 employee IDs:");
		for (int i = 0; i < ids.size(); i++)
		{
			System.out.print(ids.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Sorting 5 employee IDs");
		
		Collections.sort(ids, (id1, id2) -> (id1 > id2) ? -1 : (id1 < id2) ? 1 : 0);
		
		System.out.println("Printing 5 employee IDs:");
		for (int i = 0; i < ids.size(); i++)
		{
			System.out.print(ids.get(i) + " ");
		}
	}

}
