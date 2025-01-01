package day15;

public interface MultipleInheritance 
{
     void concept();	
	default void members()
	{
		int no=5;
		System.out.println(no);
	}
	
}

interface Family
{
	int age=45;           // Variable
	default void mother()
	{
	String Name="Sangeetha";
	System.out.println(Name);
	}
	
	static void father()
	{
		String job="driver";
		System.out.println(job);
	}
	
}
