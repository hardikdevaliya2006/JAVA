import javax.swing.*;
import java.awt.*;

public class SwingExample
{
	public static void main(String []args)
	{
		JFrame jf = new JFrame("JFrame, JPanel Example");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		
		jp.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("Mahadev");
		
		JButton b1 = new JButton("Mahadev Mahadev");
		
		jp.add(l1);
		jp.add(b1);
		
		jf.add(jp);
		
		jf.setSize(500,500);
		
		jf.setVisible(true);
	}
}