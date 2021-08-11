package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {

	private Scanner kb;
	private AirField airField;
	private int menuChoice;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.kb = new Scanner(System.in);
		jetsApp.run();
		jetsApp.kb.close();

	}

	// Main app execution
	private void run() throws FileNotFoundException, IOException {
		initiateApplication();

		do {
			printMenuChoices();
			menuSwitch();
		} while (menuChoice != 9);
	}

	private void initiateApplication() throws FileNotFoundException, IOException {
		List<Jet> jetsList = populateJetsFromFile();
		airField = new AirField(jetsList);
	}

	private void menuSwitch() {
		switch (menuChoice) {
		case 1:
			airField.listFleet();
			break;
		case 2:
			airField.fly();
			break;
		case 3:
			airField.viewFastestJet();
			break;
		case 4:
			airField.viewLongestRangeJet();
			break;
		case 5:
			airField.viewAllCargoJets();
			break;
		case 6:
			airField.dogFight();
			break;
		case 7:
			airField.addJetToFleet();
			break;
		case 8:
			airField.removeJetFromFleet();
			break;
		case 9:
			System.out.println("You've chosen to quit.");
			break;
		default:
			System.out.println("Invalid option.");
			System.out.println();
			break;

		}
	}

	private void printMenuChoices() {
		System.out.println("1. List Fleets");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View Jet With Longest Range");
		System.out.println("5. Load All Cargo Jets");
		System.out.println("6  Dog Fight!");
		System.out.println("7. Add Jet To Fleet");
		System.out.println("8. Remove Jet From Fleet");
		System.out.println("9. Quit");
		System.out.println("------------------------------");
		System.out.println("Enter Choice: ");

		try {
			menuChoice = kb.nextInt();
		} catch (InputMismatchException e) {
		}
		System.out.println();

	}

	private List<Jet> populateJetsFromFile() throws IOException {

		boolean successfulFileIO = false;
		String fileName = "";
		// Declare outside the try/catch.
		List<Jet> jets = new ArrayList<>();
		do {
			fileName = "JetList.txt";

			try {
				FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					String[] jetRecord = line.split(", ");
					String model = jetRecord[0];
					int speed = Integer.parseInt(jetRecord[1]);
					int range = Integer.parseInt(jetRecord[2]);
					long price = Long.parseLong(jetRecord[3]);
					JetImpl jet = new JetImpl(model, speed, range, price);
					jets.add(jet);
				}
				System.out.println("Jets in fleet: Loaded");
				System.out.println(" ");
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println();
			}
		} while (successfulFileIO);
		return jets;

	}

}
