package day18;

class parent{
	String z="ABC";
	void y1()
	{
		System.out.println("parent class method "+z);
	}
}
 class child extends parent
 {
	 int x=29;
	 void y2() {
		 System.out.println("child class method "+x);
	 }
 }
 class grand extends parent{
	 String Name="Mathi";
	 void y3() {
		 System.out.println(Name);
	 }
 }

public class TypeCasting {

	public static void main(String[] args) {
		 
		/*// upcasting
		
		int a=10;
		long b=a;
		System.out.println(b);
		
		// downcasting
		
        double c=39.767;
        int d=(int)c;
        System.out.println(d);*/
		
		// upcasting and downcasting using objects
		
		/*child f=new child();
		f.y1();
		f.y2();
		System.out.println(f.z);
		System.out.println(f.x);
		
		parent e=new child();                        // upcasting 
		System.out.println(e.z);
		e.y1();
		//e.y2();      cannot access
		System.out.println(e.z);
		//System.out.println(e.x); cannot access*/
		
		// for downcasting there are 3 rules, all the three rules should be satisfied
		
		//parent e=new parent();
		//child c=(child) e;
		// consider child c=(child) e;
	    //          'A'  'b'  'C'  'd'
		// rule 1- conversion is valid or not
		// the type of c and d must have some relationship(either parent to child/ child to parent class)
		
		//parent e=new parent();
		//child c=(child) e;         // rule 1 yes
		//grand g=(grand) c;         //  rule 1 no as child and grand has no relation
		
		// rule 2 -assignment is valid or not
		// 'C' must be either same or child of 'A'
		
		//child c=(child) e;            //    rule 2 yes
		//child c=(grand) e;            //    rule 2 no
		
		// rule 3-the underlying object of 'd' must be either same of child of 'C'
		
		//parent e=new grand();
		//child c=(child) e;       // invalid as per rule 3
		//grand g=(grand) e;       // valid as per rule 3
		
		child c=new child();
		parent p=(child) c;        // all the 3 rules were satisfied, so we are storing the 
		System.out.println(p.z);
		
	}
}
