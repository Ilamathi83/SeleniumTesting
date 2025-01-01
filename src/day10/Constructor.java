package day10;

public class Constructor {
	int age;
	String name;
	long phno;
	
	void mydata() 
	{
		System.out.println(age+" "+name+" "+phno);
	}
	
	void printdata(int vayasu,String peru,long num)
	{
		age=vayasu;
		name=peru;
		phno=num;
	}
	
	Constructor (int vayasu,String peru,long num)
	{
		age=vayasu;
		name=peru;
		phno=num;
	}

}
