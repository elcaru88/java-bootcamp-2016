package singletonconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonConnection {

    private static SingletonConnection singleton = null;
    private static Connection Conexion;
    
    private SingletonConnection(){
    }
    
    public static SingletonConnection getInstance() {
		if (singleton == null) {
			singleton = new SingletonConnection();
		}
		return singleton;
	}

public void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
