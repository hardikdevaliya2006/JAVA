/*<applet code="ButtonList" height=300 width=300></applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButtonList extends Applet implements ActionListener{
	String msg = "";
	
	Button bList[] = new Button[3];
	
	public void init()
	{
		Button yes = new Button("YES");
		
		Button no = new Button("NO");
		
		Button NotDecided = new Button("UNDECIDED");
		
		bList[0] = (Button)add(yes);
		bList[1] = (Button)add(no);
		bList[2] = (Button)add(NotDecided);
		
		for(int i=0;i<3;i++)
		{
			bList[i].addActionListener(this);
		}
	}


	public void actionPerformed(ActionEvent ae)
	{
		for(int i=0;i<3;i++)
		{
			if(ae.getSource() == bList[i])
			msg = "You Pressed : " + bList[i].getLabel();
			
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,20,180);
	}
}