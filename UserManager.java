package inheritanceHomework;

public class UserManager {
	
	public void addUser(User user) 
	{
		System.out.println("Kullanici "+user.ad+" "+user.soyad+" eklendi ");
	}
	
	public void deleteUser(User user) 
	{
		System.out.println("Kullanici "+user.ad+" "+user.soyad+" silindi ");
	}
	
	public void addMultiple(User[] users)
	{
		for(User user : users)
		{
			addUser(user);
		}
	}
}
