package TestNGpackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class iframehandlingpgm {
	
	 ChromeDriver driver;

	    @BeforeTest
	    public void setup() {

	        driver = new ChromeDriver();

	        driver.get("https://keralaproperty.in/member/login/");

	        driver.manage().window().maximize();
	    }
	    
    @Test(priority = 1)
    public void login() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
        username.sendKeys("nibinyt19@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));//--locating password with name
        password.sendKeys("hydra@123");
       WebElement loginButton =driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
       loginButton.click();
       System.out.println("login sucessfull");
       
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//       wait.until(ExpectedCondition.urlContains("myhome");
    }
   
    @Test(priority = 2)
    
    public void addproperty() throws Exception
    {
    	WebElement addproperty = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
    	addproperty.click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,1000)");
        
        WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
        driver.switchTo().frame(frametag);
        //summary box is under the iframe so find locate  the iframe 
    	WebElement summary = driver.findElement(By.xpath("//*[@id=\"propintro\"]"));
    	summary.sendKeys("abcd");
        
        driver.switchTo().defaultContent();
    }
}
