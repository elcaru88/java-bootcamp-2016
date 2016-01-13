package factories;

public class AbstractFactory {

	/**
	 * return a factory.
	 * 
	 * @param typeConnection can be SLQ or NoSQL
	 * @return
	 */
	public ConnectionFactory getConnectionFactory(String typeConnection) {
		
		if (typeConnection.equals("SQL")){
			return new SQlFactory();
		}else if (typeConnection.equals("NOSQL")){
			return null; 
		}
		return null;
	}

}
