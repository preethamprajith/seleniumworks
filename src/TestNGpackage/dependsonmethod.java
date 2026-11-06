package TestNGpackage;

import org.testng.annotations.Test;

public class dependsonmethod {
	
	@Test
	public void reg()
	{
		System.out.println("regstratiom method");
	}
	
	@Test(dependsOnMethods ="reg")//login method is dependson ref(),first reg() method will works first then the log() mwthod will execute
	public void log()
	{
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = {"reg","log"})
	public void home()
	{
		System.out.println("home");
	}

}
