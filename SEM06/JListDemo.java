import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo extends JFrame implements ListSelectionListener
{
	private JList jlst1;
	private static String[] colorNames = {"red","green","blue","yellow","black","cyan","gray"}; 
	private static Color[] colors = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.BLACK,Color.CYAN,Color.GRAY};
	
	public JListDemo()
	{
		super("JList Demo...");
		
		setLayout(new FlowLayout());
		
		jlst1 = new JList(colorNames);
		jlst1.setVisibleRowCount(5);
		
		jlst1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(jlst1));
		
		jlst1.addListSelectionListener(this);
	}
			public void valueChanged(ListSelectionEvent e)
			{
				getContentPane().setBackground(colors[jlst1.getSelectedIndex()]);
				setBackground(Color.RED);
			}	
			
	
		public static void main (String[] args) {
		JListDemo obj = new JListDemo();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(400,400);
		obj.setVisible(true);
}	
}