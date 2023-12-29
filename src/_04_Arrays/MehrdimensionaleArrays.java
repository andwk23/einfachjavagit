package _04_Arrays;

import java.util.Arrays;

public class MehrdimensionaleArrays {

	public static void main(String[] args) {
		System.out
				.println("\n*** Ein mehrdimensionales Array ist ein Array, das ein oder mehrere Arrays enthält ***\n");

		int[][] twodim = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
		for (int[] zeile : twodim) {
			System.out.println(Arrays.toString(zeile));
		}

		System.out.println("\n--- Spezialfall: Nicht rechteckige Arrays ---");
		int[][] dreieck = { { 1 }, { 2, 2, }, { 3, 3, 3 } };
		for (int[] zeile : dreieck) {
			System.out.println(Arrays.toString(zeile));
		}

		System.out.println("\n--- Tauschen von Elementen in der Methode swap ---");
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("\n--- Experimente mit folgender Zahleneihe: " + Arrays.toString(numbers));
		swap(numbers, 2, 4);
		System.out.println("\n--- vertauschen der Zahlen 3 und 5: " + Arrays.toString(numbers));
		swap(numbers, 2, 4);
		swap(numbers, 2, 6);
		swap(numbers, 1, 7);
		swap(numbers, 0, 8);
		swap(numbers, 3, 5);
		System.out.println("\n--- Durch mehrmaliges Vertauschen erhalten wir die umgekehrte Reihenfolge: "
				+ Arrays.toString(numbers));
		System.out
				.println("\n*-* Array Reverse mit swap() - die Werte in einem Array in deren Reihenfolge tauschen *-*");
		System.out.println(
				"-------------------------------------------------------------------------------------------\n");
		int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("--- Experimente mit folgender Zahleneihe: " + Arrays.toString(numbers1));
		reverse(numbers1, 0, numbers.length - 1);
		System.out.println("\n--- Ausgabe der umgekehrten Zahleneihe: " + Arrays.toString(numbers1));
		System.out.println("\n--- Teilbereiche eines Arrays in seiner Reihenfolge umkehren:");
		reverse(numbers1, 2, 6);
		System.out.println("\n--- Ausgabe der in Teilbereichen umgekehrten Zahleneihe: " + Arrays.toString(numbers1));
		
		System.out.println("\n*-* Rekursive Variante *-*");
		System.out.println("--------------------------\n");
		int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("--- Experimente mit folgender Zahleneihe: " + Arrays.toString(numbers2));
		reverse(numbers2, 0, numbers.length - 1);
		System.out.println("\n--- Ausgabe der umgekehrten Zahleneihe: " + Arrays.toString(numbers2));
	}

	public static void swap(final int[] values, final int v1, final int v2) {
		final int value1 = values[v1];
		final int value2 = values[v2];

		values[v1] = value2;
		values[v2] = value1;
	}

	public static void reverse(final int[] values, int start, int end) {
		while (start < end) {
			swap(values, start, end);
			start++;
			end--;
		}
	}
	
	public static void reverseRec(final int[] values, int start, int end) {
		if (start < end) {
			swap(values, start, end);
			reverseRec(values, start + 1, end - 1);
		}
	}
}
