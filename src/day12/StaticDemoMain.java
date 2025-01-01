package day12;

public class StaticDemoMain {

	public static void main(String[] args) {
		
		// 1. Static method can directly access static stuff
		
		//System.out.println(StaticDemo.age);
		StaticDemo.e1();
		
        // 2. Static method can access not static stiff through object
		
		StaticDemo sd=new StaticDemo();
		//System.out.println(sd.salary);
		//sd.e2();
		
		// 3. non static methods can access everything directly
		
		sd.e3();
		
		
		System.out.println(StaticDemo.s);
		System.out.println(StaticDemo.s.length());
		
	}

}
