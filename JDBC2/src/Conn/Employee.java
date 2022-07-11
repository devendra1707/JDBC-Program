package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loader Successfully...");
			Connection c=DriverManager.getConnection("jdbc:oracle:oci8:xe","system","12345");
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from emp21");
			System.out.println("Mr.");
			while(rs.next())
			{
				
				System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+rs.getString(3)); //+" \t "
//			+rs.getInt(4)+" \t "+rs.getString(5)+" \t "+rs.getInt(6)+" \t "+rs.getInt(7)+" \t "+rs.getInt(8));
			}
			}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
