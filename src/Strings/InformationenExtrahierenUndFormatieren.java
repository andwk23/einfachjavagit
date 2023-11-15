package Strings;

import java.time.*;

public class InformationenExtrahierenUndFormatieren {

	public static void main(String[] args) {
		System.out.println("\n*** Informationen extrahieren und formatieren ***");
		System.out.println("-------------------------------------------------\n");		
		 
		System.out.println("\n--- Aufsplitten mit der Methode split(). Ergebnis in ein Array packen ---");
		String timestamp = "11:22:33";
		System.out.println("\n\tZeitangabe: " + timestamp);
		String[] parts = timestamp.split(":");
		System.out.print("\tparts = imestamp.split(\":\"): ");
		for(String x: parts) {
			System.out.print(x + " ");
		}
		
		String dateInfo = "23.11.2020";
		String[] dateParts = dateInfo.split("\\.");
		System.out.println("\n\nBesonderheit: der Punkt als Trennzeichen");
		System.out.println("\tDatumsangabe: " + dateInfo);
		System.out.print("\tdateParts = dateInfo.split(\"\\\\.\"): ");
		for(String x: dateParts) {
			System.out.print(x + " ");
		}
		
		System.out.println("\n\n-- Formatierte Ausgabe mit der Methode format()---");
		String text = String.format("Integer-Value: %d", 42);		
		System.out.println("Aus \n"
				+ "\ttext = String.format(\"Integer-Value: %d\", 42) => \n"
				+ "\t" + text);
		
		String text1 =  String.format("%s is %d years old. Birthday: %tD", "WK", 69, LocalDate.of(1954, 10, 11));
		System.out.println("Aus \n"
				+ "\ttext1 =  String.format(\"%s is %d years old. Birthday: %tD\", \"WK\", 69, LocalDate.of(1954, 10, 11)) => \n"
				+ "\t" + text1);
		System.out.println("\n*- Länge einer Ganzzahl mit %<Anzahl>d beschränken. -*");
		String text2 = String.format("Jahresgehalt = %10d", 1234567893);
		System.out.println("Aus \n"
				+ "\ttext2 = String.format(\"Jahresgehalt = %10d\", 1234567893);) => \n"
				+ "\t" + text2);
		System.out.println("\n*- Länge der Nachkommastellen einer Gleitzahl  mit %.<Anzahl>f beschränken. -*");
		String text3 = String.format("pi = %.2f", Math.PI);
		System.out.println("Aus \n"
				+ "\ttext3 = String.format(\"pi = %.2f\", Math.PI) => \n"
				+ "\t" + text3);
		
		System.out.println("--- Ausgabe mit System.out.printf() ---");
		System.out.printf("\t%s's birthday: %tD%n", "WK", LocalDate.of(1954, 10, 11));
	}}
