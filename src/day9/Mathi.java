package day9;

import java.util.Scanner;

public class Mathi {
	 
 // Variables for this class Mathi	
	  int age;
	  String degree;
      String name;
	  int id;
	  long phno;
	
 // Methods for this class	
	  void display()
	  {
	   System.out.println(age);
	   System.out.println(degree);
	   System.out.println(name);
	   System.out.println(id);
	   System.out.println(phno);
	   System.out.println(age+" "+degree+" "+name+" "+id+" "+phno+" ");
	  }
	
	public static void main(String[] args) {

   // Object for this class
	
		Mathi frnd1=new Mathi();
		frnd1.age=22;
		frnd1.degree="Bsc";
		frnd1.name="kasu";
		frnd1.id=1330;
		frnd1.phno=8438808322l;
		frnd1.display();

	}

}
