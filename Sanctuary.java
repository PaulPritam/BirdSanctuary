package com.workshop;

import java.util.ArrayList;
import java.util.List;
import com.workshop.Penguin;



public class Sanctuary {
	 List<Object> birdList = new ArrayList<>();
	
	
	public static void main(String [] args)
	{
		 
		Parrot p = new Parrot();
		Duck d = new Duck();
		Penguin pn= new Penguin();
		
		workshop sanctuary = new workshop();
		sanctuary.birdList.add(p);
		sanctuary.birdList.add(d);
		sanctuary.birdList.add(pn);
		
		
		System.out.println(sanctuary.birdList);
	}
}


