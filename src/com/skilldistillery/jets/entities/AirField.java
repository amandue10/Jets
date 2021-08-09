package com.skilldistillery.jets.entities;

import java.util.List;

public class AirField {
	private List<Jet> jets;

	public AirField() {
		super();
	}

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public void listFleet() {
		// List jets in Airfield
		System.out.println("The fleet: ");

		for (int i = 0; i < jets.size(); i++) {
			System.out.print(i + 1 + ". " + jets.get(i));
		}
		System.out.println();
	}

	public void fly() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}
}

//		String fileName = "Jets.txt";
//		AirField pr = new AirField();
//		List<Jet> jets = pr.readJet(fileName);
//		System.out.println(jets);
//		String outFileName = "Jets.tsv";
//		pr.writeJets(outFileName, jets);

//	private void writeJets(String outFileName, List<Jet> Jets) {
//		try {
//			FileWriter fw = new FileWriter(outFileName);
//			PrintWriter pw = new PrintWriter(fw);
//			for (Jet j : jets) {
//				StringBuilder sb = new StringBuilder();
//				sb.append(j.getModel());
//				sb.append('\t');
//				sb.append(j.getSpeed());
//				sb.append('\t');
//				sb.append(j.getRange());
//				sb.append('\t');
//				sb.append(j.getPrice());
//				pw.println(sb);
//			}
//			pw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
