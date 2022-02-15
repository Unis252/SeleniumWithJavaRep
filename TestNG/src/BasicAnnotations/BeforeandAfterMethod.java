package BasicAnnotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class BeforeandAfterMethod {

	@BeforeMethod()
	public void OpenURL()
	{
		
	System.out.println("OpenURL method ");
		
	}
	@Test(priority=2)
	public void Login()
	{
		
		System.out.println("Login method");
	}
	
	@Test(priority=3)
	public void AppMenu()
	{
		System.out.println("Clicked on AppMenu");
		
	}
	
	@AfterMethod()
	public void Logout()
	{
		System.out.println("Logout Method");
		
	}
	
	
	
	
}
