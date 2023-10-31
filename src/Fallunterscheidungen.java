
public class Fallunterscheidungen {

	public static void main(String[] args) {
		System.out.println("\n*** Fallunterscheidungen ***");
		System.out.println("----------------------------");
		
		System.out.println("\n--- Bedingte Ausführung mit if ---");
		int age = 27;
		System.out.println("\n\tAlter(age) = " + age);
		
		if (age > 18) {
			System.out.println("Du darfst Autofahren ...");
			System.out.println("... da Du über 18 Jahre alt bist.");
		}
		
		System.out.println("\n--- Der ternäre Operator oder auch ?-Operator --");
		String result = (age > 18) ? "Führerschein machen erlaubt" : "Noch kein Führerschein erlaubt";
		System.out.print("Für Alter = " + age);
		System.out.println(" erfolgt aus:\n\t(age > 18) ? \"Führerschein machenerlaubt\" : \"Noch kein Führerschein erlaubt\"");
		System.out.println(result);
	}

}
