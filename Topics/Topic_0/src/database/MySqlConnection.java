package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import proxys.ConnectionInter;

public class MySqlConnection extends ConnectionInter {

	private static String id = "localhost";
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
				conn = DriverManager.getConnection("jdbc:mysql://" + id + "/" + url, user,pass);
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

	
	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		MySqlConnection.url = url;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		MySqlConnection.user = user;
	}

	public static String getPass() {
		return pass;
	}

	public static void setPass(String pass) {
		MySqlConnection.pass = pass;
	}
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		MySqlConnection.id = id;
	}

	public static String getAllData() {
		String data="id:"+ id+" url:"+url+" user:"+user +" pass:"+ pass ;
		return data;
	}
	
}
