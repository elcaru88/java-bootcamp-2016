package builders;

import database.MySqlConnection;


public class MySqlConnectionBuilder implements ConnectionBuilder {
	
	public MySqlConnectionBuilder() {
	}
	
	public void buildId() {
		MySqlConnection.setId("127.0.0.1");
	}

	public void buildUrl() {
		MySqlConnection.setUrl("projectweb3");
	}

	public void buildUser() {
		MySqlConnection.setUser("ema");
		
	}

	public void buildPass() {
		MySqlConnection.setPass("1234");
	}
	

}
