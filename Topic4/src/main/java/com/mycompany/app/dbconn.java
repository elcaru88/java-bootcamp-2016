package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconn {

	
	

		private Connection con;

		public dbconn() throws ClassNotFoundException {
			Class.forName("com.mysql.jdbc.Driver");
			
		}

		public Connection conectar() throws SQLException {
			
			if (this.con == null || this.con.isClosed()) {
			
				this.con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/high-school", "root",
						"root");
							
			}
			return con;
		}

		public void desconectar() throws SQLException {
			con.close();
		}

	

	
}
