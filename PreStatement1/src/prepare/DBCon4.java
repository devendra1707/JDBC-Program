package prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBCon4 {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the UserName : ");
			String uName = s.nextLine();
			System.out.print("Enter the Password : ");
			String pWord = s.nextLine();
			System.out.print("Enter the FirstName : ");
			String fName = s.nextLine();
			System.out.print("Enter the LastName : ");
			String lName = s.nextLine();
			System.out.print("Enter the Address : ");
			String addr = s.nextLine();
			System.out.print("Enter the MailId : ");
			String mId = s.nextLine();
			System.out.print("Enter the PhoneNo : ");
			long phNo = s.nextLong();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			PreparedStatement ps = con.prepareStatement("Insert into UserReg41 values(?,?,?,?,?,?,?)");
			ps.setString(1,uName);
			ps.setString(2,pWord);
			ps.setString(3,fName);
			ps.setString(4,lName);
			ps.setString(5,addr);
			ps.setString(6,mId);
			ps.setLong(7,phNo);
			int k = ps.executeUpdate();
			if(k>0);
			{
				System.out.println("User registered Successfully...");
			}
			con.close();
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
