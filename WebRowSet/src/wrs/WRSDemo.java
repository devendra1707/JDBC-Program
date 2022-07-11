package wrs;

import java.io.FileOutputStream;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WRSDemo {

	public static void main(String[] args) {
		try {
			WebRowSet wrs = new OracleWebRowSet();
			wrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			wrs.setUsername("system");
			wrs.setPassword("12345");
			wrs.setCommand("select * from Student");
			wrs.execute();
			FileOutputStream fos = new FileOutputStream("Student.xml");
			wrs.writeXml(fos);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
