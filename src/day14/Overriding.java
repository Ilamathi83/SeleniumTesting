package day14;
       
   // Method overriding

      class accenture
      {
    	  int salary()
    	  {
    	  return 25000;
    	  }
      }
      
      class support extends accenture
      {
    	  int salary()
    	  {
    		  return 20000;
    		  
    	  }
      }
       class developer extends accenture
       {
    	   int salary()
    	   {
    		   return 35000;
    	   } 	   
       }
  
       // method overloading vs method overloading
       
       class g1
       {
    	   void stu1(int age)
    	   {
    		   System.out.println(age);
    	   }
       }
       class g2 extends g1
       {
    	   void Stu1(int age)
    	   {
    		   System.out.println(age);          // method overriding
    	   }
    	   void Stu1(int DOM,int DOB)
    	   {
    		   System.out.println(DOM+DOB);      //method overloading
    	   }
       }
       
       
public class Overriding {

	public static void main(String[] args) {
		
		accenture ac=new accenture();
		System.out.println("salary for fresher in accenture "+ac.salary());
		
		support tech=new support();
		System.out.println("Salary for technical engineer in accenture is "+tech.salary());
		
		developer dev=new developer();
		System.out.println("salary for developer in accenture is "+dev.salary());
		
		g2 stu=new g2();
		stu.Stu1(22);
		stu.Stu1(03, 22);

	}

}
