/* <applet code="SwingDemo" width=500 height=500></applet> */

import java.io.*;
import javax.swing.*;

public class SwingDemo
{
	public static void main(String []args)
	{
		JFrame jf = new JFrame();
		
		JButton jb = new JButton("Mahadev");
		
		jb.setBounds(150,200,220,50);
		jf.add(jb);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}
}