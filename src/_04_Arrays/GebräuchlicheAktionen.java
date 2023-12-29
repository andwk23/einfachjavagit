package _04_Arrays;

import java.util.Arrays;

public class GebräuchlicheAktionen {

	public static void main(String[] args) {
		System.out.println("\n*** Arrays besitzen einen Typ, gefolgt von eckigen Klammern und einem Namen ***\n");
		System.out.println("--- Deklarieren eines Arrays ---");
		System.out.println("---------------------------------\n");
		System.out.println("--- Angabe der Werte in geschweiften Klammern.");
		String[] vornamen = { " Tim", " Tom", " Peter", " Mike" };
		
		System.out.println("\n--- Ausgabe des Arrays als Tupel");
		System.out.println(Arrays.toString(vornamen));
		
		System.out.println("\n--- Ausgabe mit for");
		for (int i = 0; i < vornamen.length; i++) {
			System.out.println(i + vornamen[i]);
		}
		
		System.out.println("\n--- Dynamischen Erzeugung und späteren Befüllung des Arrays ---");
		System.out.println("-----------------------------------------------------------------\n");
		int[] prim = new int[4];
		prim[0] = 2;
		prim[1] = 3;
		prim[2] = 5;
		prim[3] = 7;
		for (int i = 0; i < prim.length; i++) {
			System.out.println(prim[i]);
		}
		
		System.out.println("\n--- Dynamische Erzeugung verschiedener Längen ");
		int[] values = new int[computeNeededSize()];
		System.out.println("Das Array hat die Länge: " + (values.length));
		
		System.out.println("\n--- Verändern eines Elements");
		System.out.println("Gib für jedes String-Element (genannt currentname) aus den Werten von vornamen dessen Wert aus");
		vornamen[3] = " Michael";
		for (String currentname : vornamen) {
			System.out.println(currentname);
		}	
	
	}
	
	static int computeNeededSize() {
		return (int)(Math.random() * 1000);		
	}

}
