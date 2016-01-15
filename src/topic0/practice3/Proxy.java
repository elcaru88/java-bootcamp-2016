package topic0.practice3;

import java.sql.SQLException;
import java.util.Date;

public class Proxy {

	Connect connect;
	
	public Proxy(){
		System.out.println("Creating proxy. Time: "+new Date());
	}
	
	public void doConnect() throws SQLException, ClassNotFoundException{
		if (connect == null) {
			connect = new Connect();
		}
		connect.getConnection();
	}
	
}
