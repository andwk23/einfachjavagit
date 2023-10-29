
public class VariablenUndDatentypen {

	public static void main(String[] args) {
		
		// Strings
		System.out.println("\nBesonderer Typ String");
		System.out.println("---------------------\n");
		
		String vorname = "W";
		String nachname = "K";
		int value = 4711;
		char character = 'A';
		var PI = 3.1415;
		var name = "Michael";
		final double pi = 3.141592653589793;
		
		System.out.println("*** Genau wie Zahlen kann man auch Strings mit + verbinden."
				+ "Man spricht hier von Konkatenation. ***\n");		
		System.out.println("Vorname: " + vorname + "\n" + "Nachame: " + nachname);
		
		System.out.println("\n*** Ebenso kann man "
				+ "einen Zahlenwert mit einem String verknüpfen ***");
		System.out.println("\nWert: " + value);
		
		System.out.println("\nBesonderheit beim Typ char");
		System.out.println("--------------------------\n");
		System.out.println("Charakter: " + character);
		
		System.out.println("\n*** Mathematische Aktionen wie + und - mit dem Typ char ***");
		System.out.println("character + 5 = " + (character + 5));
		
		System.out.println("\n*** Casting mit char der Addition ***");
		System.out.println("(char)(character + 5) = " + (char)(character + 5));
		
		System.out.println("\nTyp-Kurzschreibweise var statt einer konkreten Typangabe ");
		System.out.println("---------------------------------------------------------\n");
		System.out.println("Pi = " + PI + "\nName = " + name);
		
		System.out.println("\nKonstanten – ﬁnale Variablen");
		System.out.println("----------------------------\n");
		System.out.println("Die Konstante pi auf 15 nachkommastellen genau: " + pi);
		
	}

}
