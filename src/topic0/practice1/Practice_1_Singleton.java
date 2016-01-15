package topic0.practice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Practice_1_Singleton {

	private static Practice_1_Singleton practice_1_singleton = null;
	
	private static Connection connection;
	
	private static final String driver ="com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:3306/test";

	private Practice_1_Singleton() throws ClassNotFoundException {
		Class.forName(driver);
	}
	
	private Connection getConnection() throws SQLException {
		if (connection==null) {
			connection = DriverManager.getConnection(url, user, password);
		}
		return connection;
		
	}
	
	public static Practice_1_Singleton getInstance() throws ClassNotFoundException, SQLException{
			if (practice_1_singleton == null){
				practice_1_singleton = new Practice_1_Singleton();
				practice_1_singleton.getConnection();
			}
			return practice_1_singleton;
	}
	
	public void databaseDisconnect() throws SQLException {
		connection.close();
	}
	
	public void checkConnection() throws SQLException {
		if(!connection.isClosed()){
			System.out.println("Connection not closed");
		}
	}
	
}
