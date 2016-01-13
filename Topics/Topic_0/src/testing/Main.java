package testing;

import java.sql.Connection;

import factories.AbstractFactory;
import factories.ConnectionFactory;


public class Main {

	public static void main(String[] args) {
		
		AbstractFactory abstractFactory = new AbstractFactory();
		ConnectionFactory cFactory= abstractFactory.getConnectionFactory("SQL");
		Connection conn1 = cFactory.getConnection("mysql");
		Connection conn2 = cFactory.getConnection("oracle");
		
	}
	
}
