package com.workshop;

import com.workshop.Duck;
import com.workshop.Penguin;
import com.workshop.Parrot;

public class main {
	public static void main(String[] args) {
		workshop sanctuary = new workshop();

		Parrot p = new Parrot();
		Duck d = new Duck();
		Penguin pn = new Penguin();

		sanctuary.add(p);
		sanctuary.add(d);
		sanctuary.add(pn);
		sanctuary.printBirds();

	}
}