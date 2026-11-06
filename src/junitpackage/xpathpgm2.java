package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpgm2 {

	ChromeDriver driver;
	@BeforeEach
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void register()
	{
		WebElement link = driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a[1]"));
		link.click();
	}
	
	
//@AfterEach
//	
//	public void closewindow()
//	{
//		driver.quit();
//	}
	
}
