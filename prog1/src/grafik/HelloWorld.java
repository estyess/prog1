package grafik;

import java.awt.*;

import javax.swing.*;

public class HelloWorld extends JFrame{

	public HelloWorld() {
		
		JLabel text = new JLabel("hello world!");
		JButton knapp = new JButton("change text");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double vw = screenSize.getWidth();
		double vh = screenSize.getHeight();
		int vwInt = (int)vw;
		int vhInt = (int)vh;
		this.setVisible(true);
		System.out.println("hej");
		this.setSize(new Dimension(vwInt,vhInt));
		
		this.setLayout(new FlowLayout());
		this.add(text);
		this.add(knapp);
		
		knapp.addActionListener(e->{
			text.setText("DÖDAR FAMILJER");
		});
	}
	
	public static void main(String[] args) {
		
		new HelloWorld();
		
	}
}
