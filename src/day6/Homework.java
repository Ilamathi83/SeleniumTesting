package day6;
import java.util.Arrays;
public class Homework {


	public static void main(String[] args) {
		
		// 1.Sort elements using for loop
		
		int a[]= {77,89,47,98,99,31,101,3,4,5,1000,90876};
		/*Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	   
		int x;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j]) {
					x=a[j]; //2
					a[j]=a[i];//4
					a[i]=x;
					}
			}
		}
		System.out.println(Arrays.toString(a));*/
		
		// 2. find largest number
		int max=a[0]; //77
		for(int i=0;i<a.length;i++) //89
		{
			if(a[i]>max)
			{
				max=a[i];
			}
	    }
		
		System.out.println("Largest value of array is "+max);
		
		//3.find lowest number
		
		int min=a[0];//77 
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) //89 47
			{
				min=a[i];//77 47
			}
		}
		System.out.println("Lowest value of the array is "+min);
	}
}
