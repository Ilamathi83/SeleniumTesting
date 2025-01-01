package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions 
{
	SoftAssert sa;
	@Test
	void test()
	{
		Assert.assertEquals("mathi","mathi");
	}
	void sample()
	{
	 sa=new SoftAssert();
	 sa.assertEquals(123, 123);
	 sa.assertAll();
	}
	

}
