package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speed, int range, long price) {
		super(model, speed, range, price);

	}

	public void loadCargo() {
		System.out.println("Cargo Jet: Loaded");
	}
}
