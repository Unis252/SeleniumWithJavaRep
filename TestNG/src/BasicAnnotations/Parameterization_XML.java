package BasicAnnotations;

import org.testng.annotations.*;

public class Parameterization_XML {

	@Parameters({"a","b"})
	@Test
	public void Login(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	@Test
	public void Logout()
	{
		
		System.out.println("Logout method");
		
	}
	
	
	
	
}
