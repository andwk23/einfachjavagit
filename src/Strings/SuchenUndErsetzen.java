package Strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SuchenUndErsetzen {

	public static void main(String[] args) {
		System.out.println("\n*** Suchen und Ersetzen ****");
		System.out.println("----------------------------\n");
		
		System.out.println("*--- Suchen und Enthaltensein ---*");
		String maintext = "This is a secret message. Please do not distribute";
		System.out.println("\tString: " + maintext);
		System.out.println("\n--- Suchen mit Hilfe der Methoden indexOf() oder contains(). ---");
		System.out.println("str.indexOf(\"This\") liefert Index: " + maintext.indexOf("This"));
		System.out.println("str.indexOf('o') liefert Index: " + maintext.indexOf('o'));
		System.out.println("str.indexOf('z') liefert -1, da nicht in str enthalten: " + maintext.indexOf('z'));
		System.out.println("str.lastIndexOf('o') liefer Index vom Ende des Strings: " + maintext.lastIndexOf('o'));
		System.out.println("str.contains\"not\" zeigt an, ob der Teilstring enthalten ist: " + maintext.contains("not"));
		System.out.println("str.contains\"notation\" zeigt an, ob der Teilstring enthalten ist: " + "\t"
		+ maintext.contains("notation"));
		
		System.out.println("\n--- Weitersuchen nach Vorkommen mit indexOf() und Startposition ---");
		String info = "one second, one hour and one day";
		System.out.println("\tString: " + info);
		System.out.println("Erstes Vorkommen von \"one\" mit str.indexOf(\"one\"): " + info.indexOf("one"));
		System.out.println("Zweites Vorkommen von \"one\" mit str.indexOf(\"one\", 1): " + info.indexOf("one", 1));
		System.out.println("Drittes Vorkommen von \"one\" mit str.indexOf(\"one\", 13): " + info.indexOf("one", 13));
		
		System.out.println("\n--- Ersetzen von Inhalten ---");
		String greeting = "MOIN MOIN";
		System.out.println("\tString: " + greeting);
		System.out.println("Ersetzen mit str.replace('Moin','Grüezi'): " + greeting.replace("MOIN", "GRÜEZI"));
		System.out.println("Originalstring bleibt dabei erhalten: " + greeting);
		
		System.out.println("\n--- Komplexeres Ersetzen von Inhalten mit der Methode replaceAll()---");		 
		String infoRegEx = "ACC_AEC_MUSIC_ABC_AWARD";
		System.out.println("\tString: " + infoRegEx);
		System.out.println("Ersetzen von Text, der mit einem A beginnt,\n"
				+ "gefolgt von einem beliebigen Buchstaben (durch einen Punkt) \n"
				+ "und einem C oder D, \n"
				+ "durch einen Leerstring");
		System.out.println("\tinfoRegEx.replaceAll(\"A.[C,D]\", \"\"): " + infoRegEx.replaceAll("A.[C,D]", ""));
	}

}
