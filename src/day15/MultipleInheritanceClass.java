package day15;

class topic{
	int age=61;
	void print()
	{
		System.out.println(age);
	}
}

public class MultipleInheritanceClass extends topic implements MultipleInheritance,Family          // this is called Hybrid inheritance
{
	public void concept()
	{
		System.out.println("Family details");
	}

	public static void main(String[] args)
	{
		MultipleInheritanceClass mh=new MultipleInheritanceClass();
		mh.members();               // interface1
		mh.mother();                // interface2
		System.out.println(Family.age); // Variable
		
		Family.father();                 // static
		mh.concept();                   // Abstract class

		mh.print();                      // class extending
		
	Family Fm=new MultipleInheritanceClass();
	System.out.println(Family.age);
	Fm.mother();
	Family.father();
	
	
	
	}

}
