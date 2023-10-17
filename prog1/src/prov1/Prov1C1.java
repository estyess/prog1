package prov1;

import java.util.Scanner;

public class Prov1C1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ange täljare");
		double täljare = input.nextDouble();
		System.out.println("Ange nämnare");
		double nämnare = input.nextDouble();
		
		double total = täljare/nämnare; 
		int heltal = (int)total;
		double rest = täljare-(heltal*nämnare);
		
		System.out.println(heltal + " hel och " + rest + "/" + nämnare);
		
	}
}
