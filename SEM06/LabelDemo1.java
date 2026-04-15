/*<applet code="LabelDemo1" width=400 height=400></applet>*/

import java.awt.*;
import java.applet.*;

public class LabelDemo1 extends Applet{
    public void init()
    {
        Label l1 = new Label("Mahadev");
        Label l2 = new Label();
        Label l3 = new Label("Ma Momai",Label.CENTER);

        add(l1);
        add(l2);
        add(l3);

        l2.setText("Ganesh");
    }

    public void paint(Graphics g)
    {
        g.drawString("This Is First Label Demo",20,40);
    }
}
