/*<applet code="SingleCarDemo" width=500 height=400></applet>*/

import java.awt.*;
import java.applet.*;

public class SingleCarDemo extends Applet{
	public void paint(Graphics g)
	{
		setBackground(Color.CYAN);
		g.setColor(Color.RED);
		g.fillRect(50,100,200,50);
		g.fillRect(75,75,150,50);
		g.setColor(Color.WHITE);
		g.fillRect(80,80,50,40);
		g.fillRect(170,80,40,40);
		g.setColor(Color.BLACK);
		g.fillOval(65,140,40,40);
		g.fillOval(195,140,40,40);			
	}
}