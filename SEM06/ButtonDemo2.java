/*<applet code="ButtonDemo2" height=500 width=500></applet>*/ 

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButtonDemo2 extends Applet implements ActionListener{
	String msg = "";
	
	Button red,green,blue;
	
	public void init()
	{
			red = new Button("RED");
			green = new Button("GREEN");
			blue = new Button("BLUE");
			
			add(red);
			add(green);
			add(blue);
			
			red.addActionListener(this);
			green.addActionListener(this);
			blue.addActionListener(this);
			
			red.setBackground(Color.RED);
			green.setBackground(Color.GREEN);
			blue.setBackground(Color.BLUE);
			
			red.setForeground(Color.BLACK);
			green.setForeground(Color.BLACK);
			blue.setForeground(Color.WHITE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals("RED"))
		{
			msg = "RED";
		}
		else if(str.equals("GREEN"))
		{
			msg = "GREEN";
		}
		else{
			msg = "BLUE";
		}
		
		repaint();
	}
	
	public void paint(Graphics g)
	{
		
		
		if(msg.equals("RED"))
		{
			setBackground(Color.RED);
			red.setBackground(Color.YELLOW);
			red.setForeground(Color.BLACK);
			green.setBackground(Color.GREEN);
			blue.setBackground(Color.blue);
		}
		else if(msg.equals("GREEN"))
		{
			setBackground(Color.GREEN);
			green.setBackground(Color.CYAN);
			green.setForeground(Color.BLACK);
			red.setBackground(Color.RED);
			blue.setBackground(Color.BLUE);
		}
		else if(msg.equals("BLUE"))
		{
			setBackground(Color.BLUE);
			blue.setBackground(Color.DARK_GRAY);
			blue.setForeground(Color.WHITE);
			red.setBackground(Color.red);
			green.setBackground(Color.green);
		}
		else{
			setBackground(Color.BLACK);
		}
	}
}