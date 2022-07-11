package jSelect;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo {

	public static void main(String[] args) {
	
				try {
					JdbcRowSet jrs = new OracleJDBCRowSet();
					jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
					jrs.setUsername("system");
					jrs.setPassword("12345");
					jrs.setCommand("select * from Student");
					jrs.execute();
					while(jrs.next())
					{
						System.out.print(jrs.getInt(1)+"\t");
						System.out.print(jrs.getString(2)+"\t");
						System.out.println(jrs.getInt(3));
					}
				} catch (Exception e) {
					System.err.print(e);
				}
		
	}
}
