import java.sql.*;
import java.sql.DriverManager;

public class EmployeeDb {

    public EmployeeDb() {
    }
    
    public static void main (String[] args) {
 		try
 		{
 			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // Bridge
 			
 			Connection c = DriverManager.getConnection("jdbc:odbc:empdsn");
 			
 			Statement s = c.createStatement();
 			
 			s.execute("Insert Into emp VALUES (5, 'ram', 5560000)");
 			
 			System.out.println ("Record Save Success");
 			
 			s.execute("select * from emp");
 			
 			ResultSet rs = s.getResultSet();
 			
 			//rs.getFetchSize();
 			while(rs.next())
 			{
 				System.out.println("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\n");
 			}
 		}
 		catch(Exception e)
 		{
 			System.out.println (e.getMessage());
 		}
 	}
}