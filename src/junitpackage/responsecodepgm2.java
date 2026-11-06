package junitpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecodepgm2 {

	
	
ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void linkcount() throws Exception 
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("number of link"+links.size());
		
		for(WebElement li:links)
		{
			String url= li.getAttribute("href");
			verify(url);
		}
		
	}

	private void verify(String url) throws Exception {
		try {
		URI obj = new URI(url);
	URL value = obj.toURL();
	HttpsURLConnection con =(HttpsURLConnection) value.openConnection();
		
	 int responsecode = con.getResponseCode();
     System.out.println("response code is "+responsecode);
     
     
     if(responsecode==200)
     {
     	System.out.println("valid link"+url);
     }
     
     else if(responsecode==404)
     {
     	System.out.println("broken link"+url);
     }
     
     else
     {
     	System.out.println("other response code");
     }
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
     
     
	}


	
	
	
	
	
}
