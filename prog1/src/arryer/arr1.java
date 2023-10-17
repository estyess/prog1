package arryer;

import java.util.Arrays;

public class arr1 {
	public static void main(String[] args) {
		
		int [] i = new int [5]; //skapar en array med längden 5
		
		int längd = i.length; //tar reda på längden av i
		
		i[0] = 4; //tilldelar värde till olika positioner
		i[1] = 7;
		i[2] = 8;
		i[3] = 1;
		
		for(int k=0;k<5;k=k+1) {
			System.out.println(i[k]);
		}
		

	}
}
