
public class Kommentare {

	public static void main(String[] args) {
		System.out.println("\n*** Kommentare in Java ***");
		System.out.println("--------------------------\n");
		
		System.out.println("Zeilenkommentar mit '//':");
		int age = 21; // Angabe des Alters
		System.out.println("Zwischenkommentar und mehrzeiliger Kommentar mit '/* ...*/':");
		String text = /* Zwischen-Kommentar */ "Zwischenkommentar";
		/*
		 * Hier steht ein
		 * mehrzeiliger Kommentar!
		 */
		
		System.out.println("Javadoc-Kommentar zur Generierung einer ausführlichen Dokumentation mit '/** ...*/':");
		/**
		 * Javadoc-Kommentar
		 */

}
}