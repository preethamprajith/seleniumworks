
package TestNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {

    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
            System.out.println("Chrome browser launched");

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
            System.out.println("Edge browser launched");

        } else {

            
                System.out.println("Browser not supported: " + browser);
            
        }

        driver.manage().window().maximize();
    }

    @Test
    public void method1() throws Exception {

        driver.get("https://www.google.com/");

        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);
    }

    @AfterClass
    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
