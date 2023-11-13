
public class Aufgabe_2_Methode_und_if {
	
	public static String isNewHighscore(int punkte, int hpunkte) {
		if (punkte > hpunkte) {
			return "\nMit " + punkte + " ist ein neuer Highscore erreicht";
		}
		else {
			return "Ihre Punktzahl von " + punkte + " Punkten schlägt noch nicht\n"
					+ " den Highscore von " + hpunkte + " Punkten.";
		}
		
	}

	public static void main(String[] args) {
		System.out.println("\n*** Aufgabe 2 ***");
		System.out.println("-----------------\n");
		
		System.out.println("--- Aufgabenstellung ---");
		System.out.println("Schreiben Sie eine Methode, die einen Punktestand daraufhin prüft, ob dieser einen\r\n"
				+ "neuen Highscore darstellt. Das trifft dann zu, wenn die aktuelle Punktzahl größer als der\r\n"
				+ "momentane Highscore ist. In dem Fall soll eine Meldung auf der Konsole ausgegeben\r\n"
				+ "werden. Als Ausgangsbasis dienen folgende Anwei");
		
		System.out.println("\n--- Lösung ---");
		
		int points = 998;
		int highscore = 1000;
		
		System.out.println("Folgender Highscore ist zu schlagen: " + highscore + " Punkte.\n");
		while (points <= (highscore + 1)) {
			System.out.println(isNewHighscore(points, highscore));
			points++;
		}

	}

}
