package topic0.practice2;

public class DBNameFactory extends AbstractFactory{

	@Override
	User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	DB_Name getDBName(String name) {
		if (name == null) {
		return null;
	}
	
	if(name.equalsIgnoreCase("Test")){
		return new DB_Name_Test();
	}
		
	if(name.equalsIgnoreCase("Example")){
		return new DB_Name_Example();
	}
	
	return null;
	
	}

}
