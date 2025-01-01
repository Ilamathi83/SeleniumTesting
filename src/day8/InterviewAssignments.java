package day8;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewAssignments {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 1. check the string is palindrome or not
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.next();
		String y=s;
		int len=s.length();
           // String y="MADam";
            String rev="";
            for(int i=len-1;i>=0;i--)
            {
             //System.out.println(s.charAt(i));
              rev=rev+s.charAt(i);
            }
		    System.out.println(rev);
		    if(rev.equalsIgnoreCase(y))
		    {
		    	System.out.println("Given value is palindrome");
		    }
		    else {
		    	System.out.println("Given value is not a palindrome");
		    }
		    
    // 2. Remove Junk or special characters in a string
		    
		    String k="@#$%Ilamathi @832-2";
		    k=k.replaceAll("[^a-zA-Z0-9]", "");
		    System.out.println(k);
		  
		    
	// 3.remove white spaces in a string
		    
		    String n="   Ila ma thi";
		    char b[]=n.toCharArray();
		  for(int h=0;h<n.length();h++)
			  
		    {
		    	if(b[h]==' ') 
		    	{
		    		continue;
		    	}
		    	else
		    	{
		    		System.out.print(b[h]);
		    	}
		    	//System.out.print(b[h]);
		    }
		  
		   
   // 4. count occurences of a character
            int count=0;
            String w="Ilaamaaathi";
		    char g[]=w.toCharArray();
		   for(int f=0;f<w.length();f++)
		   {
			   if(g[f]=='a')
			   {
				   count++;
			   }else 
			   {
				  continue;
			   }
		   }
		   System.out.println(" no of a in the word is " +count);
		   
   // 5. count words in a string
		   String z="hi all good evening and warm welcome. This is ilamathim from Accenture, glad to meet you";
		   int words=1;
		   char[]p=z.toCharArray();
		   for(int j=0;j<z.length();j++)
		   {
			   if(p[j]==' ') 
			   {
				  words++; 
			   }else {
				   continue;
			   }
		   }
		   System.out.println(words);
	}
	

}
