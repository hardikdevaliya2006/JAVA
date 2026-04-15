import java.awt.*;

public class CenterScreenDemo extends java.applet.Applet{
	final Font f = new Font("Dubai Light",Font.BOLD,18);
	
	public void init()
	{
		
	}
	
	public void paint(Graphics g)
	{
		Dimension d = this.getSize();
		
		g.setColor(Color.YELLOW);
		
		g.fillRect(0,0,d.width,d.height);
		
		g.setColor(Color.RED);
		
		g.setFont(f);
		
		drawCenteredString("Mahadev Mahadev",d.width,d.height,g);
		
		g.drawRect(10,10,d.width-20,d.height-20);
	}
	
	public void drawCenteredString(String s,int w,int h,Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		
		int x = (w-fm.stringWidth(s))/2;
		
		int y = (fm.getAscent() + (h-fm.getAscent() + fm.getDescent())) / 2;
		
		g.drawString(s,x,y);
	}
}