import java.math.*;

public class Methoden {
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void greet(String name) {
		System.out.println("Hallo " + name);
	}
	
	/*
	 * public static int minOf3(int x, int y, int z) { if (x < y) { if(x < z) {
	 * return x; } else return z; } else { if(y < z) return y; else return z; } }
	 */
	public static int min(int x, int y) {
		return x<y? x:y;
	}
	public static int minOf3(int x, int y, int z) {
		return min(x, min(y,z));
	}
	public static double randomRange(int base, int maxExclusive) {
		int maxRange = maxExclusive - base;
		return base + Math.random() * maxRange;	
	}
	
	public static int randomWuerfel(int base, int maxExclusive) {
		int maxRange = maxExclusive - base;
		return base + (int)(Math.random() * maxRange);	
		}
		

	public static void main(String[] args) {
		
		
		System.out.println("\n*** Methoden aus dem JDK nutzen ***");
		System.out.println("-----------------------------------\n");
		System.out.println("--- Die vordefinierte Methode repeat() ---");
		
		int anzahl = 5;
		String sternchen = "*";
		String bewertung = sternchen.repeat(anzahl);
		
		System.out.println("Für die Anzahl " + anzahl + " gibt die Anweisung str.repeat(anzahl)\n"
				+ "den String '*' 5-mal aus: " + bewertung);

		System.out.println("\n*** Eigene Methoden definieren ***");
		System.out.println("----------------------------------\n");
		System.out.println("--- Eigene Methoden mit return ---");
		
		int value1 = 10;
		int value2 = 22;
		int ergebnis = add(value1, value2);
		System.out.println("Die Addition mit der Methode add(): " + value1 + " + " + value2 + " = " + ergebnis);
		
		System.out.println("\n--- Eigene Methoden ohne return ---");
		String vorname = "Wiwi";
		System.out.println("Ausgabe der Methode greet(): ");
		greet(vorname);
		
		System.out.println("\n--- Kombination mit Bedingungen ---");
		int x = 15;
		int y = 7;
		int z = 3;
		System.out.println("Die Funktion minOf3() ergibt für die Zahlen (" + x + ", " + y + ", " +z + "]: " + minOf3(x,y,z));
		
		System.out.println("\n--- Nützliche Beispiele aus dem JDK ---");
		System.out.println("Berechne Math.max(x,y) von x = " + x + " und y = " + y + ": " + Math.max(x, y));
		System.out.println("Berechne Math.min(x,y) von x = " + x + " und y = " + y + ": " + Math.min(x, y));
		System.out.println("Berechne Math.sqrt(x) von x = " + x + ": " + Math.sqrt(x));
		System.out.println("Berechne Math.abs(x) von x = " + (-x) + ": " + Math.abs(-x));
		double randomNum = Math.random() * 100;
		System.out.println("Berechnung einer Float-Zufallszahl im Intervall [0,100) mit Math.random(): " + randomNum);
		System.out.println("Berechnung einer Float-Zufallszahl im Intervall [0,10) mit Methode randomRange(): " + randomRange(0,10));
		System.out.println("Berechnung einer Float-Zufallszahl im Intervall [15,105) mit Methode randomRange(): " + randomRange(15,105));
		
		System.out.println("\n--- Würfelmethode --- ");
		System.out.println("Es wurde eine " + randomWuerfel(1,6) + " gewürfelt.");
		
		
	}

}
