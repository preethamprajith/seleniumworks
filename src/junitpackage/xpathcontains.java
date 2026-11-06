package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcontains {
	
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void register() throws Exception 
	{
	    
		WebElement fullname = driver.findElement(By.xpath("//input[contains(@name,\"name\") and @placeholder=\"Enter your full name\"]"));
		fullname.sendKeys("preetham prajith");
		
		Thread.sleep(2000);
		
		WebElement rediffmail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		rediffmail.sendKeys("pree@123gmail.com");
		
		
	}
	

}
