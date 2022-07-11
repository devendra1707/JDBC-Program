package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo1 {
	public static void main(String[] args) {
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:oci8:@xe","system","12345");
		System.out.println("Connection Established Successfully");
	}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}