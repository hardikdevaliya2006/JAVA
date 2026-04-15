/* <applet code="SwapTextfield" width=500 height=500>
 </applet>*/
 
 import java.awt.*;
 import java.applet.*;
 
 public class SwapTextfield extends Applet{
 	String FontName,Fstyle;
 	int FontSize;
 	float leading;
 	
 	
 	public void start()
 	{
 		String param;
 		
 		FontName = getParameter("FontName");
 		
 		if(FontName == null)
 		{
 			FontName = "Not Found";
 		}
 		
 		param = getParameter("Fstyle");
		
			
				Fstyle = getParameter(param);
			
			if(param == null)
			{
				Fstyle = "Not Found";
			}
 		
 		param = getParameter("FontSize");
 		
 		try
 		{
 			if(param != null)
 				FontSize = Integer.parseInt(param);
 			else
 				FontSize = 0;
 		}
 		catch(NumberFormatException e)
 		{
 			FontSize = -1;
 		}

		param = getParameter("leading");

		try
		{
			if(param != null)
			{
				leading = Float.valueOf(param).floatValue();
			}
			else
			{
				leading = 0;
			}
		}
		catch(NumberFormatException e)
		{
			leading = -1;
		}	
		
		
		//style = "Bold";		
 	}

	public void paint(Graphics g)
	{
		g.drawString("Font Name : " + FontName, 10, 10);
		g.drawString("Font Size : " + FontSize, 10, 40);
		g.drawString("Leading : " + leading, 10, 60);
		g.drawString("Style : " + Fstyle, 10, 80);
	}
 }