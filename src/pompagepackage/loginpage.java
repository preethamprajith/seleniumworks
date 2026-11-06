package pompagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;//locating webelements using page factory
    
	@FindBy(xpath ="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(id="upass") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement button;
	
	public loginpage(WebDriver driver)// constuctor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	// methods
	public void setvalues() {
		username.sendKeys("hydraa");
		password.sendKeys("hydra@123");
		
	}
	
	public void method()
	{
		button.click();
	}
	
	public String titlemethod()
	{
		String title=driver.getTitle();
		return title;
	}
	
}
