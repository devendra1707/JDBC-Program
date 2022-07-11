package Create;

import java.sql.*;

public class CreateDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement stmt = con.createStatement();
			stmt.execute("Create table Student(rollno number(3) unique,name varchar2(10),Marks number(3))");
			System.out.println("Table Created Successfully");
					
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
