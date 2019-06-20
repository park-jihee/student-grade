package kr.hs.sdh.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	public static Connection getConnection() throws Exception{
		Connection conn = null;
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url, "hr", "hr");
		return conn;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) throws Exception{
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) throws Exception{
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}

}
