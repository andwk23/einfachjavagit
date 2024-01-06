package _04_Arrays;

public class MehrdimensionaleArrays_2 {

	public static void main(String[] args) {
		System.out.println("""

				Beispiel:
				'#' steht für eine Begrenzungsmauer,
				'$' für einen einzusammelnden Gegenstand und
				'P' für den Spieler sowie
				'X' für den Ausgang aus einem Level

				""");

		final char[][] world = {"################".toCharArray(), 
								"## P          ##".toCharArray(),
								"#### $ X    ####".toCharArray(), 
								"###### $  ######".toCharArray(), 
								"################".toCharArray() };
		System.out.println("    --- Das Spielfeld ---");
		printArray(world);
	}

	public static void printArray(final char[][] values)
	{
	for (int y = 0; y < values.length; y++)
	{
		for (int x = 0; x < values[y].length; x++) {
			System.out.print(getAt(values, x, y) + " ");
		}
		System.out.println();
	}
	}
	public static char getAt(final char[][] values, final int x, final int y){
		return values[y][x];
	}

}
