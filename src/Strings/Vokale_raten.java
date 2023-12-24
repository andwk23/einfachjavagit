package Strings;

public class Vokale_raten {

	public static void main(String[] args) {
		String aufgabe = """
				
				\nVokale raten
				---------------
				Als Erstes sollen in einem gegebenen String 
				mithilfe der selbst geschriebenen Methode
				
				String removeVowels(String input)
				
				alle Vokale entfernt werden. 
				Als Zweites soll eine Methode 
				
				String replaceVowels(String input)
				 
				implementiert werden, die einen Vokal durch ein '_' ersetzt.
				
				""";
		System.out.println("\n*** " + aufgabe + " ***");
		String raetsel = "Es Gibt Viel Zu Entdecken";
		System.out.println("\n---------------------------------------------\n");
		System.out.println("Folgender Text ist vorgegeben:");
		System.out.println("\t" + raetsel);
		
		String ohneVokale = removeVowels(raetsel);
		System.out.println("\nNach dem Entfernen der Vokale bleibt folgender Text:" +
				"\r" + ohneVokale);
		System.out.println("\n---------------------------------------------\n");
		String text = "Es gibt viel zu entdecken!";
		System.out.println("Folgender Text ist vorgegeben:");
		System.out.println("\t" + text);
		String mitUnterstrich = replaceVowels(text);
		System.out.println("\nNach dem Austausch der Vokale bleibt folgender Text:" +
				"\r" + mitUnterstrich);
				
	}
	
	static String removeVowels(String input) {
		
		String result = "";
		String resultUpper =input.toUpperCase();
		
		for (int i = 0; i < resultUpper.length(); i++) {
			char currentChar = resultUpper.charAt(i);
			if(!"AÄEIOÖUÜ".contains("" + currentChar)) {
				result += input.charAt(i);
			}
		}
		
		return result;
	}
	
	static boolean isVowel(char current) {
		return "AEIOUÄÖÜaeiouäöü".contains("" + current);
	}
	
	static String replaceVowels(String input) {
		String result = "";
		for (char currentChar : input.toCharArray()) {
			 if (isVowel(currentChar)) {
				 result += '_';
			 }
			 else {
				 result += currentChar;
			 }
		}
		
		return result;
	}

}
