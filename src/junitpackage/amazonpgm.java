package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpgm {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void home() throws Exception
	{
		Thread.sleep(2000);//wait for a particular time period
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		search.sendKeys("mobiles");
//		WebElement searchbutton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
//		searchbutton.click();
		search.sendKeys("mobiles",Keys.ENTER);//TO PRESS ENTER KEY
		
		WebElement categories= driver.findElement(By.xpath("//div[@id='\"nav-xshop\"]//ul[1]/li[8]/div[1]/a']"));
		categories.click();
		
		WebElement cart= driver.findElement(By.xpath("//div[@id='nav-tools']"));
		cart.click();
	}
	
	
	

}
