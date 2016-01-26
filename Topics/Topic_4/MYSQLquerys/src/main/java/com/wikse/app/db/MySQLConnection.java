package com.wikse.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	private static String id = "localhost";
	private static String url = "highschool";
	private static String user = "root";
	private static String pass = "1234";
	private static Connection conn;
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.toString();
		}
	}
	
	public static Connection getConnection(){
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
	
	

	public static String getAllData() {
		String data="id:"+ id+" url:"+url+" user:"+user +" pass:"+ pass ;
		return data;
	}
	
}
