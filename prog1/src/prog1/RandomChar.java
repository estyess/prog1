package prog1;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class RandomChar {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("välj tecken nörd.");
//		String tal = input.nextLine();
//		char tal2 = tal.charAt(0);
//		int tal3 = (int)tal2;
//		System.out.println(tal3);
				
		int slump = (int)(Math.random()*26)+65;
		char slumpChar= (char)slump;
		
		int slump2 = (int)(Math.random()*26)+97;
		char slumpChar2= (char)slump2;
		
		int slump3 = (int)(Math.random()*26)+97;
		char slumpChar3= (char)slump3;
		
		int slump4 = (int)(Math.random()*26)+97;
		char slumpChar4= (char)slump4;
		
		System.out.println(slumpChar + "" + slumpChar2 + "" + slumpChar3 + "" +slumpChar4);
	}
	
}