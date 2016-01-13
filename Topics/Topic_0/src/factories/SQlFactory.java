package factories;

import java.sql.Connection;

import database.MySqlConnection;
import database.OracleConnection;

public class SQlFactory extends ConnectionFactory {

	public Connection getConnection(String type) {
		if(type.equals("msql")){
			return MySqlConnection.conectar();
		}else if(type.endsWith("oracle")){
			return OracleConnection.conectar();
		}
		return null;
	}

}
