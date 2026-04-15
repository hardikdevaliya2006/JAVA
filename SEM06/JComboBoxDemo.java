import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ComboboxExample extends JFrame implements ItemListener
{
	JComboBox cmb1;
	JLabel l1,l2;
	
	public ComboboxExample()
	{
		String s1[] = {"C++","JAVA","PYTHON","ML","JSCRIPT","ASP"};
		cmb1 = new JComboBox(s1);
		l1 = new JLabel("Select Subject : ");
		l2 = new JLabel();
		
		l1.setBounds(50,50,200,50);
		
		cmb1.setBounds(50,100,150,20);
		
		l2.setBounds(200,50,200,50);
		
		cmb1.setMaximumRowCount(5);
		cmb1.setEditable(true);
		
		add(cmb1);
		add(l1);
		add(l2);
		
		cmb1.addItemListener(this);
		
		setLayout(null);
		
		setSize(500,500);
		
		setTitle("ComboBox Demo");
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource() == cmb1)
		{
			l2.setText("You Have Selected : " + cmb1.getItemAt(cmb1.getSelectedIndex()));
		}
	} 
}

public class JComboBoxDemo
{
	public static void main(String []args)
	{
		ComboboxExample obj = new ComboboxExample();
	}
}