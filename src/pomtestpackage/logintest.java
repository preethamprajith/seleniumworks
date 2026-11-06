package pomtestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pombasepackage.baseclass;
import pompagepackage.loginpage;

public class logintest extends baseclass// here we extending the baseclass
{
	
	
	loginpage obj;
	
	
	@BeforeMethod 
	
	public void objectmethod()
	{
		obj = new loginpage(driver);
	}
	
	@Test
	
	public void logintestmethod()
	{
	
		obj.setvalues();
		obj.method();
		
	}

	@Test
	
	public void titleverification()
	{
		System.out.println(obj.titlemethod());
	}
}
