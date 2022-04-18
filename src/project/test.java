package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class test {
	
	public static void main(String[] args) throws SQLException {
		Connection con;
		String username = "root";
		String password="";
		String con_string="jdbc:mysql://localhost/login";
		Statement stat=null;
		ResultSet rs=null;
		con = DriverManager.getConnection(con_string, username, password);
		System.out.println("Connected !");
		stat=(Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String sql="SELECT * FROM `login_app` ";
		rs =stat.executeQuery(sql);
		while(rs.next()) {
			System.out.println("email = "+rs.getString("email")+" ,password = "+rs.getString("password"));
		}
		rs.last();
		System.out.print(rs.getRow());
	}

}
