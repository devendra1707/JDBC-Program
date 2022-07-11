package Insert;
import java.sql.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
public class InsertDemo {

	public static void main(String[] args) {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			CallableStatement cstm = con.prepareCall("{call insertpro(?,?,?)}");
			cstm.setInt(1, parseInt(args[0]));
			cstm.setString(2, args[1]);
			cstm.setInt(3, parseInt(args[3]));
			cstm.executeUpdate();
			out.println("One record Inserted Successfully");
			}catch(Exception e)
			{
				System.err.println(e);
	
			}
	}

}
