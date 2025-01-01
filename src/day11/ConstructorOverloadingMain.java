package day11;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
	
		ConstructorOverloading co=new ConstructorOverloading(8,6,2);
		double v=co.volume();
		System.out.println(v);
		System.out.println(co.volume());
	}

}
