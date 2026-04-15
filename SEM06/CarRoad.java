/*<applet code="CarRoad" width=400 height=400></applet>*/

import java.awt.*;
import java.applet.*;

public class CarRoad extends Applet{
	public void paint(Graphics g)
	{
		Color c1 = new Color(255,100,100);
		Color c2 = new Color(100,100,255);
		
		setBackground(c1);
		
		g.setColor(Color.BLACK);
		
		g.fillRect(0,130,400,40);
		g.fillRect(180,0,40,305);
		
		g.setColor(Color.white);
		
		g.setColor(c2);
		
		g.fillRoundRect(384,152,20,8,2,2);
		g.fillRoundRect(0,140,20,8,2,2);
		g.fillRoundRect(190,50,8,20,2,2);
		g.fillRoundRect(202,250,8,20,2,2);
	}
}