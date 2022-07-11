package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo2 {

	public static void main(String[] args) {
		
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
				System.out.println("Connection Established Successfully !!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			}
		
	}
}
