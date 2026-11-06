package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class praticepgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("preeee");
		WebElement password =driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("12345");
		WebElement submit = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
        submit.click();

	}
	

}
