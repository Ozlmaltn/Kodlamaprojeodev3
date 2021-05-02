package kodlamaodev3;

public class SifreLogger  extends Instructor {
	
	@Override
	public void log()
	{
		
		User admin =new  User();
		admin.password="4455663";
		
		
	System.out.println("Sifre  kaydý basarýlý");
	}
}
