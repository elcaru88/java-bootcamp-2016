package practice4;

import java.sql.SQLException;
import java.util.ArrayList;

public class ActionsUser {
	
	public void createUser(User user) throws SQLException{
		
		// Connection c = new Connection;
		// c.connect();
		// insert into users values(user.getName, user.getMail, user.getPassword);
			
	}

	public ArrayList<User> listUser() throws SQLException{
		
		ArrayList<User> users = new ArrayList<User>();
		
		// Connection c = new Connection;
		// c.connect();		
		// users = select * from users;
		
		return users;
	}

	public void updateUser(User userToUpdate) throws SQLException{
		
		// Connection c = new Connection;
		// c.connect();
		// update users set values(mail, password where name = id);
				
	}

	public void deleteUser(String id) throws SQLException{
		
		// Connection c = new Connection;
		// c.connect();
		// delete from users where name = id;
		
	}

}
