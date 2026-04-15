/*<applet code="Smile" width=500 height=500></applet>*/

import java.awt.*;
import java.applet.*;

public class Smile extends Applet{
	public void paint(Graphics g)
	{
		setBackground(Color.GREEN);
		g.setColor(Color.YELLOW);
		g.fillOval(50,50,200,200);
		g.setColor(Color.BLACK);
		g.fillOval(100,100,30,30);
		g.fillOval(175,100,30,30);
		g.drawArc(100,150,100,50,0,-180);
	}
}