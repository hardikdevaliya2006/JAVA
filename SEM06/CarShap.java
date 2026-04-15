/*<applet code="CarShap" width=300 height=300></applet>*/

import java.awt.*;
import java.applet.*;

public class CarShap extends Applet
{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255,100,100);
		Color c2 = new Color(100,255,255);
		setBackground(Color.BLACK);
		g.setColor(c1);
		g.fillRoundRect(100,100,200,100,30,40);
		g.setColor(Color.WHITE);
		g.fillOval(120,185,50,50);
		g.fillOval(230,185,50,50);
	}
}