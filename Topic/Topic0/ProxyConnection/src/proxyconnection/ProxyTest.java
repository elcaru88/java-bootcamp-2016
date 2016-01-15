package proxyconnection;

public class ProxyTest {
    
	public static void main(String[] args) {

		Proxy proxy = new Proxy();

		FastConnection fastConnection = new FastConnection();
		fastConnection.MySQLConnection("root", "", "");

		proxy.MySQLConnection();
                proxy.closeConnection();

	}

}
