package com.workshop;

import com.workshop.Duck;
import java.util.ArrayList;
import java.util.List;

public class workshop {
	List<Bird> birdList = new ArrayList<>();

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void printBirds() {
		for (Bird bird : birdList) {
//			if (bird instanceof Duck) {
//				((Duck) bird).fly();
//
//			}
//			if (bird instanceof Parrot) {
//				((Parrot) bird).fly();
//			}
//
//			if (bird instanceof Penguin) {
//				((Penguin) bird).fly();
//			}
			bird.fly();
		}

	}
}
