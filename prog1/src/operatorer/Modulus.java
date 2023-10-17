package operatorer;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Hur mycket ska du betala?");
		int pris = input.nextInt();
		
		System.out.println("Och hur mycket ger du?");
		int kundIn = input.nextInt();
		
		int pengRest = kundIn - pris;
		
		if(pengRest<0) {
			System.out.println("Du betalade inte nog med pengar");
		}
		else {
			
			int tusen = (int)pengRest/1000;
			int rest = pengRest%1000;
			int femhund = (int)rest/500;
				rest = rest%500;
			int tvåhund = (int)rest/200;
				rest = rest%200;
			int hund = (int)rest/100;
				rest = rest%100;	
			int femt = (int)rest/50;
				rest = rest%50;
			int tjug = (int)rest/20;
				rest = rest%20;
			int tio = (int)rest/10;
				rest = rest%10;
			int fem = (int)rest/5;
				rest = rest%5;
			int två = (int)rest/2;
				rest = rest%2;
			int en = (int)rest;

			System.out.println("Du får tillbaka:");
			if(tusen>1) {
				System.out.println(tusen + " tusenlappar");
			}else if(tusen==1) {
				System.out.println(tusen + " tusenlapp");
			}
			if(femhund>1) {
				System.out.println(femhund + " femhundralappar");
			}else if(femhund==1) {
				System.out.println(femhund + " femhundralapp");
			}
			if(tvåhund>1) {
				System.out.println(tvåhund + " tvåhundralappar");
			}else if(tvåhund==1) {
				System.out.println(tvåhund + " tvåhundralapp");
			}
			if(hund>1) {
				System.out.println(hund + " hundralappar");
			}else if(hund==1) {
				System.out.println(hund + " hundralapp");
			}
			if(femt>1) {
				System.out.println(femt + " femtiolappar");
			}else if(femt==1) {
				System.out.println(femt + " femtiolapp");
			}
			if(tjug>1) {
				System.out.println(tjug + " tjugolappar");
			}else if(hund==1) {
				System.out.println(tjug + " tjugolapp");
			}
			if(tio>1) {
				System.out.println(tio + " tiokronor");
			}else if(tio==1) {
				System.out.println(tio + " tiokrona");
			}
			if(fem>1) {
				System.out.println(fem + " femkronor");	
			}else if(fem==1) {
				System.out.println(fem + " femkrona");
			}
			if(två>1) {
				System.out.println(två + " tvåkronor");
			}else if(två==1) {
				System.out.println(två + " tvåkrona");
			}
			if(en>1) {
				System.out.println(en + " enkronor");
			}else if(en==1) {
				System.out.println(en + " enkrona");
			}

		}
		
	}
	
}
