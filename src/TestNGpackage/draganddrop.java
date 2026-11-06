package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class draganddrop {
	
	ChromeDriver driver;
	@BeforeClass
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://webdriveruniversity.com/Actions/index.html");
		 driver.manage().window().maximize();
		
	 }
	@Test
	
	public void dragaanddrop() throws Exception
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		Thread.sleep(3000);
		
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hover).perform();
		
//		WebElement link = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
//		act.click().perform();
//		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(doubleclick).perform();
		
	}
	

}
