package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	private static String ruta = "localhost";
	private static String url = "proyectowebOracle";
	private static String user = "root1";
	private static String pass = "root2";
	private static Connection conn;
	
	static{
		try{
			Class.forName("org.postgresql.Driver");
		}catch(Exception e){
			e.toString();
		}
	}
	
	public static Connection conectar(){
		try {
			if(conn == null || conn.isClosed()){
				conn = DriverManager.getConnection("jdbc:oracle://" + ruta + "/" + url, user,pass);
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
