package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import proxys.ConnectionInter;

public class MySqlConnection extends ConnectionInter {

	private static String ruta = "localhost";
	private static String url = "proyectoweb";
	private static String user = "root";
	private static String pass = "root";
	private static Connection conn;
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.toString();
		}
	}
	
	public static Connection connect(){
		try {
			if(conn == null || conn.isClosed()){
				conn = DriverManager.getConnection("jdbc:mysql://" + ruta + "/" + url, user,pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void disconnect(){
		try {
			if(conn != null || !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connect();
	}
	
	
	
}
