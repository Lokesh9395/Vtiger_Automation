package Git_Practice;

import org.testng.annotations.Test;

public class Demo_GitTest 
{
	@Test(groups="ST")
	public void sample1_gitTest()
	{
		System.out.println("Hi, sharing the project for 1st time");
		System.out.println("Hi, sharing the project for 1st time by user 2");
		System.out.println("user1 made an update, please pull it");
	}
	
	@Test(groups="RT")
	public void sample2_gitTest()
	{
		System.out.println("executing 2nd method");
	}

}
