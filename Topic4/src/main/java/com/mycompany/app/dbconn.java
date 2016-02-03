package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconn {



	public class Conexion {

		private Connection con;

		public Conexion() throws ClassNotFoundException {
			Class.forName("com.mysql.jdbc.Driver");
			
		}

		public Connection conectar() throws SQLException {
			
			if (this.con == null || this.con.isClosed()) {
			
				this.con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sistema_contable", "root",
						"root");
							
			}
			return con;
		}

		public void desconectar() throws SQLException {
			con.close();
		}

	}

	
}
