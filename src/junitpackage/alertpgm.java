package junitpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertpgm {

	  ChromeDriver driver;
	    

	    @BeforeEach
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("file:///C:/Users/preetham%20prajith/OneDrive/Desktop/alert.html");
	       
	    }
	    
	    @Test
	     
	    public void alert() throws Exception
	    {
	    	
	    	  WebElement dis_alrt = driver.findElement(By.xpath("/html/body/input[1]"));
	      dis_alrt.click();
	      
	      Alert Alrt = driver.switchTo().alert();
	      String text = Alrt.getText();
	      System.out.println("ALERT TEXT "+text);
	      Thread.sleep(2000);
	      Alrt.accept();
	      
	      WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
	      firstname.sendKeys("abcd");
	      
	      WebElement lastname = driver.findElement(By.xpath("/html/body/input[3]"));
	      lastname.sendKeys("abcd");
	      
	      WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
	      submit.click();
	    }
	    
	    
	    @AfterEach
	    
	    public void closewindow()
	    {
	    	driver.quit();
	    }
	
	
	
}
