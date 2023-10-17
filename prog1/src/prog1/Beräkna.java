package prog1;

import javax.swing.JOptionPane;

public class Beräkna {

	public static void main(String[] args) {
		
		String ageString = JOptionPane.showinputdialog("ange ålder");
		int age = Integer.parseInt(ageString);
		String heightString = JOptionPane.showinputdialog("ange ålder");
		int height = Integer.parseInt(ageString);
		System.out.println(age*height);
		
		
	}
}
