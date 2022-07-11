package Insert;

import java.sql.*; 
import static java.lang.Integer.*;
import static java.lang.System.*;

public class InsertDemo1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			PreparedStatement pstmt = con.prepareStatement("insert into Student1 values(?,?,?)");
			pstmt.setInt(1,parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setInt(3,parseInt(args[2]));
			pstmt.executeUpdate();
			out.println("One Record Inserted Successfully");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
