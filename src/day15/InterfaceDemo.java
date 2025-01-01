package day15;

interface Employees{
	
	String emp1="ilamathi";         // variables
	String emp2="suru";
	 
	void phno();                            // Abstract method
	
	default void ilamathi()                 // default method
	{
		int empID=102;
		System.out.println("Employee ID of Ilamathi is "+empID);
	}
	
	static void suru()                  
	{
		String company="LTI-Mindtree";       // Static method
		System.out.println("Shruthika is working in "+company);
	}
}

public class InterfaceDemo implements Employees
{
	public void phno()
	{
		System.out.println("Ilamathi's contact number "+8438808322l);
	}

	public static void main(String[] args) {
		
		// Method 1 - using class variable type
		
		InterfaceDemo id= new InterfaceDemo();
		id.ilamathi();                                         // default method
		id.phno();                                             // abstract method
		
		Employees.suru();                                    // calling directly as it is static method
        System.out.println(Employees.emp1+" "+Employees.emp2);
		// Method 2- using Interface as variable type
		
		Employees emp=new InterfaceDemo();
		emp.ilamathi();                                         // default method
		emp.phno();                                             // abstract method
		
		Employees.suru();                                       // calling directly as it is static method
		System.out.println(Employees.emp1+" "+Employees.emp2);  // Variables
	}

}
