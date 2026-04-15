/*<applet code="CreatingSelectingFont" width=300 height=300></applet>*/

import java.awt.*;
import java.applet.*;

public class CreatingSelectingFont extends Applet{
	Font f1,f2,f3;
	
	public void init()
	{
		f1 = new Font("Candara",Font.PLAIN,18);
		
		f2 = new Font("Dubai",Font.BOLD,20);
		
		f3 = new Font("Century",Font.BOLD/Font.ITALIC,22);
	}
	
	public void paint(Graphics g)
	{
		g.setFont(f1);
		g.drawString("This Is A Plain Candara Font",10,20);
		
		g.setFont(f2);
		g.drawString("This Is A Bold Dubai Font",10,50);
		
		g.setFont(f3);
		g.drawString("This Is A Bold / Italic Century Font",10,90);
	}
}