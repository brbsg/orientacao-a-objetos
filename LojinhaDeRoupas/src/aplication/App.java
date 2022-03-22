package aplication;
import java.awt.*;

import javax.swing.*;

public class App {

	
	public static void main(String[] args ) {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)size.getWidth();
        int height = (int)size.getHeight();
		
		
		JFrame frame = new JFrame("Lojinha da Esquina");
		
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel header = new JPanel();
		header.setBackground(Color.decode("#666666"));
		header.setBounds(20, 20, 20, 20);
		
		
		
		frame.add(header);	
		
		frame.setVisible(true);
	}
	
}
 