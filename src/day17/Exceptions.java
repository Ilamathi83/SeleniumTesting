package day17;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int num=sc.nextInt();
	    System.out.println(100/num);     // ArithmeticException-(if you enter the num as 0)
		
		int a[]=new int[4];
		System.out.println("Enter place"); // ArrayIndexOutofBoundException (if you enter num>4)
		int place=sc.nextInt();
		System.out.println("Enter value");
		int value=sc.nextInt();
		a[place]=value;
		System.out.println(a[place]); 
		
		String s="23";                        // NumberFormatException(if you enter anything other than integer)
	    int number=Integer.parseInt(s);
	    System.out.println(number);
	    
	    String m="null";                    // if you enter null then it is nulpointerException
	    System.out.println(m.length());
	   
	    // checked exception can be handled in two ways i)try catch block ii) Throws
	    
	   try {                                    // checked exception will occur if you just type the sleep statement so using try catch block
		   Thread.sleep(3000);                 // output will be displayed after particular entered time-- 3000 millisecond=3 second
	       }
	   catch(Exception e) {}
	   
	   
	   Thread.sleep(1000);                       // keyword throws will be added to the method 
	   
	   
	    System.out.println("Code ended");
		
	}

}
