package day44;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Maths"})
	void maths1()
	{
		System.out.println("Maths department - 1st yr");
	}
  @Test (groups= {"Phy"})
  void Physics1()
  {
	  System.out.println("Phy dept-1st yr");
  }
	
  @Test(groups= {"Maths"})
  void maths2()
  {
	  System.out.println("maths dept-2nd yr");
  }
  
  @Test(groups= {"Phy"})
  void Physics2()
  {
	  System.out.println("Phy dept-2nd yr");
  }
  
  @Test (groups= {"Maths"})
  void maths3()
  {
	  System.out.println("Maths dept-3rd yr");
  }
}
