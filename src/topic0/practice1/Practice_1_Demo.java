package topic0.practice1;

import java.sql.SQLException;

public class Practice_1_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Practice_1_Singleton p1s = Practice_1_Singleton.getInstance();
		p1s.checkConnection();
	}

}
