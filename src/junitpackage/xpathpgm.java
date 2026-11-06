package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpgm {
	
	ChromeDriver driver;
	@BeforeEach
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("preeee");
		WebElement password =driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("12345");
		WebElement submit = driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
        submit.click();

	}
	
	@AfterEach
	
	public void closewindow()
	{
		driver.quit();
	}
	

}
