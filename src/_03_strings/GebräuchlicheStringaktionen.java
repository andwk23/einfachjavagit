package _03_strings;

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
		
		System.out.println("\n--- Auf leeren String prüfen ---");		 
		String noContent = "";
		System.out.println("Die Methode isEmpty() ergibt für '': " + noContent.isEmpty());
		System.out.println("Die Methode isBlank() ergibt für '': " + noContent.isBlank() );
		System.out.println("Die Methode isEmpty() ergibt für ' \\t': " + " \t".isEmpty());
		System.out.println("Die Methode isBlank() ergibt für ' \\t': " + " \t".isBlank() );
		System.out.println("Die Methode strip().isEmpty() ergibt für ' \\t': " + " \t".strip().isEmpty());
		
		System.out.println("\n--- Auf einzelne Zeichen zugreifen ---");
		System.out.println("String: " + content);
		System.out.println("String-Index 0 mit str.charAt(0): " + content.charAt(0) );
		System.out.println("String-Index 2 mit str.charAt(2): " + content.charAt(2) );
		
		System.out.println("\n--- Teilbereiche extrahieren mit der substring()-Methode ---");
		String info = "Dies ist ein String. Rest ABC";
		System.out.println("String: " + info);
		System.out.println("Ersten 4 Zeichen mit str.substring(0,4): " + info.substring(0,4));
		System.out.println("Teilbereich 9tes bis 18tes Zeichen mit str.substring(9,19): " + info.substring(9,19));
		System.out.println("Teilbereich ab 19tem Zeichen mit str.substring(19): " + info.substring(19));
		
		System.out.println("\n--- Strings wiederholen mit repeat()-Methode ---");
		String greeting = "MOIN-";
		System.out.println("String: " + greeting);
		System.out.println("str.repeat(4): " + greeting.repeat(4));


	}

}
