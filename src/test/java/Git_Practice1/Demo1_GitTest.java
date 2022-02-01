package Git_Practice1;

import org.testng.annotations.Test;

public class Demo1_GitTest 
{
	@Test(groups="ST")
	public void sample1Test()
	{
		System.out.println("demo1 test method1 executing");
	}
	
	@Test(groups="RT")
	public void sample2Test()
	{
		System.out.println("demo1 test method2 executing");
	}
	@Test(groups="FR")
	public void sample3Test()
	{
		System.out.println("demo2 test method3 executing");
	}
}
