import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.*;
import java.awt.BorderLayout;


public class ex_of_btn extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	Connection c;
	
	Statement s;
	
	ResultSet rs;

    public ex_of_btn() {
    	l1 = new JLabel("Student RollNo : ");
    	l2 = new JLabel("Student Name : ");
    	l3 = new JLabel("Student City : ");
    	
    	t1 = new JTextField();
    	t2 = new JTextField();
    	t3 = new JTextField();
    	
    	b1 = new JButton("First");
    	b2 = new JButton("Last");
    	b3 = new JButton("Prev");
    	b4 = new JButton("Next");
    	b5 = new JButton("View");
    	b6 = new JButton("Insert");
    	b7 = new JButton("Update");
    	b8 = new JButton("Delete");
    	
    	l1.setBounds(20,40,100,50);
    	l2.setBounds(20,100,100,50);
    	l3.setBounds(20,160,100,50);
    	
    	t1.setBounds(150,40,100,50);
    	t2.setBounds(150,100,100,50);
    	t3.setBounds(150,160,100,50);
    	
    	b1.setBounds(20,250,100,40);
    	b2.setBounds(150,250,100,40);
    	b3.setBounds(300,250,100,40);
    	b4.setBounds(450,250,100,40);
    	b5.setBounds(600,250,100,40);
    	b6.setBounds(20,325,100,40);
    	b7.setBounds(150,325,100,40);
    	b8.setBounds(300,325,100,40);

    	add(l1);
    	add(l2);
    	add(l3);
    	
    	add(t1);
    	add(t2);
    	add(t3);
    	
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	add(b5);
    	
		add(b6);
    	add(b7);
    	add(b8);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    	
		b6.addActionListener(this);
    	b7.addActionListener(this);
    	b8.addActionListener(this);
    	
    	try
    	{
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			c = DriverManager.getConnection("jdbc:odbc:mydsn");

			s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

			rs = s.executeQuery("select * from bcasem6");

			if(rs.next())
			{
				t1.setText(rs.getString(1));

				t2.setText(rs.getString(2));

				t3.setText(rs.getString(3));
			}
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}	

		setLayout(new BorderLayout());
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
   }
    
   public void actionPerformed(ActionEvent ae)
   {
		if(ae.getSource() == b1)
		{
			try
			{
				rs.first();

				t1.setText(rs.getString(1));
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

		if(ae.getSource() == b2)
		{
			try{
				rs.last();

				t1.setText(rs.getString(1));
				t2.setText(rs.getString(2));
				t3.setText(rs.getString(3));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

		if(ae.getSource() == b3)
		{
			try{
				if(!rs.isFirst())
				{
					rs.previous();

					t1.setText(rs.getString(1));
					t2.setText(rs.getString(2));
					t3.setText(rs.getString(3));
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

		if(ae.getSource() == b4)
		{
			try{
				if(!rs.isLast())
				{
					rs.next();

					t1.setText(rs.getString(1));
					t2.setText(rs.getString(2));
					t3.setText(rs.getString(3));
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

		if(ae.getSource() == b5)
		{
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

				Connection c1 = DriverManager.getConnection("jdbc:odbc:mydsn");

				Statement s1 = c1.createStatement();

				s1.execute("SELECT * FROM bcasem6");

				ResultSet rs1 = s1.getResultSet();

				ResultSetMetaData md = rs1.getMetaData();

				int col = md.getColumnCount();

				Vector columnName = new Vector();

				for(int i=1;i<=col;i++)
				{
					columnName.addElement(md.getColumnName(i));
				}

				Vector data = new Vector();

				while(rs1.next())
				{
					Vector row = new Vector(col);

					for(int i=1;i<=col;i++)
					{
						row.addElement(rs1.getObject(i));
					}

					data.addElement(row);
				}

				JTable j = new JTable(data,columnName);

				JScrollPane jp = new JScrollPane(j);

				jp.setBounds(750,250,500,300);

				add(jp);

				jp.setSize(500,500);

				jp.setVisible(true);

			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		if(ae.getSource() == b6)
		{
			try{
				s.execute("INSERT INTO bcasem6 (Rno, sname, scity) VALUES ("+ t1.getText() +", '"+ t2.getText() +"', '"+ t3.getText() +"')");
			
				rs = s.getResultSet();
				
				JOptionPane.showMessageDialog(this, "Record Saved Successfully");
				
				s.execute("SELECT * FROM bcasem6");
				
				rs = s.getResultSet();
				
				while(rs.next())
				{
					System.out.println ("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t");
				}
			}
			catch(Exception e)
			{
				System.out.println (e.getMessage());
			}
		}
		
		if(ae.getSource() == b7)
		{
			try{
				int x = s.executeUpdate("UPDATE bcasem6 SET sname = '"+ t2.getText() +"', scity = '"+ t3.getText() +"' WHERE Rno =" + t1.getText());
				
				if(x > 0)
				{
					JOptionPane.showMessageDialog(this ,"Record Updated Successfully");
				}
				else{
					System.out.println ("error...");
					
					JOptionPane.showMessageDialog(this, "error...");
				}
			}
			catch(Exception e)
			{
				System.out.println (e.getMessage());
			}
		}
   }

   public static void main(String[] args) {
	ex_of_btn btn = new ex_of_btn();
   }
}