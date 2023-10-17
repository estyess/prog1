package uppgifter;

import java.util.Scanner;

public class Upp2_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double belopp = input.nextDouble();
		int femlappar = ((int)(belopp/500));
		int hundlappar = ((int)(((belopp-(femlappar*500))/100)+1));
		System.out.println("antal femhundra lappar: " + femlappar);
		System.out.println("antal hundra lappar: " + hundlappar);
		
		System.out.println("antal i femhundra lappar: " + 500*femlappar + "kr");
		System.out.println("antal hundra lappar: " + 100*hundlappar + "kr");
		
		System.out.println("totalt antal: " + ((500*femlappar)+(100*hundlappar)) + "kr");
	}
	
}