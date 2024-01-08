package _04_Arrays;

public class Aufgaben {

	public static void main(String[] args) {
		System.out.println("\n\t*** Aufgabe 1: Durcheinanderwürfeln eines Arrays ***");
		System.out.println("\t----------------------------------------------------\n");

		int[] zahlen = { 7, 4, 5, 2, 3, 10, 8, 9, 1, 6 ,12,11,15,13,14};

		System.out.println("\t--- Vorlagen-Array ---");
		System.out.print("\t  ");
		printArray(zahlen);
		shuffleArray(zahlen);
		System.out.println("\n\n\t--- Durcheinandergewürfeltes-Array ---");
		System.out.print("\t  ");
		printArray(zahlen);
		
		System.out.println("\n\n--------------------------------------------------------------------------\n");
		System.out.println("\n\t*** Aufgabe 2: Arrays kombinieren ***");
		System.out.println("\t-------------------------------------\n");
		
		int[] zahlen1 = { 7, 4, 5, 2, 3, 10, 8, 9, 1, 6};
		int[] zahlen2 = { 12,11,15,13,14};

		System.out.println("\t--- Vorlagen-Arrays ---");
		System.out.print("\t  ");
		printArray(zahlen1);
		System.out.print("\n\t  ");
		printArray(zahlen2);
		System.out.println("\n\tNach Konkatenation der beiden Arrays");
		System.out.print("\t  ");
		printArray(verbindeArrays(zahlen1, zahlen2));
		
		System.out.println("\n\n--------------------------------------------------------------------------\n");
		System.out.println("\n\t*** Aufgabe 3: Rotation um eine oder mehrere Positionen ***");
		System.out.println("\t-----------------------------------------------------------\n");
		
		int [] zahlen3 = {1,2,3,4,5,6};
		
		System.out.println("\t--- Vorlagen-Arrays ---");
		System.out.print("\t  ");
		printArray(zahlen3);
		
		System.out.println("\n\n\tNach Rechtsverschiebung der Elemente");
		System.out.print("\t  ");
		rotationRechts(zahlen3);
		printArray(zahlen3);
		
		System.out.println("\n\n\tNach 2-maliger Linksverschiebung der Elemente");
		System.out.print("\t  ");
		rotationLinks(zahlen3);
		rotationLinks(zahlen3);
		printArray(zahlen3);
		
		System.out.println("\n\n--------------------------------------------------------------------------\n");
		System.out.println("\n\t*** Aufgabe 4: Zweidimensionales String-Array ausgeben ***");
		System.out.println("\t---------------------------------------------------------\n");
		
		String [][] zahlen4 = {
				{"ONE"},
				{"TWO", "TWO"},
				{"Three","Three","Three"}
		};
		print2Dimension(zahlen4);

	}
	
	private static void print2Dimension(String[][] values) {
		for (int y = 0; y < values.length; y++) {
			System.out.print("Line " + y + ": ");
			for (int x = 0; x < values[y].length; x++) {
				System.out.print(values[y][x] + " ");
			}
			System.out.println();
		}
	}
	
	private static void rotationRechts(int[] values) {
		int ende = values.length - 1;
		int tmp = values[ende];
		
		for(int i = ende; i > 0; i--) {
			values[i] = values[i-1];
		}
		values[0] = tmp;
	}
	private static void rotationLinks(int[] values) {
		int ende = values.length - 1;
		int tmp = values[0];
		
		for(int i = 0; i < ende; i++) {
			values[i] = values[i+1];
		}
		values[ende] = tmp;
	}

	private static void printArray(int[] values) {
		for (int x = 0; x < values.length; x++) {
			System.out.print(values[x] + " ");
		}
	}

	private static void shuffleArray(int[] values) {
		int maxShuffle = Math.max(10, values.length / 3);

		for (int run = 0; run < maxShuffle; run++) {

			int pos1 = (int) (Math.random() * values.length);

			int pos2 = (int) (Math.random() * values.length);

			int tmp = values[pos1];
			
			values[pos1] = values[pos2];
			values[pos2] = tmp;

		}
	}
	
	private static int[] verbindeArrays(int[] values1, int[]values2) {
		// Bestimmung der einzelnen Arraylängen
		int  länge1 = values1.length;
		int  länge2 = values2.length;
		
		int posnew = 0;
		int[] result = new int[länge1 + länge2];
		
		for (int i = 0; i < länge1; i++) {
			result[posnew] = values1[i];
			posnew++;
		}
		for (int i = 0; i < länge2; i++) {
			result[posnew] = values2[i];
			posnew++;
		}
		
		return result;
	}
}
