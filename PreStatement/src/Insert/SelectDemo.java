package Insert;

import java.sql.*;

public class SelectDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			PreparedStatement pstmt = con.prepareStatement("Select rollno,name,marks from Student1 where rollno=?");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
