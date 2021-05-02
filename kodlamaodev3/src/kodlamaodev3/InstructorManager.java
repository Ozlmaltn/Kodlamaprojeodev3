package kodlamaodev3;

public class InstructorManager {
	
	public void add  (Instructor ýnstructor  )  
	{
		
		System.out.println( ýnstructor.ýnstructorNumber +  "...............Kayýt numarasý olustu..");
		System.out.println( ýnstructor.ýnstructorNumber + "................Kayýt numarasý olustu..");
	
		
 }
	

	
	public void addMultiple(Instructor [ ] ýnstructors)
	{
		 for ( Instructor ýnstructor : ýnstructors)
		 {
			 add(ýnstructor);
			 
		 }
		
	}
	
	

	
}
