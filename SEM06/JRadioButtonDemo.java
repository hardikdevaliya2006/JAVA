import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RButtonDemo extends JFrame
{
	JRadioButton jrbtn1;
	JRadioButton jrbtn2;
	
	JButton jb1;
	
	ButtonGroup g1;
	
	JLabel l1;
	
	public RButtonDemo()
	{
		this.setLayout(null);
		jrbtn1 = new JRadioButton();
		jrbtn2 = new JRadioButton();
		
		jb1 = new JButton("Click Me..");
		
		g1 = new ButtonGroup();
		
		l1 = new JLabel("Qualification");
		
		jrbtn1.setText("UG");
		jrbtn2.setText("PG");
		
		jrbtn1.setBounds(120,30,120,50);
		jrbtn2.setBounds(250,30,80,50);
		
		jb1.setBounds(125,90,80,30);
		
		l1.setBounds(20,30,150,50);
		
		this.add(jrbtn1);
		this.add(jrbtn2);
		
		this.add(jb1);
		
		this.add(l1);
		
		
		g1.add(jrbtn1);
		g1.add(jrbtn2);
		
		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String msg = "";
				
				if(jrbtn1.isSelected())
				{
					msg = "Under-Graduate";
				}
				else if(jrbtn2.isSelected())
				{
					msg = "Post-Graduate";
				}
				else
				{
					msg = "There Is No Selected...";
				}
				
				JOptionPane.showMessageDialog(RButtonDemo.this,msg);
			}
		});
	}
}

public class JRadioButtonDemo 
{
	public static void main(String []args)
	{
		RButtonDemo obj = new RButtonDemo();
		
		obj.setBounds(100,100,400,200);
		
		obj.setTitle("JRadio Button Demo....");
		
		obj.setVisible(true);
	}
}