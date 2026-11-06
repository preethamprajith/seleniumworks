package junitpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecodepgm {
	
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();//to retrive current url
		URI obj = new URI(url);
        URL link = obj.toURL();
        HttpsURLConnection con = (HttpsURLConnection) link.openConnection();
        
        int responsecode = con.getResponseCode();
        System.out.println("response code is "+responsecode);
        
        
        if(responsecode==200)
        {
        	System.out.println("valid link");
        }
        
        else if(responsecode==404)
        {
        	System.out.println("broken link");
        }
        
        else
        {
        	System.out.println("other response code");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
