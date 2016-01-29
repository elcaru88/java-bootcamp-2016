package practice4;

import java.util.ArrayList;

public interface UserServiceInterface {

	public void createUser(String name, String mail, String password);
	public ArrayList<User> listUser();
	public void updateUser(String name, String newMail, String newPassword);
	public void deleteUser(String id);
	
}
