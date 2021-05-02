package kodlamaodev3;

public class Main {

	public static void main(String[] args) {

		Student ozlem = new Student();
		ozlem.ýnstructorNumber = "1453";
		
		User engin = new User();
		engin.ýnstructorNumber = "148";
		

	

	
		InstructorManager ýnstructormanager = new InstructorManager();
		Instructor[ ] ýnstructors = {  ozlem,engin };
		
		ýnstructormanager.addMultiple(ýnstructors);
		
			StudentManager studentManager = new StudentManager();
			studentManager.add(new KursLogger());
			
		
	}
	
	
	

}




