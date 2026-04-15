import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JDialogBoxDemo extends JFrame implements ActionListener
{
    static JFrame jf;

    public JDialogBoxDemo()
    {

    }

    public static void main(String []args)
    {
        jf = new JFrame("JDialog Demo...");
        JDialogBoxDemo obj = new JDialogBoxDemo();
        JPanel jp = new JPanel();
        JButton b1 = new JButton("Click To See The Dialog..");
        b1.addActionListener(obj);
        jp.add(b1);
        jf.add(jp);

        jf.setSize(400,400);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s = ae.getActionCommand();

        if(s.equals("Click To See The Dialog.."))
        {
            JDialog dig1 = new JDialog(jf,"JDialog Box");
            JLabel l1 = new JLabel("This is a Dialog Box Inside Frame");
            dig1.add(l1);
            dig1.setSize(300,300);
            dig1.setVisible(true);
        }
    }
}