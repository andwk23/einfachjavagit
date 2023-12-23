package Strings;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Klasse {

	public static void main(String[] args) {

		System.out.println("\n*** Einen String mit Scanner verarbeiten ***\n");

		try (final Scanner scanner = new Scanner("Dies ist ein Text")) {
			System.out.print("\t");
			while (scanner.hasNext())
				System.out.print(scanner.next() + " ");
		}
		System.out.println("\n");

		System.out.println("\n--- Die Funktion useDelimiter() zum Aufspalten eines Textes ---");
		System.out.println("\n");
		try (final Scanner scanner1 = new Scanner("Version-2.17_45")) {
			scanner1.useDelimiter("\\.|_|-");
			System.out.print("\t");
			while (scanner1.hasNext()) {
				System.out.print(scanner1.next() + " ");
			}
		}

		System.out.println("\n");

		try (final Scanner scanner2 = new Scanner("Version:2:17.45\nLine2")) {
			/*
			 * while(scanner2.hasNext()) { System.out.print(scanner2.next() + " "); }
			 */

			scanner2.useDelimiter(":|\\.|\\n");

			var text = scanner2.next();
			var intValue = scanner2.nextInt();
			var floatValue = scanner2.nextFloat();
			var remaining = scanner2.next();
			var remaining2 = scanner2.next();

			System.out.print("\t");
			System.out
					.println(text + " \\ " + intValue + " \\ " + floatValue + " \\ " + remaining + " \\ " + remaining2);

		}
		System.out.println("\n--- Daten zeilenweise (nextLine()) mit Scanner verarbeiten ---\n");
		try (var scanner = new Scanner("Line1,Info\nLine2.Special\nLine3:Additional")) {
			var line1 = scanner.nextLine();
			var line2 = scanner.nextLine();
			var line3 = scanner.nextLine();

			System.out.print("\t" + line1 + " / " + line2 + " / " + line3);

		}

		System.out.println("\n\n--- Eingabe von der Konsole verarbeiten ---\n");
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("- Einen Text eingeben:");
		String eingabeText = scanner.next();
		System.out.println("\tDer eingegebene Text: " + eingabeText);

		System.out.println("\n- Einen Integer eingeben:");
		int eingabeInt = scanner.nextInt();
		System.out.println("\tDer eingegebene Integer: " + eingabeInt);

		System.out.println("\n- Eine Zeile eingeben:");
		String eingabeZeile = scanner1.nextLine();
		System.out.println("\tDie eingegebene Zeile: " + eingabeZeile);

		System.out.println("\n- Eine Fließkommazahl eingeben:");
		double eingabeDouble = scanner.nextDouble();
		System.out.println("\tDie eingegebene Fließkommazahl: " + eingabeDouble);

		scanner.close();
		scanner1.close();

		System.out.println("\n*** Mehrzeilige Strings (Text Blocks)werden durch \n"
				+ "drei Anführungszeichen eingeleitet und abgeschlossen ***");
		String multiLineString = """
				\n\tZeile 1
				\tZeile 2 mit "Hochkommata"
				\tZeile 3 mit einfachen'Hochkommata'
				""";
		System.out.println("\n\tAusgabe eines mehrzeiligen Strings: " + multiLineString);
		System.out.println("\n--- Methoden für Strings funktionieren auch bei \n"
				+ "\tmehrzeiligen Strings ---\n");
		System.out.println("\tDie Länge des mehrzeiligen Strings: " + multiLineString.length());
		System.out.println("\tErsetzen von'Zeile' durch 'Line': " +
		multiLineString.replace("Zeile", "Line"));
		
		System.out.println("\n*** Platzhalter deﬁnieren und durch\r\n"
				+ "Aufruf von formatted() mit Werten befüllen ***");
		String platzhalter = """
				w %s hat am "%tF" 
				\t%d Bücher in %s gekauft. 
				""".formatted("K", LocalDate.of(2023, 11, 20), 3, "'Berlin'");
		System.out.println("\n\t" + platzhalter);
		
		System.out.println("\n*** Strings und char[]s -\r\n"
				+ "\tUmwandlung in ein char[] ***");
		String title = "Der Weg zum Java-Profi";
		System.out.println("\n\tOriginal-String: " + title);
		System.out.println("\n--- Ausgabe des Arrays (Array durch string.toCharArray())\n"
				+ "\tmit '-' als Trennzeichen ---\n");
		for (char ch : title.toCharArray()) {
			System.out.print(ch + "_");
		}
		System.out.println("\n\n-------------------------------------------------------------------\n");
		System.out.println("\n***---*** Änderungen in einem String über den Umweg\n"
				+ "\tin ein Array vornehmen ***---***\n");
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("---Der Ursprungs-String:\n\t" + alphabet);
		char[] asCharArray = alphabet.toCharArray();
		System.out.println("\n--- Das erzeugte Char-Array(charArray = string.toCharArray()):\t");
		System.out.println("\t" + Arrays.toString(asCharArray));
		
		modifyEvery3rdToUpper(asCharArray);
		
		System.out.println("\n--- Das Char-Array, nachdem mit Hilfe einer Funktion\n"
				+ "jeder 3te Buchstaben in einen Großbuchstaben umgewandelt wurde:");
		System.out.println("\t" + Arrays.toString(asCharArray));
		System.out.println("\n---Nach Aufruf des Konstruktors str = new String(char[])\n"
				+ "haben wir eine Änderung im Ursprungs-String:");
		String fromCharArray = new String(asCharArray);
		System.out.println("\t" + fromCharArray);
	}

	static void modifyEvery3rdToUpper(char[] values) {
		for (int i = 0; i < values.length; i+=3) {
			char current = values[i]; // Hilfsvariable
			values[i] = Character.toUpperCase(current);
		}
	}
}
