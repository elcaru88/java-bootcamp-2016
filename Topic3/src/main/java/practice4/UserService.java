package practice4;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserService implements UserServiceInterface {

	private static ArrayList<User> users;
	
	public void createUser(String name, String mail, String password) {
	
		User user = new User(name, mail, password);	
		ActionsUser au;
		
		
		try{
			au = new ActionsUser();
			au.createUser(user);
			
			listUser();
		}
	
		catch (SQLException e) {
			// Error. User already exist.
			listUser();
	}}

		
	public ArrayList<User> listUser() {
		
		ActionsUser au;
		ArrayList<User> users;		
		
		try{
			au = new ActionsUser();
						
			users = au.listUser();
			
			return users;
		}
	
		catch (SQLException e) {
			// DB Error. Can't list users.
	}
		return null;
	}

	public void updateUser(String name, String newMail, String newPassword) {
		
		User userToUpdate = new User(name, newMail, newPassword);	
		ActionsUser au;
		
		try{
			au = new ActionsUser();
			au.updateUser(userToUpdate);
			
			listUser();
		}
	
		catch (SQLException e) {
			// DB Error. Can't update user.
			listUser();
	}
		
	}

	public void deleteUser(String id) {
		
		ActionsUser au;
		
		try{
			au = new ActionsUser();
			au.deleteUser(id);
			
			listUser();
		}
	
		catch (SQLException e) {
			// DB Error. Can't delete user or User not exist.
			listUser();
	}
		
		
	}

}
