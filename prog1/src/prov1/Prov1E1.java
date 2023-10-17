package prov1;

import java.util.Scanner;

public class Prov1E1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hur bred är din rektangel?");
		double x = input.nextDouble();
		System.out.println("Hur hög är din rektangel?");
		double y = input.nextDouble();
		
		double area = x*y;
		
		System.out.println("Din rektangel har arean " + area + " areaenheter");
		
	}
}
