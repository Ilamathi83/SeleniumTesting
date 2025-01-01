package day12;

public class StaticDemo {
	static int age =22;
	int salary=25000;
	
	static void e1() 
	{
		System.out.println("it is static");
	}
	
	void e2()
	{
		System.out.println("it is not static");
	}
	
	void e3()
	{
		System.out.println(age);
		System.out.println(salary);
		e1();
		e2();
	}
	
	static String s="ilamathi";

	
}
