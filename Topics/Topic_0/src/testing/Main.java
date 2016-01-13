package testing;

import java.sql.Connection;

import database.MySqlConnection;


public class Main {

	public static void main(String[] args) {
		Connection con=MySqlConnection.conectar();
	}
	
}
