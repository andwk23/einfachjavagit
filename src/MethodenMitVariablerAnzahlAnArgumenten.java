
public class MethodenMitVariablerAnzahlAnArgumenten {
	
	public static String varArgsSum(String info, int... values) {
		
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return info + sum;
	}

	public static void main(String[] args) {
		System.out.println("\n*** Var Args – variable Anzahl an Argumenten ***");
		System.out.println("------------------------------------------------\n");
		
		System.out.println("Die Methode 'public static String varArgsSum(String info, int... values)'");
		System.out.println(varArgsSum("Summe ist: ", 1,2,3,4,5,6,7));

	}

}
