package kodlamaodev3;

public class UserManager {
	
	public void add  (User user  )  
	{
		
		System.out.println(user.password + ".............Sifre basar�l� ");
		System.out.println( user.email + ".............Mail kayd� olustu..");
		System.out.println( user.language + "........Kurs dili kaydedildi..");
		
	
		
 }
	
	
	public void addMultiple(User[ ] users)
	{
		 for ( User user : users)
		 {
			 add(user);
			 
		 }
		
	}

}
