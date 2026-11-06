
package TestNGpackage;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandlerpgm {

    ChromeDriver driver;

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String parentwindow = driver.getWindowHandle();

        WebElement searchbar = driver.findElement(
                By.xpath("//*[@id='twotabsearchtextbox']"));

        searchbar.sendKeys("mobiles");

        WebElement icon = driver.findElement(
                By.xpath("//*[@id='nav-search-submit-button']"));

        icon.click();

        WebElement phonelink = driver.findElement(
                By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a"));

        phonelink.click();

        Set<String> tabdetails = driver.getWindowHandles();
        
//        ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
//    	driver.switchTo().window(windowdetails.get(1));

        for (String handle : tabdetails) {

            if (!handle.equals(parentwindow)) {

                driver.switchTo().window(handle);

                Thread.sleep(2000);

                File folder = new File(
                    "C:\\Users\\preetham prajith\\OneDrive\\Desktop\\Selenium works\\screenshot"
                );

                if (!folder.exists()) {
                    folder.mkdirs();
                }

                File s = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);

                File destination = new File(folder, "mobile.png");

                FileHandler.copy(s, destination);

                System.out.println("Successfully saved the screenshot!");

                System.out.println("Screenshot location: "
                        + destination.getAbsolutePath());
            }
        }
    }
}
