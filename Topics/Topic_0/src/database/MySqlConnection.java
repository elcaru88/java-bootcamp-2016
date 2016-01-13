package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

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
	
	public static Connection conectar(){
		try {
			if(conn == null || conn.isClosed()){
				conn = DriverManager.getConnection("jdbc:mysql://" + ruta + "/" + url, user,pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void desconectar(){
		try {
			if(conn != null || !conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
