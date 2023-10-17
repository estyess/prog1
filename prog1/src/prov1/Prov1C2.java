package prov1;

import java.util.Scanner;

public class Prov1C2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange mail adress");
		String mail = input.nextLine();
		
		int punkt = mail.indexOf(".");
		int snabelA = mail.indexOf('@');
		
		String förnamn = mail.substring(0,punkt);
		String efternamn = mail.substring(punkt+1,snabelA);
		
		String efterSnabelA = mail.substring(snabelA+1);
		
		int punkt2 = efterSnabelA.indexOf('.');
		
		String domän = efterSnabelA.substring(0,punkt2);
		
		System.out.println("Förnamn: " + förnamn + "\nEfternamn: " + efternamn + "\nDomän: " + domän);
		
	}
}
