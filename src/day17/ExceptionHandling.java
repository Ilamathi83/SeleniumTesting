package day17;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		try
		{
		System.out.println(100/a);               // how will you execute the next steps if you get exception here(try and catch can be used)
		}
		
		// 1.if you know the type of exception you can mention the same in catch statement
		
		catch(ArithmeticException e)                
		{
			System.out.println("Exception");
	    }
		
		// if you don't know the type, there are 2 methods one is multiple catch block, else in a single exception
		
		// methods 1- Multiple catch block
		
		String b=null;
		try 
		{
		System.out.println(b.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(e.getMessage());           // exception variable e can be used to get the details of the exception
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception");
			System.out.println(e.getMessage());           // exception variable e can be used to get the details of the exception
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat Exception");
			System.out.println(e.getMessage());           // exception variable e can be used to get the details of the exception
		}
		
		// method 2- single exception statement
		
		System.out.println("Enter the value");
		int c=sc.nextInt();
		try
		{
		System.out.println(100/c);             
		}
		catch(Exception e)                          // Exception is parent class for all types of exception
		{
			System.out.println("Exception Handling");
		}
		finally                                     // it will be executed in any case 
		{
			System.out.println("Finally block executed irrespective of the catch/try block ");
		}
		
		System.out.println("Code ends here");
		
	}

}
