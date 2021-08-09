package com.skilldistillery.jets.entities;

public abstract class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speed, int range, long price) {
		super(model, speed, range, price);
		return;
	}

}