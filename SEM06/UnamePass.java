/*<applet code="UnamePass" width=500 height=500></applet>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class UnamePass extends Applet implements ActionListener
{
	TextField name,pass;
	
	public void init()
	{
		Label uname = new Label("Name : " ,Label.RIGHT);
		Label vPass = new Label("Password : " ,Label.RIGHT);
		
		name = new TextField("Enter Name : ",12);
		pass = new TextField("Enter Password : ",8);
		
		pass.setEchoChar('*');
		
		add(uname);
		add(name);
		add(vPass);
		add(pass);
		
		name.addActionListener(this);
		pass.addActionListener(this);
	}

public void actionPerformed(ActionEvent ae)
{
	repaint();
}

public void paint(Graphics g)
{
	g.drawString("Name : " + name.getText(),10,60);
	g.drawString("Selected Text In Name : " + name.getSelectedText(),10,80);
	
	g.drawString("Password : " + pass.getText(),10,100);
	g.drawString("Selected Text In Pass : " + pass.getSelectedText(),10,120);
}

}