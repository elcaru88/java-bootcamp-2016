package topic0.practice2;

public class UserFactory extends AbstractFactory {

	@Override
	DB_Name getDBName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	User getUser(String username) {
	
	if(username==null){
		return null;
	}

	if(username.equalsIgnoreCase("Fede")){
		return new User_Fede();
	}
		
	if(username.equalsIgnoreCase("User1")){
		return new User_User1();
	}
		
	return null;	
	}
}
