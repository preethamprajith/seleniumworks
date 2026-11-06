
package junitpackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keralapropertyloginpgm {

    ChromeDriver driver;

    @BeforeEach
    public void browsersetup() {
        driver = new ChromeDriver();
        driver.get("https://keralaproperty.in/member/login/");
        driver.manage().window().maximize();
    }

    @Test
    public void titileverification() {
        String actualtitile = driver.getTitle();
        System.out.println("Title of web application = " + actualtitile);
    }

    @Test
    public void testverification() {
        String sourcecode = driver.getPageSource();

        if (sourcecode.contains("User Login")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is not present");
        }
    }

    @Test
    public void login() {
        WebElement username = driver.findElement(By.id("ulogin"));
        username.sendKeys("abcd");
        WebElement password = driver.findElement(By.name("upass"));//--locating password with name
        password.sendKeys("abcd");
       WebElement loginButton =driver.findElement(By.id("sub_logbtn"));
       loginButton.click();
       System.out.println("login sucessfull");
    }
    
}