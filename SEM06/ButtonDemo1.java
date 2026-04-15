/*<applet code="ButtonDemo1" height=500 width=500></applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ButtonDemo1 extends Applet implements ActionListener{
	String msg = "";
	
	Button yes,no,NotDecided;
	
	public void init()
	{
		yes = new Button("YES");
		no = new Button("NO");
		NotDecided = new Button("NOTDECIDED");
		
		add(yes);
		add(no);
		add(NotDecided);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		NotDecided.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals("YES"))
		{
			msg = "You Pressed Yes...";
		}
		else if(str.equals("NO"))
		{
			msg = "You Are Pressed No..";
		}
		else{
			msg = "You Are Pressed Undecided..";
		}
		
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,10,150);
	}
}