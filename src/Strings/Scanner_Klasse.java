package Strings;

import java.util.Scanner; 

public class Scanner_Klasse {
	
	public static void main(String[] args) {

		try (final Scanner scanner = new Scanner("Dies ist ein Text")){
			while(scanner.hasNext())
				System.out.print(scanner.next()+ " ");
		}
		System.out.println();
		try (final Scanner scanner1 = new Scanner("Version-2.17_45")){
			scanner1.useDelimiter("\\.|_|-");
			while(scanner1.hasNext()) {
				System.out.print(scanner1.next() + " ");
			}
		}
	}

}
