package day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerclassinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ennavena ezhudhiko d en issuku... apdiye output kudukraen");
	int age=sc.nextInt();
	System.out.println("Enakipo kalyana vayasu dhan vandhuruchu "+age);
	
	System.out.println("my good name is ");
	 String name=sc.next();
	 System.out.println("En peru meenakumari illa "+name);
	 
	 System.out.println("ellam varudha");
	 Object ellam=sc.next();
	 System.out.println("varudha paaru " + ellam);
	 
	 System.out.println("modha aalu");
	 int m=sc.nextInt();
	// System.out.println("Modha aalu " +m);
	 
	 System.out.println("second aalu");
	 int n=sc.nextInt();
	 //System.out.println("second aalu " +n);
	 
	 System.out.println("sum of values are " +(m+n));
	 
	 int a[]=new int[5];
	 for(int i=0;i<a.length;i++) {
		 
	System.out.println("Array values ah podra thambi "+ i+ " :");
	 a[i]=sc.nextInt();
	 }
	 System.out.println("order pandra");
	 System.out.println(Arrays.toString(a));

	}

}
