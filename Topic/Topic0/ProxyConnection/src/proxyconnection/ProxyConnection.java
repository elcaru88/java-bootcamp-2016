package proxyconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ProxyConnection {
    
        private static Connection Conexion;
        
        //public ProxyConnection(){}

        public void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa!" + new Date());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProxyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
 
        public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor!");
        } catch (SQLException ex) {
            Logger.getLogger(ProxyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
