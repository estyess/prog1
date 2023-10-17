package prog1;

import java.util.Scanner;

public class scannerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hur gammal är du?");
		int tal1=input.nextInt();
		int tal2 = (int) (tal1/10);
		int tal3 = (tal2 + 1)*10;
		int tal4 = tal3-tal1;
		System.out.println("Oh! Du fyller " + tal3 + " om " + tal4 + " år! ");
		
	}
	
}
