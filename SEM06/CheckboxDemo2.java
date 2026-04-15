/*<applet code="CheckboxDemo2" height=500 width=500></applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CheckboxDemo2 extends Applet implements ItemListener{
	String msg = "";
	
	CheckboxGroup gender = new CheckboxGroup();
	Checkbox male,female,others;
	
	public void init()
	{
		male = new Checkbox("MALE",true,gender);
		female = new Checkbox("FEMALE",false,gender);
		others = new Checkbox("OTHERS",false,gender);
		
		add(male);
		add(female);
		add(others);
		
		male.addItemListener(this);
		female.addItemListener(this);
		others.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg = "Current State : ";
		
		msg += gender.getSelectedCheckbox().getLabel();
		
		g.drawString(msg,10,200);
	}
}