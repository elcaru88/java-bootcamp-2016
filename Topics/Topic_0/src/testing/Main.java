package testing;

import java.sql.Connection;

import proxys.ProxyConnection;
import factories.AbstractFactory;
import factories.ConnectionFactory;


public class Main {

	public static void main(String[] args) {
		
		//point 1 and 2
		AbstractFactory abstractFactory = new AbstractFactory();
		ConnectionFactory cFactory= abstractFactory.getConnectionFactory("SQL");
		Connection conn1 = cFactory.getConnection("mysql");
		Connection conn2 = cFactory.getConnection("oracle");
		
		//point 3
		ProxyConnection proxy= new ProxyConnection();
		Connection conn3= proxy.getConnecion();
		
		
		
		
	}
	
}
