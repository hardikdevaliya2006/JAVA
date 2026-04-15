import java.awt.*;
import java.applet.*;

public class DrawImg extends Applet
{
	Image img1;
	
	public void init()
	{
		img1 = getImage(getDocumentBase(),"mahakal.jpg");
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(img1,50,50,this);
	}
}