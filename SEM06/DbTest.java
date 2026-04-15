import java.sql.*;
import java.sql.DriverManager;

public class DbTest {
	
    public DbTest() {
    }  
    public static void main (String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
			Connection c = DriverManager.getConnection("jdbc:odbc:mydsn");
			
			Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
			
			s.execute("INSERT INTO bcasem6 VALUES (29,'brahmaji', 'parlok')");
			
			System.out.println("Record Successfully Save");     
           
			
			s.execute("SELECT * FROM bcasem6");
			
			ResultSet rs = s.getResultSet();
			
			rs.last();

          
            System.out.println("Total Rows: " + rs.getRow());
            
            rs.beforeFirst();
			
			while(rs .next())
			{
				System.out.println("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				
			}
			
			rs.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}