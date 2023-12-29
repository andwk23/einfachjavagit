package _04_Arrays;

public class GebräuchlicheAktionen {

	public static void main(String[] args) {
		System.out.println("\n*** Arrays besitzen einen Typ, gefolgt von eckigen Klammern und einem Namen ***\n");
		System.out.println("--- Deklarieren eines Arrays ---");
		System.out.println("---------------------------------\n");
		System.out.println("--- Angabe der Werte in geschweiften Klammern.");
		String[] vornamen = { " Tim", " Tom", " Peter", " Mike" };
		
		for (int i = 0; i < vornamen.length; i++) {
			System.out.println(i + vornamen[i]);
		}
		
		System.out.println("\n--- Erzeugen einer neuen Array-Klasse mit Angabe der Elementanzahl");
		int[] prim = new int[4];
		prim[0] = 2;
		prim[1] = 3;
		prim[2] = 5;
		prim[3] = 7;
		for (int i = 0; i < prim.length; i++) {
			System.out.println(prim[i]);
		}

	}

}
