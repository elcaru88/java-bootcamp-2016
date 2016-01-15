package topic0.practice3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class Connect {

		private static Connection connection;
		
		private static final String driver ="com.mysql.jdbc.Driver";
		private static final String user = "root";
		private static final String password = "root";
		private static final String url = "jdbc:mysql://localhost:3306/test";

		public Connect() throws ClassNotFoundException {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Class.forName(driver);
			
		}
		
		public Connection getConnection() throws SQLException {
			if (connection==null) {
				connection = DriverManager.getConnection(url, user, password);
				System.out.println("Class name: " + this.getClass().getSimpleName() + ". Connection open at: " + new Date());
			}
			return connection;
			
		}
		
		public void databaseDisconnect() throws SQLException {
			connection.close();
		}
		
		
		}
		
	
