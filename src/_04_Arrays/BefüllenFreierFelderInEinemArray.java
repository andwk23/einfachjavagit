package _04_Arrays;

import java.util.Arrays;

public class BefüllenFreierFelderInEinemArray {

	public static void main(String[] args) {
		System.out.println("\n*** Ausfüllen freier Felder in quadratischen 2-dimensinalen Arrays ***\n");
		char[][ ] newWorld = firstWorld();
		System.out.println("Folgendes Feld ist vorgegeben");
		printArray(newWorld);
		floodFill(newWorld, 1, 1);
		System.out.println();
		printArray(newWorld);
	}

	private static char[][] firstWorld()
	{
	return new char[][] { 
		"   #  ".toCharArray(),
		"  #   ".toCharArray(),
		"#   # ".toCharArray(),
		" #  # ".toCharArray(),
		"    # ".toCharArray()};
	}
	private static void printArray(final char[][] values)
		{
		for (int y = 0; y < values.length; y++)
		{
			for (int x = 0; x < values[y].length; x++)
		{
				System.out.print(values[y][x] + " ");
		}
			System.out.println();
		}
	}
	
	private static void floodFill(final char[][] values, final int x, final int y) {
		if (x < 0 || y < 0 || y >= values.length || x >= values[y].length){
			return;
		}
		if (values[y][x] == ' ') {
			values[y][x] = '#';
			floodFill(values, x, y-1);
			floodFill(values, x+1, y);
			floodFill(values, x, y+1);
			floodFill(values, x-1, y);
		}
	}
	private static boolean isOnBoard(final char[][] values,	final int posX, final int posY)
			{
				return posX >= 0 && posY >= 0 && posX < values[0].length && posY < values.length;
			}
}
