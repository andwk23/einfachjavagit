package Strings;

public class GebräuchlicheStringaktionen {

	public static void main(String[] args) {
		System.out.println("\n*** Gebräuchliche Stringaktionen ***");
		System.out.println("------------------------------------\n");
		
		System.out.println("--- Stringkonkatenation ---");
		String firstName = "Abcde";
		String lastName = "Fgehij";
		
		System.out.println("Mein Name ist: " + firstName + " " + lastName);

		System.out.println("\n--- Alternative Methode namens concat() ---");
		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println("Mein Name, zusammengefügt mit concat() ist: " + fullName);
		
		System.out.println("\n--- Groß- und Kleinschreibung ---");
		String message = "IMPORTANT: Please consult the doctor";
		System.out.println("String: " + message);
		System.out.println("String in Großbuchstaben: " + message.toUpperCase());
		System.out.println("String in Kleinbuchstaben: " + message.toLowerCase());
		
		System.out.println("\n--- Strings in Java unveränderliche Objekte ---");
		String hint = "Immutable String";
		System.out.println("String 'hint': " + hint);
		String result = hint.toUpperCase();
		System.out.println("String 'result' als Änderung von 'hint': " + result);
		
		System.out.println("\n--- Leerzeichen entfernen ---");
		String valueWithBlanks = " blanks at the beginning and the end ";
		System.out.println("String mit vielen Leerzeichen: '" + valueWithBlanks + "'");
		System.out.println("String mit Methode strip(): '" + valueWithBlanks.strip() + "'");
		System.out.println("String mit Methode stripleading(): '" + valueWithBlanks.stripLeading() + "'");
		System.out.println("String mit Methode stripTrailing(): '" + valueWithBlanks.stripTrailing() + "'");
		
		System.out.println("\n--- Länge ermitteln mit length()---");
		 
		String content = "This is a short message";
		System.out.println("String: " + content);
		System.out.println("Stringlänge: " + content.length());
	}

}
