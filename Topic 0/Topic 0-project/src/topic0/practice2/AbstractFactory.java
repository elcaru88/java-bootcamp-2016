package topic0.practice2;

public abstract class AbstractFactory {

	abstract DB_Name getDBName(String name);
	abstract User getUser(String username);
}
