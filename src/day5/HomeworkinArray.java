package day5;

import java.util.Arrays;

public class HomeworkinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find sum of elements in array
		
		int sum=0,even=0,odd=0,m=0,n=0;
		int a[]= {98,89,93,95,97};
		
		// read array values
		
		for(int x:a) {
			System.out.println(x+" ");
		}
		
		// Sum of the values in array
		
	    for(int i=0;i<a.length;i++) {
	    	sum+=a[i];
	    }
	    System.out.println("sum of the values in array is " + sum);
		// Sum of even and odd values in array
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
	
		if(num%2==0) {
		   m+=num;
			even++;
		}
		else {
			n+=num;
			odd++;
		}
		}
		System.out.println("no.of even values are " + even);
		System.out.println("no.of odd values are " + odd);
		System.out.println("sum of even values : " +m);
		System.out.println("sum of odd values : " +n);
	}

}
