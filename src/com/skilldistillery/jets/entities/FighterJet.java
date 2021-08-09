package com.skilldistillery.jets.entities;

public abstract class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, int speed, int range, long price) {
		super(model, speed, range, price);
	}

}