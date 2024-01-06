package _04_Arrays;

import java.util.Arrays;

public class Array_Inhalt_rotieren {

	public static void main(String[] args) {
		int [][] values = {
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};

		System.out.println("\n*** Das vorgegebene 2-dimensionale quadratische Array \n");
		
		for (int[] zeile: values) {
			for (int spalte: zeile) {
				System.out.print(Integer.toString(spalte) + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nSoll einmal nach links und einmal nach rechts um 90 Grad gedreht werden.");
		/*
		 * System.out.println("\nAnzahl Zeilen: " + Integer.toString(values.length));
		 * System.out.println("Anzahl Spalten: " + Integer.toString(values[0].length));
		 * System.out.println(Arrays.toString(values[0]));
		 * System.out.println((values[1][3]));
		 */
		
		System.out.println("\n--- Das 2-dimensioale quadratische Array nach links gedreht ---\n");
		printArray(rotate(values, true));
		System.out.println("\n--- Das 2-dimensioale quadratische Array nach rechts gedreht ---\n");
		printArray(rotate(values, false));
	}
	
	public static int[][] rotate(int[][] values, boolean rotateLeft){
		
		int maxSpalten = values[0].length - 1;
		int maxZeilen = values.length - 1;
				
		final int[][] rotatedArray = new int[maxZeilen + 1][maxSpalten+ 1];
		
		for (int y = 0; y < maxZeilen + 1; y++) {
			for (int x = 0; x < maxSpalten + 1; x++) {
				int origValue = values[y][x];
				if (rotateLeft) {
					rotatedArray[maxSpalten - x][y] = origValue;
				}
				else {
					rotatedArray[x][maxZeilen - y] = origValue;
				}
			}
		}
		
		return rotatedArray;
	}
	private static void printArray(final int[][] values)
	{
	for (int i = 0; i < values.length; i++)
		System.out.println(Arrays.toString(values[i]));
	}

}
