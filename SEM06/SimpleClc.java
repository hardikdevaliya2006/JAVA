import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleClc extends Applet implements ActionListener
{
	Frame f = new Frame();
	Label l1 = new Label("First No : ");
	Label l2 = new Label("Second No : ");
	Label l3 = new Label("Result : ");
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	
	Button b1 = new Button("add");
	Button b2 = new Button("sub");
	Button b3 = new Button("mul");
	Button b4 = new Button("div");
	Button b5 = new Button("cancle");
	
	public void init()
	{
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		
		t1.setBackground(Color.BLACK);
		t2.setBackground(Color.BLACK);
		t3.setBackground(Color.BLACK);
		
		t1.setForeground(Color.WHITE);
		t2.setForeground(Color.WHITE);
		t3.setForeground(Color.WHITE);
	
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
	
		f.add(l1);
		f.add(l2);
		f.add(l3);
	
		f.add(t1);
		f.add(t2);
		f.add(t3);
	
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
				
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void windowClosing(WindowEvent we)
	{
		f.dispose();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int n1 = Integer.parseInt(t1.getText());
		int n2 = Integer.parseInt(t2.getText());
		
		if(ae.getSource() == b1)
		{
			t3.setText(String.valueOf(n1 + n2));
		}
		else if(ae.getSource() == b2)
		{
			t3.setText(String.valueOf(n1 - n2));
		}
		else if(ae.getSource() == b3)
		{
			t3.setText(String.valueOf(n1 * n2));
		}
		else if(ae.getSource() == b4)
		{
			t3.setText(String.valueOf(n1 / n2));
		}
		else
		{
			System.exit(0);	
		}
	}
	
	public void paint(Graphics g)
	{
		
	}
}