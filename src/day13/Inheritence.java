package day13;

  class parent
  {
	  int age=65;
	  void display()
	  {
		  System.out.println("age of my grandma" +age);
	  }
  }
 
    class child1 extends parent
    {
    	int age1=45;
    	void show()
    	{
    		System.out.println("age of my amma "+ age1);
    	}
    }
    
    class child2 extends child1
    {
    	int age2=22;
    	void detail()
    	{
    		System.out.println("mathi's age "+age2);
    	}
    }
    
    class child3 extends child1
    {
    	int age3=24;
    	void print()
    	{
    		System.out.println("deva's age "+age3);
    	}
    }



public class Inheritence {

	public static void main(String[] args) {
		
		/*child1 c=new child1();            //single inheritance
		
		System.out.println(c.age);
		System.out.println(c.age1);
		
		child2 c2=new child2();           // multilevel inheritance
		
		System.out.println(c2.age2);
	
		
		c2.display();
		c2.show();
		c2.detail();*/
		
		child3 c3=new child3();            // hierarchy- single parent multiple children
		System.out.println(c3.age3);
		c3.print();
		
	

	}

}
