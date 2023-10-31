
public class Operatoren {

	public static void main(String[] args) {
		System.out.println("\n*** Operatoren ***");
		System.out.println("------------------\n");
		
		System.out.println("--- Arithmetische Operatoren ---");
		int x = 7;
		int y = 5;
		float v = 7.0f;
		float w = 5.0f;
		System.out.println("Addition:\t\t" + x + " + " + y + " = " + (x + y));
		System.out.println("Subtraktion:\t\t" + x + " - " + y + " = " + (x - y));
		System.out.println("Multiplikation:\t\t" + x + " * " + y + " = " + (x * y));
		System.out.println("Integer-Division:\t" + x + " / " + y + " = " + (x / y));
		System.out.println("Float-Division: \t" + v + " / " + w + " = " + (v / w));
		System.out.println("Modulo:\t\t\t" + x + " % " + y + " = " + (x % y));
		v = 7.44f;
		w = 5.55f;
		System.out.println("Float-Modulo:\t\t" + v + " % " + w + " = " + (v % w));
		
		System.out.println("\n--- Spezialfälle für das Inkrement bzw. Dekrement ---");
		int i = 0;
		int k = 1;
		int j = 0;
		int l = 0;
		System.out.println("Für i = " + i + " ist ++i: " + ++i);
		System.out.println("Für j = " + j + " ist j++ zuerst: " + j++ + " und dann: " + j);
		System.out.println("Für l = " + l + " ist (l++): " + (l++));

		System.out.println("\n--- Zuweisungsoperatoren ---");
		x = 0;
		System.out.println("Der Zuweisungsoperator'=' gibt dem Wert x = " + x + " mit x = x + 10 den Wert: " + (x + 10));
		x = 9;
		System.out.println("Kürzer geht es mit x += 10");
		System.out.println("Neben += gibt es noch die praxisrelevanten Varianten -=, *=, /= und %=");
		System.out.println("Es gibt darüber hinaus noch die Kurzformen &=, |=,^=, >>= und <<=");
		
		System.out.println("\n--- Vergleichsoperatoren ---");
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x == y: " + (x==y));
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x != y: " + (x!=y));
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x >  y: " + (x>y));
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x >= y: " + (x>=y));
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x <  y: " + (x<y));
		System.out.println("Für x = " + x + " und y = " + y + " ergibt x <= y: " + (x<=y));
		
		System.out.println("\n--- Logische Operatoren prüfen auf mehrere Bedingungen ---");
		int age = 18;
		int points = 127;
		System.out.println("\nGegeben sind folgende Vorgaben:\n\tAlter(age): " + age + "\n\tPunkte(points): " + points);
		
		System.out.println("\nFür 'age > 20 && points > 100' ==> " + (age > 20 && points > 100));
		System.out.println("Für 'age > 20 || points > 100' ==> " + (age > 20 || points > 100));
		System.out.println("Für '!(age > 20)' ==> " + !(age > 20));
	}

}
