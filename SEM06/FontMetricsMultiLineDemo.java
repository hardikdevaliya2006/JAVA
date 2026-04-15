/* <applet code="FontMetricsMultiLineDemo" width=500 height=500></applet>*/

import java.awt.*;

public class FontMetricsMultiLineDemo extends java.applet.Applet{
	int curX=0, curY=0;
	
	public void init()
	{
		Font f = new Font("Times New Roman",Font.PLAIN,16);
		setFont(f);
	}
	
	public void paint(Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		nextLine("My name is darshan on line one",g);
		nextLine("Darshan is very clever on line two. ",g);
		sameLine("Darshan is also brilliant on same line. ",g);
		sameLine("Darshan is also sincear on same line",g);
		nextLine("Darshan is over all the great character on line three.",g);		
	}
	
	void nextLine(String str,Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		
		curY += fm.getHeight(); // go to next line
		curX = 0;
		g.drawString(str,curX,curY);
		curX = fm.stringWidth(str);
	}
	
	void sameLine(String s,Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		g.drawString(s,curX,curY);
		curX += fm.stringWidth(s);
	}
}