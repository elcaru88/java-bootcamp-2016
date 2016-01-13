package proxys;

import java.sql.Connection;

import database.MySqlConnection;

public class ProxyConnection{
	private MySqlConnection connection;
	
	
	
	public Connection getConnecion() {
		if (connection ==null) {
			connection= new MySqlConnection();
		}
		return connection.getConnection();
	}
	
}
