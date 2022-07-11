package prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement stmt = con.createStatement();
			stmt.execute("Create table UserReg41(uName varchar2(20), pword varchar2(20), fName varchar2(20),lName varchar2(20),addr varchar2(20),mId varchar2(20),phNo number(10))");
			System.out.println("Table Created Successfully...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
