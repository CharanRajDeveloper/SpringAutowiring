package com.autowiring;

public class Heart {
	private String nameofAnimal;
	private int noofHeart;

	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNoofHeart() {
		return noofHeart;
	}

	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}

	Heart() {
		System.out.println("Heart Constructor");
	}

	public void pump() {
		System.out.println("Your Heart is Pumping...");
	}

}
