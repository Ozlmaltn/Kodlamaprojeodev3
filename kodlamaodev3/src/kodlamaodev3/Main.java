package kodlamaodev3;

public class Main {

	public static void main(String[] args) {

		Student ozlem = new Student();
		ozlem.żnstructorNumber = "1453";
		
		User engin = new User();
		engin.żnstructorNumber = "148";
		

	

	
		InstructorManager żnstructormanager = new InstructorManager();
		Instructor[ ] żnstructors = {  ozlem,engin };
		
		żnstructormanager.addMultiple(żnstructors);
		
			StudentManager studentManager = new StudentManager();
			studentManager.add(new KursLogger());
			
		
	}
	
	
	

}




