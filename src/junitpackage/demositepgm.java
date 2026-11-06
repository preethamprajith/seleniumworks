package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demositepgm {
	ChromeDriver driver;
    

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
	
	
}
    @Test
    public void demosite() throws Exception
    {
    	WebElement dis_alrt = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
	      dis_alrt.click();
	      
	      Alert alrt = driver.switchTo().alert();
	      
	     String text = alrt.getText();
	     
	     System.out.println("ALERT TEXT "+text);
	     
	      Thread.sleep(2000);
	      
	      alrt.accept();
	    
	      
	      WebElement side2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
	      side2.click();
	      
	      WebElement dis_alrt2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
	      dis_alrt2.click();
	      

	      Alert alrt1 = driver.switchTo().alert();
	      
	     String text1 = alrt.getText();
	     
	     System.out.println("ALERT TEXT "+text1);
	     
	      Thread.sleep(2000);
	      
	      alrt.dismiss();
	      
	      
	      WebElement side3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
	      side3.click();
	      
	      WebElement dis_alrt3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
	      dis_alrt3.click();

	      Alert alrt3 = driver.switchTo().alert();
	      
	     String text3 = alrt.getText();
	     
	     System.out.println("ALERT TEXT "+text3);
	     
	      Thread.sleep(2000);
	      
	      alrt.sendKeys("preetham");
	      Thread.sleep(4000);
	      alrt.accept();
	      
	      
	      
    }
}