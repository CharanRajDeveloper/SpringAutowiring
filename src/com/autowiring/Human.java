package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanheart")
	private Heart heart;

	/*
	 * no need to write setter or constructor if we are using @Autowired annotation
	 * before the dependency. public Human(Heart heart) { this.heart = heart; }
	 * 
	 * Human() { System.out.println("Human Constructor"); }
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart;
	 * System.out.println("Setter Method"); }
	 */
	public void display() {
		if (heart != null) {
			heart.pump();
			System.out.println(
					"Name of Animal is:" + heart.getNameofAnimal() + " No of heart is: " + heart.getNoofHeart());
		} else {
			System.out.println("You are dead");
		}

	}

}
