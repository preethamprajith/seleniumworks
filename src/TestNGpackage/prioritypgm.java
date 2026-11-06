package TestNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class prioritypgm {
	
@BeforeClass
	
	public void beforeclassmethod()
	{
		System.out.println("before class test");
	}

@Test(priority=1,invocationCount = 3)//invocation used to do repeat the task
public void method_x()
{
	System.out.println("method_x");
}

@Test(priority=2,enabled = false)//enable==false means to disable the method
public void method_a()
{
	System.out.println("method_a");
}

@Test(priority=3)
public void method_b()
{
	System.out.println("method_b");
}

@AfterClass
public void afterclass1() {
	System.out.println("AFTER CLASS ");
}
}
