/* <applet code="squareWithLine" width=400 height=300></applet> */

import java.awt.*;
import java.applet.*;

public class SquareWithLine extends Applet{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255,115,115);
		
		setBackground(Color.CYAN);
		
		g.drawLine(25,25,105,25);
		g.drawLine(105,25,105,115);
		g.drawLine(105,115,25,115);
		g.drawLine(25,115,25,25);
		
		g.drawOval(50,55,30,30);
		g.setColor(c1);
		g.fillOval(50,55,30,30);
		
		g.setColor(Color.BLACK);
		
		g.drawOval(60,68,5,5);
		g.fillOval(60,68,5,5);
		
		g.drawLine(65,70,150,70);
		g.drawLine(65,70,70,60);
		g.drawLine(65,70,70,80);
	}
}