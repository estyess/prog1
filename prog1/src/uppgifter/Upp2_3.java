package uppgifter;

import java.util.Scanner;

public class Upp2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vad är ditt substantiv?");
		String substantiv= input.nextLine();
		System.out.println("Och vad är pluraländelsen av den?");
		String ändelse= input.nextLine();
		
		System.out.println("En " + substantiv + ", flera " + substantiv + "" + ändelse);
		
	}
	
}
