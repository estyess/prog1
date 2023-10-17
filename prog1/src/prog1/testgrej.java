package prog1;

import java.util.Scanner;

public class testgrej {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String namn=input.nextLine();
		int mellanslag=namn.indexOf(' ');
		char initialNamn=namn.charAt(0);
		char intialEnamn=namn.charAt(mellanslag+1);
		String efternamn = namn.substring(mellanslag+1);
		String förnamn=namn.substring(0,mellanslag);
		System.out.println("Namnet " + namn + " har initialerna " + initialNamn + "." + intialEnamn + " eftersom förnamnet är " + förnamn + " och efternamnet är " + efternamn);
	}
	
}
