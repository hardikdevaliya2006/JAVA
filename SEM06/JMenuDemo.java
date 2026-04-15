import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JMenuDemo extends JFrame{

    public JMenuDemo() {
    	JMenuBar mb1 = new JMenuBar();
    	setJMenuBar(mb1);
    	
    	JMenu m1 = new JMenu("File");
    	JMenu m2 = new JMenu("Edit");
    	JMenu m3 = new JMenu("Search");
    	
    	JTextArea ta = new JTextArea();
    	
    	mb1.add(m1);
    	mb1.add(m2);
    	mb1.add(m3);
    	
    	m1.add(new JMenuItem("New",new ImageIcon("new.png")));
    	m1.add(new JMenuItem("Open",new ImageIcon("favicon.ico")));
    	m1.add(new JMenuItem("Save",new ImageIcon("favicon.ico")));
    	
    	m1.addSeparator();
    	
    	m1.add(new JMenuItem("Page Setup",new ImageIcon("favicon.ico")));
    	m1.add(new JMenuItem("Print",new ImageIcon("favicon.ico")));
    
    	m2.add(new JMenuItem("Undo",new ImageIcon("b_group.png")));
    	m2.add(new JMenuItem("Redo",new ImageIcon("b_group.png")));
    	m2.add(new JMenuItem("Cut",new ImageIcon("b_group.png")));
    	m2.add(new JMenuItem("Copy",new ImageIcon("b_group.png")));
    	m2.add(new JMenuItem("Paste",new ImageIcon("b_group.png")));
    	
    	this.getContentPane().add(ta);
    }
    
    public static void main (String[] args) {
		JMenuDemo obj = new JMenuDemo();
		obj.setVisible(true);
		obj.setSize(500,500);
	}
    
}