package day5;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//Approach 1
		
		/* int a[][]=new int[2][3];
         a[0][0]=10;
         a[0][1]=50;
         a[1][1]=29;
         a[1][2]=89;
         System.out.println(a[1][2]);*/
         
         //Approach 2
         
         int a[][]= {   {10,50,56}, // 00 01 01
        		         {29,89,45} // 10 11 12
                    };
        System.out.println("Length of rows is "+ a.length);
        System.out.println("Length of columns is "+ a[1].length);
        
        // to read multiple values
        
        // for loop
        
        for(int r=0;r<a.length;r++) {            // 0 , 1   
        	for(int c=0;c<a[r].length;c++) {        //0, 1
        		System.out.print(a[r][c] + " ");      // 10, 
        	}
        	System.out.println();
        }
        
        // enhanced for loop
        
        for (int x[]:a) {
        	for(int y:x) {
        		System.out.print(y+ " ");
        	}
        	System.out.println();
        }
        
		
	}

}
