package day6;

import java.util.Arrays;

public class MultidimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4,5},
		          {6,7,8,9,0}};
   for(int value[]:a) {
	   for(int y:value)
	   System.out.print(y+" ");
	   System.out.println();
   }
	}

}
