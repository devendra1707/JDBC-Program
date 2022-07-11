package Retrieve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Student1");
			ResultSetMetaData rm = rs.getMetaData();
			int n = rm.getColumnCount();
			for(int i=1;i<=n;i++)
			{
				System.out.print(rm.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next())
			{
				for(int i=1;i<=n;i++) 
				{
				System.out.print(rs.getString(i)+"\t");
				}	
				System.out.println();
			}
		}catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
