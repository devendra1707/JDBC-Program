package ResultSet;
import java.sql.*;
public class Move_Update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("Select rollno,name,marks from Student");
			rs.moveToInsertRow();
			rs.updateInt(1, 10);
			rs.updateString(2,"jjj");
			rs.updateInt(3, 90);
			rs.insertRow();
			System.out.println("One Record Inserted Successfullt");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
