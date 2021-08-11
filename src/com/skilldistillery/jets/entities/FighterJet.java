package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void dogFight() {
		System.out.println("Ready to dogfight!");

	}

}