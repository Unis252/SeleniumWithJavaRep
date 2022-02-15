package BasicAnnotations;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;
public class Dependecny {

	
	@Test(priority=1)
	public void OpenURL()
	{
		
	System.out.println("OpenURL method ");
	Assert.assertTrue(false);
	
	}
	@Test(priority=2,dependsOnMethods={"OpenURL"})
	public void Login()
	{
	
		System.out.println("Login method");
	}
	
	@Test(priority=3,dependsOnMethods={"OpenURL","Login"})
	public void AppMenu()
	{
		System.out.println("Clicked on AppMenu");
		
	}
	
	@Test(dependsOnMethods={"Login"})
	public void Logout()
	{
		System.out.println("Logout Method");
	
	}
	
	
}
