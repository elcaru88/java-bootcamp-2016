package topic0.practice2;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("DBName")){
			return new DBNameFactory();
		}
		
		if(choice.equalsIgnoreCase("User")){
			return new UserFactory();
		}
		
		return null;
	}
	
}
