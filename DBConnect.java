import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    Connection con = null;

        public static Connection connectDB() {
	        try {
		 Class.forName("com.mysql.jdbc.Driver");
	         String dbhost = "jdbc:mysql://localhost:2222/w1427818_0";
	         String dbuser = "w1427818";
		 String dbpass = "2eV9cWzsDvZ5";
		 Connection con = DriverManager.getConnection(dbhost, dbuser, dbpass);
		 //System.out.println("Connected ");
		 return con;
		 } catch (Exception err) {
		System.out.println(err.getMessage());
		return null;
		}
        }
}
	
	/*Java file connection to the databse*/
