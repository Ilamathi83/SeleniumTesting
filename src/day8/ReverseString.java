package day8;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 // 1.Reverse a String 
		//Method 1
		
		String s="Mathi";
		String rev="";
        /*for(int i=s.length()-1;i>=0;i--) 
        {
        	System.out.print(s.charAt(i));   // approach 1
        	rev=rev+s.charAt(i);             // approach 2
        }
        System.out.println("  Reveresed String is "+ rev);*/
		
		// Method 2  -- using charArray method where we can convert the string to character
		
	      char a[]=	s.toCharArray();             // method to change the string to char
	      for(int i=a.length-1;i>=0;i--)            
	      {  
	    	 System.out.print(a[i]);            // approach 1
	    	 rev=rev+a[i];                       // approach 2
	      }
	      System.out.println("   Reversed String is "+rev);
	 
	      // Method 3- String buffer and stringbuilder
	      
	      StringBuffer m=new StringBuffer("Ilaaa");          // Similarly for StringBuilder
	      System.out.println(m.reverse());
	      System.out.println(s.concat(" S"));
	}

}
