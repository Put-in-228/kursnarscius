package lt.kvk.i17.chursin_jevgenij.database;

import java.sql.DriverManager;

//import com.mysql.jdbc.Connection;
import java.sql.*;

public class DBConn {
	private static DBConn instance = null;
	
	private Connection dbConn = null;
	
	private DBConn() {
		initDBConn();
	}
	
	public static DBConn getInstance() {
		if (DBConn.instance == null) {
			DBConn.instance = new DBConn();
		}
		
		return DBConn.instance;
	}
	
	public Connection getConn() {
		return dbConn;
	}
	
	private void initDBConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
