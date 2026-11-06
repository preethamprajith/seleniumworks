package junitpackage;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookpgm {
	
	
	
	
ChromeDriver driver;
	
	@BeforeEach
	
	public void google()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void link()
	{
		List<WebElement> linka = driver.findElements(By.tagName("a"));
		
	    System.out.println("LINK COUNT = "+linka.size());
	    
	    for(WebElement li:linka)
	    {
	    	System.out.println(li.getText()+"links ------"+li.getAttribute("href"));
	    }
	    
	    
	}    
	

}
