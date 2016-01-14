package topic0.practice2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory dbNameFactory = FactoryProducer.getFactory("dbname");
		
		DB_Name dbname1 = dbNameFactory.getDBName("Test");
		
		dbname1.getDBName();
		
		DB_Name dbname2 = dbNameFactory.getDBName("EXAMPLE");
		
		dbname2.getDBName();
		
		AbstractFactory usernameFactory = FactoryProducer.getFactory("user");
		
		User user1 = usernameFactory.getUser("fede");
		
		user1.getUser();
		
		User user2 = usernameFactory.getUser("user1");
		
		user2.getUser();
		
	}

}
