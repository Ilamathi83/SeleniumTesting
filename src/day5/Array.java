package day5;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"kavya","mathi","sangeetha","deva","suru","abhishek","kowshik","dhishik","rishik","kishik"};
		System.out.println("length of an array is "+a.length);
		
		//for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//enhanced for loop/for each loop
		
		for(String x:a) {
			System.out.println(x);
		}

	}

}
