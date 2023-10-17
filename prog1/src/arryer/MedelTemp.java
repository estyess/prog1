package arryer;

import java.util.Arrays;
import java.util.Scanner;

public class MedelTemp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hur många tal ska du sortera?");
		
		int[] i = new int [input.nextInt()];
		
		System.out.println("Vilka är dina tal?");
		
		for(int k=0; k<i.length; k++) {
			i[k]=input.nextInt();
		}
		for(int om=0; om<i.length; om++) {
			
			for(int l=i.length-1; l>0; l--) {
				
				if(l>0) {
					if(i[l]<i[l-1]) {
						int lagr=i[l];
						i[l]=i[l-1];
						i[l-1]=lagr;
					}
				}
			}
		}
		
		System.out.println("Här är de, sorterade:");
		
		System.out.println(Arrays.toString(i));
		
	}
	
}
