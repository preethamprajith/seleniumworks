package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitpgm {
	ChromeDriver driver;
	@BeforeEach
	
	public void browsersetup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void titleverification()
	{
	String expectedtitile ="Google";
	String actualtitle =driver.getTitle();
	 if(expectedtitile.equals(actualtitle ))
	 {
		 System.out.println("title is matched");
	 }
	 else
	 {
		 System.out.println("title is not  matched");
	 }
	}
	
	
	
@Test
public void method2()
{
	System.out.println("method2");
}

@AfterEach
public void closingmethod()
{
	driver.quit();//-- to close browser tab
	
}

	
	
	
	
	
	
	

}
