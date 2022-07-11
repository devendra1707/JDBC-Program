package crs;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class CheckedDemo {

	public static void main(String[] args) {
		try {
		CachedRowSet crs = new OracleCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		crs.setUsername("system");
		crs.setPassword("12345");
		crs.setCommand("select * from Student");
		crs.execute();
		while(crs.next())
		{
			System.out.print(crs.getInt(1)+"\t");
			System.out.print(crs.getString(2)+"\t");
			System.out.println(crs.getInt(3));
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
