package uppgifter;

import java.util.Scanner;

public class Upp2_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad är ditt svenska ord?");
		String ord= input.nextLine();
		
		System.out.println("Och var är det på Engelska?");
		String word= input.nextLine();
		
		System.out.println("Ditt Svenska ord, " + ord + " är " + word + " på Engelska");
	}
	
}
