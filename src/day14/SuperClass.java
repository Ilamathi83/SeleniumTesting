package day14;

public class SuperClass {
	
	String name="Mathi";
	
}
	
	class detail extends SuperClass
	{
		String name="Kavya";
		void show()
		{
			System.out.print(super.name);
		}
	}


