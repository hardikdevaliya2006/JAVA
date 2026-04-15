/*<applet code="CheckboxDemo" height=300 width=300></applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CheckboxDemo extends Applet implements ItemListener{
	String msg = "";
	
	Checkbox sport,music,reading,writing;
	
	public void init()
	{
		sport = new Checkbox("SPORT",true);
		music = new Checkbox("MUSIC");
		reading = new Checkbox("READING");
		writing = new Checkbox("WRITING");
		
		add(sport);
		add(music);
		add(reading);
		add(writing);
		
		sport.addItemListener(this);
		music.addItemListener(this);
		reading.addItemListener(this);
		writing.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg = " Current State : ";
		g.drawString(msg,10,100);
		
		msg = " Sports : " + sport.getState();
		g.drawString(msg,10,120);
		
		msg = " Music : " + music.getState();
		g.drawString(msg,10,140);
		
		msg = " Reading : " + reading.getState();
		g.drawString(msg,10,160);
		
		msg = " Writing : " + writing.getState();
		g.drawString(msg,10,180);
	}
}