package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.nullability.AlwaysNull;

public class groupingpgm {

@BeforeClass(alwaysRun=true)
	
	public void beforeclassmethod()
	{
		System.out.println("before class method");
	}

@Test(priority=1,groups ="smoke")
public void method_x()
{
	System.out.println("method_x");
}

@Test(priority=2,groups ="sanity")
public void method_b()
{
	System.out.println("method_b");
}

@Test(priority=3,groups= {"regresstion","smoke"})
public void method_b1()
{
	System.out.println("method_b1");
}

@AfterClass(alwaysRun=true)

public void after()
{
	System.out.println("after class");
}

}
