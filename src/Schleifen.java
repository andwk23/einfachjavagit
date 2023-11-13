
public class Schleifen {

	public static void main(String[] args) {
		System.out.println("\n*** Schleifen in Java ***");
		System.out.println("-------------------------\n");
		
		System.out.println("\n--- Die for-Schleife ---");
		for (int i = 1; i < 6; i++) {
			System.out.println("Zahl " + i + " von 5");
		}
		System.out.println();
		for (int i = 1; i < 11; i+=2) {
			System.out.println(i + "(s)te ungerade Zahl");
		}
		
		System.out.println("\n--- Die for-each-Schleife ---");
		String[] names = { "Barbara", "Lilija", "Maria", "Sophie" };
		int k = 1;
		for (String currentName : names) {
			System.out.println(k + "(s)ter Name des Arrays: " + currentName);
			k +=1;
		}
		
		System.out.println("\n--- Die while-Schleife ---");
		while (true) {
			System.out.println("Die While-Schleife ist noch nicht abgebrochen!");
			break;
		}
		System.out.println("Abbruch nach einer 'break-Anweisung'");
		
		System.out.println("\n--- Die do-while-Schleife ---");
		int counter = 0;
		do {
			System.out.println((counter + 1) + " Noch keine 'break-Anweisung' gefunden");
			counter ++;
			if (counter == 4) {
				System.out.println("*-* Jetzt kommt die 'break-Anweisung'");
				break;
			}
		}while (true);
	}

}
