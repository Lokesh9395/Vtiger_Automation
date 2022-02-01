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
		System.out.println("user2 made an update , please pull it");
	}
	
	@Test(groups="RRT")
	public void sample2_gitTest()
	{
		System.out.println("executing 2nd method");
	}
	
	@Test(groups="FRT")
	public void sample3_gitTest()
	{
		System.out.println("executing 3rd method");
		System.out.println("commit from master");
		System.out.println("commit from master in feb 1 2022");
	}
	

}
