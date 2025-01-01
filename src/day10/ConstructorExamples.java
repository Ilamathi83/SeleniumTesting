package day10;

public class ConstructorExamples {
	
	int age,DOB; 
	ConstructorExamples()                // default constructor with no parameters
	{
		age=22;
		DOB=8;
	}
	ConstructorExamples(int a,int b)     // Parameterized constructor
	{
		age=a;
		DOB=b;
	}
	
	void printdetail()
	{
		System.out.println(age+" "+DOB);
	}

	public static void main(String[] args) {
		
		ConstructorExamples ce=new ConstructorExamples();
		ce.printdetail();
		
		// ConstructorExamples ce=new ConstructorExamples(23,19);
		// ce.printdetail();
		
	}

}
