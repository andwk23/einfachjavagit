
public class Aufgabe_7_Verschachtelte_Schleifen {

	public static void printNumberTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	
	public static void printTriangle(int row) {
		int j =1;
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
		}
	}
	
	public static void printLetterTriangle(int row) {
		char firstChar = 'A';
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(firstChar + " ");
			}
			firstChar++;
			System.out.println();
		}
		
	}
	
	public static  
	void printKShaped(int maxWidth) {
		for (int i = maxWidth -1; i >= 0; i--) {
			int letter = 65;
			for (int j=0; j <=i; j++) {
				System.out.print((char)(letter + j) + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < maxWidth; i++) {
			int letter = 65;
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(letter + j) + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		System.out.println("\n*** Aufgabe 7 ***");
		System.out.println("-----------------\n");
		
		System.out.println("--- Aufgabenstellung ---");
		System.out.println("Implementieren Sie eine Methode void printNumberTriangle(int row), \n"
				+ "die eine mehrzeilige Ausgabe bis zur übergebenen maximalen Zeilenanzahl wie folgt erzeugt:\r\n"
				+ "1\r\n"
				+ "1 2\r\n"
				+ "1 2 3");
		System.out.println("mehrere varianten\n");
	
		System.out.println("\n--- Lösung ---");

		int rows = 7;
		printNumberTriangle(rows);
		System.out.println();
		printTriangle(rows);
		System.out.println();
		printLetterTriangle(rows);
		System.out.println();
		printKShaped(6);
}}
