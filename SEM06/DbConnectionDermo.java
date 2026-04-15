import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DbConnectionDermo extends JFrame implements ActionListener{
	JFrame jf;   
    JTextField t1,t2,t3;
    JButton b1;
    Connection c;
    Statement s;
    ResultSet rs;
    
    public DbConnectionDermo() {
    	t1 = new JTextField();
    	t2 = new JTextField();
    	t3 = new JTextField();
    	
    	b1 = new JButton("Save");
    	
    	t1.setBounds(30,30,40,40);
    	t2.setBounds(30,80,40,40);
    	t3.setBounds(30,130,40,40);
    	
    	b1.setBounds(100,180,160,160);
    	
    	add(t1);
    	add(t2);
    	add(t3);
    	
    	add(b1);
    	
    	b1.addActionListener(this);
    	
    	try{
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    		
    		c= DriverManager.getConnection("jdbc:odbc:mydsn");
    		
    		s = c.createStatement();
    		
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println (e.getMessage());
    	}
    	
    	setLayout(null);
    	
    	setSize(400,400);
    	
    	setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		try{
    			s.execute("INSERT INTO bcasem6(Rno,sname,scity)VALUES(" + t1.getText() + ",'" +  t2.getText() + "','" + t3.getText() + "')");
    			
    			rs = s.getResultSet();
    			//System.out.println ("record saved");
    			JOptionPane.showMessageDialog(jf, "Record Saved Successfully");
    		
    			s.execute("SELECT * FROM bcasem6");
    			
    			ResultSet rs = s.getResultSet();
    			
    			while(rs.next())
    			{
    				System.out.println ("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\n");
    			}
    		}
    		catch(Exception ee)
    		{
    			ee.getMessage();
    		}
    	}
    }
    
    public static void main (String[] args) {
		DbConnectionDermo obj = new DbConnectionDermo();
	}
}