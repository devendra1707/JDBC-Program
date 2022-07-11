package Insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@xe","system","12345");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
			Statement stmt = con.createStatement();
			stmt.execute("insert into Student values(1,'aaa',78)");
			System.out.println("One record Inserre Successfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
