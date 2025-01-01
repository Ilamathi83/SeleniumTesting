package day6;

public class SearchingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[]= {1,2,3,4,5,4,4};
	int x=3;
	boolean status=false;
	// for loop
	
	for(int i=0;i<a.length;i++) 
	{
	
			if(x==a[i])
			{
				System.out.println(x+ " - Given element is found in the array");
				status=true;
				break;
			}
		
	}
	
	// Enhanced for loop 
	
      for(int m:a) {
    	  if(x==m) {
    		  System.out.println(x+ " - Given element is found in the array");
				status=true;
				break;
    	  }
    	  
		
	}
	if (status==false)
	{
    System.out.println(x + " - Given element is not found in the array");
	}
	
	// find the number of repetition
	
	int count=0,m=4;
	for(int i:a)
	{
		if(m==i)
		{
			count++;
		}
	}
	System.out.println(count);

}
}
