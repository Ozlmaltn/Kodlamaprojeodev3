package kodlamaodev3;

public class InstructorManager {
	
	public void add  (Instructor ınstructor  )  
	{
		
		System.out.println( ınstructor.ınstructorNumber +  "...............Kayıt numarası olustu..");
		System.out.println( ınstructor.ınstructorNumber + "................Kayıt numarası olustu..");
	
		
 }
	

	
	public void addMultiple(Instructor [ ] ınstructors)
	{
		 for ( Instructor ınstructor : ınstructors)
		 {
			 add(ınstructor);
			 
		 }
		
	}
	
	

	
}
