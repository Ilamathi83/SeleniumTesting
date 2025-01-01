package day11;

public class ConstructorOverloading {

	double breadth,length,depth;
	//1. default parameter
	ConstructorOverloading()
	{
		breadth=3;
		length=5;
		depth=2;
	}
	// 2.Parameterized 
	ConstructorOverloading(int b,int l,int d)
	{
		breadth=b;
		length=l;
		depth=d;
	}
	// 3. different parameter
	ConstructorOverloading(double B,double L,double D)
	{
		breadth=B;
		length=L;
		depth=D;
	}
	
	double volume() 
	{
		return breadth*length*depth;
	}
}
