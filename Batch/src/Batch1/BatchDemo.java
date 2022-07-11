package Batch1;
import java.sql.*;
public class BatchDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement stmt = con.createStatement();
			stmt.addBatch("insert into Student values(4,'ddd',64)");
			stmt.addBatch("update Student set Marks=60 where rollno=6");
			stmt.addBatch("delete from Student where rollno=7");
			stmt.executeBatch();
			System.out.println("All Query is Finished !!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
