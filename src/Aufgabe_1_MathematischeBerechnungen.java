
public class Aufgabe_1_MathematischeBerechnungen {

	public static void main(String[] args) {
		System.out.println("\n*** Aufgabe 1 ***");
		System.out.println("-----------------\n");
		
		System.out.println("--- Aufgabenstellung ---");
		System.out.println("Nehmen wir an, wir hätten eine Spedition. Wir bekommen nun einen Großauftrag und\r\n"
				+ "müssen 1.000 Kisten ausliefern. In unseren Lkw passen pro Fahrt jedoch nur 75 Kisten.\r\n"
				+ "Berechnen Sie, wie oft wir fahren müssen und wie viele Kisten in der letzten Fahrt\r\n"
				+ "transportiert werden. Verwenden Sie sprechende Variablennamen");
		int anzahlKisten = 1000;
		int maxLadung = 75;
		int anzahlFahrten = anzahlKisten / maxLadung;
		int restMenge = (anzahlKisten % maxLadung);
		
		System.out.println("\n--- Lösung ---");
		if (restMenge != 0) {
			anzahlFahrten ++;
		}
		System.out.println("Es sind " + anzahlFahrten + " Fahrten notwendig.");
		System.out.println("Bei der letzten Fahrt werden " + restMenge + " Kisten transportiert.");

	}

}
