package kodlamaodev3;

public class InstructorManager {
	
	public void add  (Instructor �nstructor  )  
	{
		
		System.out.println( �nstructor.�nstructorNumber +  "...............Kay�t numaras� olustu..");
		System.out.println( �nstructor.�nstructorNumber + "................Kay�t numaras� olustu..");
	
		
 }
	

	
	public void addMultiple(Instructor [ ] �nstructors)
	{
		 for ( Instructor �nstructor : �nstructors)
		 {
			 add(�nstructor);
			 
		 }
		
	}
	
	

	
}
