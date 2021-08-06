package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
//upon start up of the application, populate the Airfield with at least 5 different
//types of jets. The jets will be read from a text fiel(Jets.txt)
// each line in the file contains data for a single jet object

public class JetsApplication {
	private AirField airField;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		menu(input);
	}

	public static void menu(Scanner input) {
		boolean goWhileTrue = true;

		do {
			System.out.println("Press 1 to list the fleet of jets");
			System.out.println("Press 2 to fly all jets");
			System.out.println("Press 3 to view fastest jet");
			System.out.println("Press 4 to view jet with longest range");
			System.out.println("Press 5 to load all cargo jets");
			System.out.println("Press 6 to DogFight");
			System.out.println("Press 7 to add a jet to the fleet");
			System.out.println("Press 8 to remove a jet from the fleet");
			System.out.println("Press 9 to quit");
			String menuChoice = input.next();

			switch (menuChoice) {
			case "1":

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;
			case "5":

				break;
			case "6":

				break;
			case "7":

				break;
			case "8":

				break;
			case "9":
				goWhileTrue = false;
				System.out.println("Come again, soon!");
				break;

			}

		} while (goWhileTrue);

	}

}
//this is the only class for this package
// DO not add additional class files.