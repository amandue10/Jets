package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> jets;
	private String filePath;

	public AirField() {
		super();
	}

	public AirField(String path) {
		jets = new ArrayList<>();
		filePath = path;
	}

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public void listFleet() {
		// List jets in Airfield
		System.out.println("The fleet: \n");

		for (int i = 0; i < jets.size(); i++) {
			System.out.println(i + 1 + ". " + jets.get(i));
			System.out.println();
		}
	}

	// Fly Method
	public void fly() {
		System.out.println("Flying All Jets...\n");
		for (Jet jet : jets) {
			jet.fly();
		}
	}

// View Fastest jet
	public void viewFastestJet() {
		Jet fastestJet = jets.get(0);
		for (Jet jet : jets) {
			if (fastestJet.getSpeed() < jet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println("Fastest jet in the fleet: \n");
		System.out.println(fastestJet);
		System.out.println();

	}

	public void viewLongestRangeJet() {
		Jet longestRangeJet = jets.get(0);
		for (Jet jet : jets) {
			if (longestRangeJet.getRange() < jet.getRange()) {
				longestRangeJet = jet;
			}
		}
		System.out.println("Jet with longest range in the fleet: \n");
		System.out.println(longestRangeJet);
		System.out.println();

	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public void viewAllCargoJets() {
		Jet cargoPlane = jets.get(0);
		CargoPlane cargoPlane2 = new CargoPlane(null, 0, 0, 0);

		System.out.println("The Cargo Jets in the fleet are: \n");
		for (Jet jet : jets) {
			if (cargoPlane.getModel().contains("C.T")) {
				cargoPlane = jet;
				System.out.println(jet);
//				System.out.println();
				cargoPlane2.loadCargo();
				System.out.println();

			} else {
				continue;
			}
		}

	}

	public void dogFight() {
		Jet fighterJet = jets.get(0);
		FighterJet fighterJet2 = new FighterJet(null, 0, 0, 0);

		for (Jet jet : jets) {
			if (fighterJet.getModel().contains("F")) {
				fighterJet = jet;
				System.out.println(jet);
				fighterJet2.dogFight();
				System.out.println();
			} else {
				continue;
			}
		}

	}

	public void addJetToFleet() {

		JetImpl createdJet = new JetImpl(filePath, 0, 0, 0);

		Scanner inputForJet = new Scanner(System.in);

		System.out.println("Please add a model: ");
		String model = inputForJet.next();
		createdJet.setModel(model);

		System.out.println("Please add a speed: ");
		int speed = inputForJet.nextInt();
		createdJet.setSpeed(speed);

		System.out.println("Please add a range: ");
		int range = inputForJet.nextInt();
		createdJet.setRange(range);

		System.out.println("Please add a price: ");
		long price = inputForJet.nextLong();
		createdJet.setPrice(price);

		addJetToArray(createdJet);

	}

	private void addJetToArray(Jet createdJet) {
		jets.add(createdJet);

	}

	public void removeJetFromFleet() {

		System.out.println("Which jet would you like to remove from the fleet?\n");
		listFleet();
		System.out.println();
		System.out.println("Enter the number corresponding to the jet "
				+ "you would like to remove. Start counting the jets in the list " + "starting from 0");
		System.out.print("Remove Jet in slot: ");
		Scanner scanner = new Scanner(System.in);
		int index = Integer.parseInt(scanner.next().toString());
		jets.remove(index);
		System.out.println();
		System.out.println("Remaining jets: ");
		listFleet();
//		scanner.close(); causes bugs

	}

}
