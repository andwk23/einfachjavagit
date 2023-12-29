package _04_Arrays;

public class SuchenInArrays {

	public static void main(String[] args) {
		System.out.println("""

				Die Methoden
				find(int[], int) und find2(int[], int)
				die in einem int-Array
				nach einem Wert sucht und dessen Position
				oder -1 für »nicht gefunden« liefert

				""");

		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Finde die 2 in der Zahlenreihe: " + find(numbers, 2));
		System.out.println("Finde die 42 in der Zahlenreihe: " + find2(numbers, 42));
	}

	public static int find(final int[] values, final int searchFor) {
		for (int i = 0; i < values.length; i++) {
			if (values[i] == searchFor) {
				return i;
			}
		}
		return -1;
	}
	
	public static int find2(final int[] values, final int searchFor) {
		int pos = 0;
		while (pos < values.length && values[pos] != searchFor) {
			pos++;
		}
		return pos >= values.length ? -1: pos;
	}
}
