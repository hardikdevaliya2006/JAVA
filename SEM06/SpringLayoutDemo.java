import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpringLayoutDemo
{
	private JFrame mf;
	private JLabel hlabel;
	private JPanel cpanel;
	private JLabel slabel;
	
	public SpringLayoutDemo()
	{
		prepareGUI();
	}
	
	private void prepareGUI()
	{
		mf = new JFrame("Java Spring Layout Demo...");
		
		mf.setSize(500,500);
		
		mf.setLayout(new GridLayout(3,1));
		
		hlabel = new JLabel("",JLabel.CENTER);
		slabel = new JLabel("",JLabel.CENTER);
		slabel.setSize(350,100);
		mf.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
		});
		
		cpanel = new JPanel();
			
		cpanel.setLayout(new FlowLayout());
		
		mf.add(hlabel);
		mf.add(cpanel);
		mf.add(slabel);
	}
	
	private void showSpringLayoutDemo()
	{
		hlabel.setText("Layout in action : Spring Layout");
		slabel.setText("Finally Swing Layout in Action");
		SpringLayout layoutObj = new SpringLayout();
		JPanel jp = new JPanel();
		jp.setLayout(layoutObj);
		JLabel l1 = new JLabel("Enter Name : ");
		JTextField t1 = new JTextField("", 15);
		jp.add(l1);
		jp.add(t1);
		
		layoutObj.putConstraint(SpringLayout.WEST,l1,5,SpringLayout.WEST,cpanel);
		layoutObj.putConstraint(SpringLayout.NORTH,l1,5,SpringLayout.NORTH,cpanel);
		layoutObj.putConstraint(SpringLayout.WEST,t1,5,SpringLayout.EAST,l1);	
		layoutObj.putConstraint(SpringLayout.NORTH,t1,5,SpringLayout.NORTH,cpanel);
	
		layoutObj.putConstraint(SpringLayout.EAST,jp,5,SpringLayout.EAST,t1);
		layoutObj.putConstraint(SpringLayout.SOUTH,jp,5,SpringLayout.SOUTH,t1);
		
		/*void putConstraint(String e1,Component c1, int pad, String e2, Component c2)
		 	Links edge e1 of component c1 to edge e2 of component c2, with a fixed distance 
		 	between the edges.	
		 */
		
		cpanel.add(jp);
		mf.setVisible(true);
	}
	
	public static void main(String []args)
	{
		SpringLayoutDemo obj = new SpringLayoutDemo();
		
		obj.showSpringLayoutDemo();	
	}
}

/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpringLayoutDemo
{
    private JFrame mf;
    private JLabel hlabel;
    private JLabel slabel;
    private JPanel cpanel;

    public SpringLayoutDemo()
    {
        prepareGUI();
    }

    private void prepareGUI()
    {
        mf = new JFrame("Java Spring Layout Demo...");
        mf.setSize(500, 300);

        // 3 rows, 1 column
        mf.setLayout(new GridLayout(3, 1));

        hlabel = new JLabel("", JLabel.CENTER);
        slabel = new JLabel("", JLabel.CENTER);

        mf.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        cpanel = new JPanel();
        cpanel.setLayout(new FlowLayout());

        mf.add(hlabel);
        mf.add(cpanel);
        mf.add(slabel);
    }

    private void showSpringLayoutDemo()
    {
        hlabel.setText("Layout in action : Spring Layout");

        SpringLayout layout = new SpringLayout();
        JPanel jp = new JPanel();
        jp.setLayout(layout);

        JLabel l1 = new JLabel("Enter Name : ");
        JTextField t1 = new JTextField(15);

        jp.add(l1);
        jp.add(t1);

        // Position label inside jp
        layout.putConstraint(SpringLayout.WEST, l1, 10, SpringLayout.WEST, jp);
        layout.putConstraint(SpringLayout.NORTH, l1, 10, SpringLayout.NORTH, jp);

        // Position text field relative to label
        layout.putConstraint(SpringLayout.WEST, t1, 10, SpringLayout.EAST, l1);
        layout.putConstraint(SpringLayout.NORTH, t1, 0, SpringLayout.NORTH, l1);

        // Set panel size automatically
        layout.putConstraint(SpringLayout.EAST, jp, 10, SpringLayout.EAST, t1);
        layout.putConstraint(SpringLayout.SOUTH, jp, 10, SpringLayout.SOUTH, t1);

        cpanel.add(jp);

        mf.setVisible(true);
    }

    public static void main(String[] args)
    {
        SpringLayoutDemo obj = new SpringLayoutDemo();
        obj.showSpringLayoutDemo();
    }
}*/