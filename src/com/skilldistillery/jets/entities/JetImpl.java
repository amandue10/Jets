package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl(String model, int speed, int range, long price) {
		super(model, speed, range, price);
		return;
	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nSpeed: " + getSpeed() + ", Range: " + getRange()
				+ ", Flight Time: " + (getRange() / getSpeed()) + " hours");
		System.out.println();
		System.out.println();

	}

}
