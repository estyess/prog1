package uppgifter;

import java.util.Scanner;

public class Upp2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double tal= input.nextDouble();
		int avrund = (int)(tal + 0.5);
		
		System.out.println(avrund);
		
	}
	
}
