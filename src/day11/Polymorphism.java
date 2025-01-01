package day11; // Method overloading

public class Polymorphism {
	
	int maths=98,tamil=93;
	
	
	void sum()
	{
		System.out.println(maths+tamil);  //1 
	}

	void sum(int english,int science)
	{
		System.out.println(english+science);  // 2 same method but different parameter
	}
	
	void sum(int english,double science)
	{
		System.out.println(english+science);  // 3 data type of parameter should be different
	}
	
	void sum(double english,int science)
	{
		System.out.println(english+science);   // 4 order of parameters should be different
	}
}
