package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeTest
	
	public void beforetestmethod()
	{
		System.out.println("beforetest");
	}
	
	@BeforeClass
	
	public void beforeclassmethod()
	{
		System.out.println("before class test");
	}
	
	@BeforeMethod
	
	public void beforemethod1()
	{
		System.out.println("before method");
	}
	
	@Test
	
	public void testmethoda()
	{
		System.out.println("test method a");
	}
	
@Test
	
	public void testmethodax()
	{
		System.out.println("test method x");
	}

@Test

public void testmethodac()
{
	System.out.println("test method c");
}

@AfterMethod

public void aftermethoda()
{
	System.out.println("after method");
}
@AfterClass

public void afterclass1()
{
	System.out.println("afterclass");
}

@AfterTest

public void aftertest1()
{
	System.out.println("aftertest");
}
}
