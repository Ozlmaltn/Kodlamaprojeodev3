package kodlamaodev3;

public class Main {

	public static void main(String[] args) {

		Student ozlem = new Student();
		ozlem.�nstructorNumber = "1453";
		
		User engin = new User();
		engin.�nstructorNumber = "148";
		

	

	
		InstructorManager �nstructormanager = new InstructorManager();
		Instructor[ ] �nstructors = {  ozlem,engin };
		
		�nstructormanager.addMultiple(�nstructors);
		
			StudentManager studentManager = new StudentManager();
			studentManager.add(new KursLogger());
			
		
	}
	
	
	

}




