/* <applet code="DualWindowGraphics" width="300" height="300"></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
		
		/*MyWindowAdapter adaptor = new MyWindowAdapter(this);
		
		addWindowListener(adaptor);*/
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This Is In Frame Window",10,60);
		setBackground(Color.RED);
		setForeground(Color.BLUE);
	}
}

public class DualWindowGraphics extends Applet{
	Frame f;
	
	public void init()
	{
		f = new SampleFrame("A Fram Window...");
		
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
		g.drawString("This Is AN Applet Window",10,40);
		setBackground(Color.YELLOW);
		setForeground(Color.BLUE);
	}
}