/*<applet code="ScrollBarDemo" width=400 height=400></applet>*/

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class ScrollBarDemo extends Applet implements AdjustmentListener{
    String msg = "";
    Scrollbar vertSB,horzSB;
    Font f1;

    public void init()
    {
        f1 = new Font("serif",Font.BOLD,22);

        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));

        vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);

        add(vertSB);
        add(horzSB);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        g.setFont(f1);
        g.drawString("Welcome To Scrollbar",100,100);

        msg = "Vertical Scrollbar value : " + vertSB.getValue();

        msg += " Horizontal Scrollbar value : " + horzSB.getValue();

        g.drawString(msg,106,160);
    }
}
