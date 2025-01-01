package day16;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
	// 1.String to datatypes
		
		// String to integer
		
		String Maths="98";
		String Eng="89";
		System.out.println("Before..."+Maths+Eng);     // before converting into Wrapper class
		int M=Integer.parseInt(Maths);
		int E=Integer.parseInt(Eng);
		System.out.println("After..."+(M+E));           // After converting
		
		// String into double
		
		String Science="93.20";
		String Tamil="94.30";
		System.out.println(Double.parseDouble(Science)+Double.parseDouble(Tamil));
		
		// String into boolean
		
		String value="True";          // if you enter anything other than true, it'll return false
		System.out.println(Boolean.parseBoolean(value));
		
		// 2.date types to string
		
		int age=21;                                 // similarly for all data types
		System.out.println(String.valueOf(age)) ;
		
		ArrayList<Integer> arr=new ArrayList<Integer>(1);
		System.out.println(arr);

	}

}
