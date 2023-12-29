package _03_strings;

public class Beispiele {

	public static void main(String[] args) {
		System.out.println("\n*** Wandle bei einem vorgegebenen String jeden\n"
				+ "\tAnfangsbuchstaben in einen Großbuchstaben um ***");
		System.out.println("--------------------------------------------------------");

		System.out.println("\n--- Folgender Satz ist vorgegeben:");
		System.out.println("\tDies ist ein Titel für diese Übung");

		String input = "Dies ist ein Titel für diese Übung";
		String text = toTitleCase(input);
		System.out.println("\n------- Ausgabe ------");
		System.out.println(text);
		
		System.out.println("\n-----------------------------------------------------\n");
		String uebungsaufgabe = """
								
				\nÜBUNGSAUFGABE
				-------------
				Es soll die Länge eines Texts abgefragt werden,
				dann ein Zeichen an einer beliebigen Position, 
				etwa der 13., ermittelt und schließlich 
				geprprüft werden, ob ein gewünschtes 
				Wort im String enthalten ist.
				\r""";
		System.out.println("\n*** " + uebungsaufgabe + " ***");
		
		String nachricht = "Hallo lieber Leser! Viel Spaß mit Java!";
		System.out.println("\nFolgender Text ist vorgegeben:");
		System.out.println("\t" + nachricht);
		System.out.println("\nDie Länge des Textes ist: " + nachricht.length());
		System.out.println("Das 13. Zeichen im Text ist: " + nachricht.charAt(13));
		System.out.println("Enthält der Text das Wort 'Java'? " + nachricht.contains("Java"));
		
		System.out.println("\n-----------------------------------------------------\n");

		String uebungsaufgabe2 = """
								
				\nÜBUNGSAUFGABE 2
				---------------
				Bei dieser Aufgabe geht es darum, 
				die Buchstaben eines Worts gemäß ihrer Position 
				zu wiederholen.
				Aus ABC wird dann ABBCCC. 
				Lösung mit der Methode
				String repeatChars(String input).
				
				""";
		System.out.println("\n*** " + uebungsaufgabe2 + " ***");
		String nachricht2 = "ABC";
		
		System.out.println("\nFolgender Text ist vorgegeben:");
		System.out.println("\t" + nachricht2);
		System.out.println("Das Ergebnis ist: " + repeatChars(nachricht2));
	}

	static String toTitleCase(String input) {

		// Der Input wird in ein Char-Array umgewandelt
		char[] inputChars = input.toCharArray();

		// Das Flag 'capitalizeNextChar' ist true, wenn der nächste Buchstabe
		// umgewandelt werden soll
		boolean capitalizeNextChar = true;

		// Das Array wird durchlaufen
		for (int i = 0; i < inputChars.length; i++) {
			char currentChar = inputChars[i];

			// Der erste Buchstabe des Inputs wird auf jeden Fall groß geschrieben
			if (capitalizeNextChar) {
				inputChars[i] = Character.toUpperCase(currentChar);
			}

			capitalizeNextChar = shouldCapitalize(currentChar);
		}

		// Für die Rückgabe wird das Char-Array in einen String gecasted
		return new String(inputChars);
	}

	static boolean shouldCapitalize(char currentChar) {
		return Character.isWhitespace(currentChar) || currentChar == '-';
	}
	
	static String repeatChars(String input) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			result += ("" + current).repeat(i + 1); 
			// Aus einem char wird mit obigen Trick ein String, 
			// den man vervielfältigen kann
		}
		
		return result;
	}
}
