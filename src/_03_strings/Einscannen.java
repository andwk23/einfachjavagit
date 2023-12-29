package _03_strings;

import java.util.*;

public class Einscannen {

	public static void main(String[] args) {
		
		try (final Scanner scanner = new Scanner("Dies ist ein Text")){
			while (scanner.hasNext()){
				System.out.print(scanner.next() + " ");
			}
			System.out.println();
		}
		
		try(final Scanner scanner1 = new Scanner("Version-2.17_45")){
			scanner1.useDelimiter("\\.|-|_");
			while(scanner1.hasNext()) {
				System.out.print(scanner1.next() + " ");
			}
			System.out.println();
		}
		
		try(final Scanner scanner2 = new Scanner("Version:2:17.45\nLine2")){
			scanner2.useDelimiter(":|_|-|\\n");
			
			var text = scanner2.next();
			var intValue = scanner2.nextInt();
			var remaining = scanner2.next();
			System.out.print(text + " / " + intValue + " / " + remaining + " / " + scanner2.next());
			System.out.println();
}
		System.out.println("\n--- Daten zeilenweise mit Scaner verarbeiten ---\n");
		try (var scanner3 = new Scanner("Line1,Info\nLine2.Special\nLine3:Additional"))
		{
		var line1 = scanner3.nextLine();
		var line2 = scanner3.nextLine();
		var line3 = scanner3.nextLine();

		System.out.print(line1 + " / " + line2 + " / " + line3);
		System.out.println();
		}
		
		try (var scanner4 = new Scanner("Line1,Info\nLine2.Special\nLine3:Additional"))
		{
			while(scanner4.hasNextLine()) {
				System.out.print(scanner4.nextLine() + " - ");
				System.out.println();
			}
		}
		
		System.out.println("\n--- Eingabe von der Konsole verarbeiten ---");
		
		try(Scanner scanner5 = new Scanner(System.in)){
			String strVar = scanner5.next();
		}
		
}}
