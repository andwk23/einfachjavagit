
public class Aufgabe_3_Selbstabholerrabatt {
	
	public static double preis(int anzahl, boolean selbstAbholer) {
		double betrag = 0;
		double preisPizza = 11.0;
		double rabatt = 0.1;
		double nachlass = 2.0;
		
		betrag = anzahl * preisPizza;
		if (anzahl >= 5) {
			betrag = betrag - (betrag * rabatt);
		}
		if (selbstAbholer == true) {
			betrag -= nachlass * anzahl;
		}
		
		
		return betrag;
	}

	public static void main(String[] args) {
		System.out.println("\n*** Aufgabe 3 ***");
		System.out.println("-----------------\n");
		
		System.out.println("--- Aufgabenstellung ---");
		System.out.println("In dieser Aufgabe sollen Sie für einen Pizzalieferservice die Preisberechnung implementieren. \n"
				+ "Nehmen wir vereinfachend an, jede Pizza koste 11€. Dabei gelten folgende\r\n"
				+ "Regelungen zum Rabatt. Wenn wir 5 oder mehr Pizzen bestellen, dann erhalten wir\r\n"
				+ "einen Rabatt von 10 %. Wenn wir die Pizzen selbst abholen, dann erhalten wir pro\r\n"
				+ "Pizza einen Nachlass von 2€. Schreiben Sie eine Methode, die den Rechnungsbetrag\r\n"
				+ "ermittelt");
		
		System.out.println("\n--- Lösung ---");
		int anzahlPizzen;
		boolean abholer = false;
		
		for(int count = 1; count <= 11; count += 2)
		{
			if (count==7) {
				System.out.println("Rechnungsbetrag für " + count + " Pizzen mit Selbstabholung: "+ preis(count, true));
			}else {
				System.out.println("Rechnungsbetrag für " + count + " Pizzen ohne Selbstabholung: "+ preis(count, false));
			}
		}

	}

}
