package day44;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	
	@Test(priority=1)
	void  approach()
	{
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= {"approach"})
	void friends()
	{
		Assert.assertTrue(true);
		System.out.println("if talking, then yes");
	}
	
}
