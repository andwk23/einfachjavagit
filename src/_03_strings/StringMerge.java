package _03_strings;

public class StringMerge {

	public static void main(String[] args) {
		String stringmerge = """
				
				\nString Merge
				---------------
				Schreibe eine Methode 
				
				String stringMerge(String input1, String input2),
				
				die die beiden Texte Buchstabe für Buchstabe 
				miteinander verbindet.
				
				""";
		System.out.println("\n*** " + stringmerge + " ***");
		
		System.out.println("\n-------------------------------------------\n");
		String text1 = "First Try";
		String text2 = "Second Attempt";
		
		System.out.println("Folgende Texte sollen in einander verwoben werden:");
		System.out.println("\tText 1: " + text1);
		System.out.println("\tText 2: " + text2);
		
		System.out.println("Ergebnis: " + stringMerge(text1, text2));

	}
	
	static String stringMerge(String input1, String input2) {
		String result = "";
		
		int length1 = input1.length();
		int length2 = input2.length();

		int maxLength = Math.max(length1, length2);
		
		for (int i = 0; i < maxLength; i++) {
			if (i < length1)
			{
				result += input1.charAt(i);
			}

			if (i < length2)
			{
				result += input2.substring(i, i + 1);
			}
		}
		
		return result;
	}
}


