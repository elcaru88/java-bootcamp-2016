package singletonconnection;

public class SingletonTest {
    
	public static void main(String[] args) {
		SingletonConnection singleton = SingletonConnection.getInstance();

		singleton.MySQLConnection("root", "", "");
	}
    
}

