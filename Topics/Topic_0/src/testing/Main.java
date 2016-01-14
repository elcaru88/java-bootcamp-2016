package testing;

import java.sql.Connection;

import database.MySqlConnection;
import directors.ConnectionDirector;
import builders.ConnectionBuilder;
import builders.MySqlConnectionBuilder;
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
		
		
		//point 4
		ConnectionBuilder builder= new MySqlConnectionBuilder();
		ConnectionDirector director = new ConnectionDirector(builder);
		director.constructorConnection();
		
		System.out.println(MySqlConnection.getAllData());
		
		
		
	}
	
}
