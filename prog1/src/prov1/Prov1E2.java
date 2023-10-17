package prov1;

import java.util.Scanner;

public class Prov1E2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Säg någonting");
		String mening = input.nextLine();
		
		int mellanslag = mening.indexOf(' ');
		String förstOrd = mening.substring(0, mellanslag);
		
		int tecken = mening.length();
		
		System.out.println("Mening: " + mening );
		System.out.println("Första ordet är : " + förstOrd );
		System.out.println("Meningen består av " + tecken + " tecken");
		
	}
	
}
