package TestNGpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class hardassertionpgm {
	
 ChromeDriver driver;
 @BeforeClass
 
 public void setup()
 {
	 driver = new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 driver.manage().window().maximize();
 }
 
@Test(priority=1)

public void titleverification()
{
	String actualtitle = driver.getTitle();
//	System.out.println(actualtitle);
	String expectedtitle = "Rediffmail Free Unlimited Storage";
	Assert.assertEquals(expectedtitle, actualtitle);
	System.out.println("title verification sucess");// this line will bw execute only after the assertion will be pass
}
@Test(priority=2)	
public void urlverification()
{
	String actualurl = driver.getCurrentUrl();
//	System.out.println(actualurl);
	
	String expectedurl="https://register.rediff.com/register/register.php?FormName=user_details";
	Assert.assertEquals(expectedurl, actualurl);
	System.out.println("url verification completed");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
