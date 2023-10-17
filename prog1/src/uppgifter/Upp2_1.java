package uppgifter;

import java.util.Scanner;

public class Upp2_1 {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		double bas= input.nextInt();
		double höjd= input.nextInt();
		double area= (bas*höjd)/2;
		
		System.out.println("din area är " + area);
		
	}

}
