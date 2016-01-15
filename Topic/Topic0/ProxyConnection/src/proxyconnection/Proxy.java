package proxyconnection;

import java.util.Date;

public class Proxy {

	SlowConnection slowConnection;
        FastConnection fastConnection;

	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}

	public void MySQLConnection() {
		if (slowConnection == null) {
			slowConnection = new SlowConnection();
		}
		slowConnection.MySQLConnection("root","","");
	}
        
        public void closeConnection(){
            fastConnection = new FastConnection();
            fastConnection.closeConnection();
        }
        

}
