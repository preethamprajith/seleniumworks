package testpackagepgm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testpgm {

    ChromeDriver driver;

    @BeforeEach
    public void browser_setup() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @Test
    public void login() {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        System.out.println("Login Successfully");
    }
}
