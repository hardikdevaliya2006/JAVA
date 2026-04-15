/*<applet code="ScrollbarRBG" height=400 width=400></applet>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollbarRBG extends Applet implements AdjustmentListener{
  
  Scrollbar redScrollbar,greenScrollbar,blueScrollbar;

  Label red,green,blue;

  public void init()
  {
    redScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
    greenScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
    blueScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
    
    red = new Label("Red : 0", Label.CENTER);
    green = new Label("Green : 0", Label.CENTER);
    blue = new Label("Blue : 0", Label.CENTER);
    
    add(red);
    add(redScrollbar);
    add(green);
    add(greenScrollbar);
    add(blue);
    add(blueScrollbar);
    
    redScrollbar.addAdjustmentListener(this);
    greenScrollbar.addAdjustmentListener(this);
    blueScrollbar.addAdjustmentListener(this);
  }

  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
	int r = redScrollbar.getValue();
	int g = greenScrollbar.getValue();
	int b = blueScrollbar.getValue();
	
	red.setText("Red : " + r);
	green.setText("Green : " + g);
	blue.setText("Blue : " + b);
	
	Color newColor = new Color(r,g,b);
	
	setBackground(newColor);
  }
}
