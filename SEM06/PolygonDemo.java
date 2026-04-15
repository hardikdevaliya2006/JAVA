/* <applet code="PolygonDemo" width=300 height=300></applet> */

import java.awt.*;
import java.applet.*;

public class PolygonDemo extends Applet {
    public void paint(Graphics g)
    {
        int xPoints[] = {30, 200, 30, 200, 30};
        int yPoints[] = {30, 30, 200, 200, 30};

        int numPoints = 5;

        Color c1 = new Color(150,200,100);

        g.setColor(c1);

        g.drawPolygon(xPoints, yPoints, numPoints);
        g.fillPolygon(xPoints, yPoints, numPoints);
    }
}
