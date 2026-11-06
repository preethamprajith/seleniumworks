package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstpgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver(); - for opening msedge
		//FireFox driver = new  FireFox();- for opening firefox browser
		driver.get("https://www.google.com/");
		String actualtitile =driver.getTitle();// ---to retrive the title of the web application  {gettitile();}
		
		System.out.println("type of the web application is: "+actualtitile);
		
		 String expectedtitile ="Google";
		 
		 if(actualtitile.equals(expectedtitile))
		 {
			 System.out.println("title is matched");
		 }
		 else
		 {
			 System.out.println("title is not  matched");
		 }
		 
//		 selenium components or selenium suite 
		 
		 //*selenium id
//		  *selenium Rc(REMOVE CONTROL)
		 //*selenium webdriver
		 //*selenium grid
//		 functinal testing and regresstion testing is used to use this 4 components

	}

}
