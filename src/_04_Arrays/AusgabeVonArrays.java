package _04_Arrays;

import java.util.Arrays;

public class AusgabeVonArrays {

	public static void main(String[] args) {
		System.out.println("\n*** Printausgabe von Arrays ***\n");
		
		int [][] values1 = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4},
				{5,5,5,5}
		};
		
		String [][] values2 = new String [5][7];
		var twodim_special = new String[5][];
		twodim_special[0] = new String[] { "A"};
		twodim_special[2] = new String[] { "B", "B" };
		twodim_special[4] = new String[] { "C", "C", "C" };

		System.out.println("--- Ausgabe eines 2-dimensionalem Integer-Array");
		printArray(values1);
		
		System.out.println("\n--- Ausgabe eines 2-dimensionalem String-Array");
		printArray(values2);
		
		System.out.println("\n--- Ausgabe eines 2-dimensionalem String-Array mit vorgegebner Array-Anzahl");
		printArray(twodim_special);
	}

	private static void printArray(final int[][] values) {
		for (int i = 0; i < values.length; i++)
			System.out.println(Arrays.toString(values[i]));
	}
	private static void printArray(final String[][] values) {
		for (int i = 0; i < values.length; i++)
			System.out.println(Arrays.toString(values[i]));
	}
}
