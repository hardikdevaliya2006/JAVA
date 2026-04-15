/* <applet code="" width=500 height=500></applet> */

import java.awt.*;
import java.applet.*;

public class Clock extends Applet{
	public void paint(Graphics g)
	{
		Color c1 = new Color(155,175,175);
		Color c2 = new Color(255,100,100);
		
		setBackground(c1);
		
		g.setColor(c2);
		g.fillOval(475,150,500,500);
		
		g.setColor(Color.BLACK);
		
		g.drawString("12",715,175);
		g.drawString("06",720,630);
		g.drawString("09",490,420);
		g.drawString("03",950,420);
		
		g.fillOval(720,410,5,5);
		g.drawLine(720,412,820,412);
		g.drawLine(721,412,721,200);
	}
}