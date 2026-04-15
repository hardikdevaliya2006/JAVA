/*<applet code="DrawLineWindow" width=100 height=100></applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class SampleFrame extends Frame{
	SampleFrame(String title)
	{
		super(title);
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(20,100,100,100);
		g.drawLine(30,60,30,110);
		setBackground(Color.RED);
		setForeground(Color.YELLOW);
	}
}

public class DrawLineWindow extends Applet{
	Frame f;
	
	public void init()
	{
		f = new SampleFrame("A Frame Window..");
		
		f.setSize(250,250);
		f.setVisible(true);
	}
	
	public void start()
	{
		f.setVisible(true);
	}
	
	public void stop()
	{
		f.setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		g.drawLine(10,100,150,100);
		g.drawLine(10,150,150,150);
		setBackground(Color.GREEN);
		setForeground(Color.BLUE);
	}
}