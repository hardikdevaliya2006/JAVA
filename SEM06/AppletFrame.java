/*<applet code="AppletFrame" width=300 height=100></applet>*/

import java.awt.*;
import java.applet.*;

class SampleFrame extends Frame{
	SampleFrame(String title)
	{
		super(title);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This Is In The Frame Window",10,40);
		setBackground(Color.BLUE);
		setForeground(Color.ORANGE);
	}
}

public class AppletFrame extends Applet{
	
	Frame f;
	
	public void init()
	{
		f= new SampleFrame("This Is Frame Demo In Applet");	
		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public void start()
	{
		
	}
	public void stop()
	{
		f.setVisible(false);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This Is Applet Window",10,20);
		g.drawLine(10,25,130,25);
		g.setColor(Color.BLACK);
		g.drawString("This Is An Second Applet Window",10,40);
		setBackground(Color.RED);
		setForeground(Color.YELLOW);
	}
}