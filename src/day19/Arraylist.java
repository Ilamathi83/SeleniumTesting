package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		// types of declaration for the arrayList
		
		ArrayList<Object> ar=new ArrayList<Object>();
		//List l=new ArrayList();
		// ArrayList<Integer> in=new ArrayList<Integer>();
		
		// 1. adding array element
		
		ar.add("Ilamathi");
		ar.add(22);
		ar.add("Accenture");
        ar.add("Kavyasree");
        ar.add(21);
        
        //2. printing the elements
        
        System.out.println("Printing the array elements "+ar);
        
        //3.Element insertion
        
         ar.add(3,"CDC2");
         System.out.println("Element insertion in the list"+ar);
        
        //4. Remove element
        
        ar.remove(1);
        System.out.println("Removing any particular value "+ar);
        
        //5. modify the values
        
        ar.set(0, "Mathesh");
        System.out.println("Modified value"+ar);
        
        //6. access specific element form the list
    
        System.out.println(ar.get(1));
        
        // 7. Read all the elements form the list using i) for loop ii) for each loop  iii) using Iterator
        
        for(int i=0;i<ar.size();i++)
        { 
        	System.out.println("For loop "+ar.get(i));                         // for loop
        } 
        
        for(Object x:ar)
        {
        	System.out.println("For each loop "+x);                                 // for each loop
        }
        
        Iterator<Object> it=ar.iterator();
        while(it.hasNext())
        {
        	System.out.println("Iterator "+it.next());              // Iterator
        }
        
        
      //  8. size of array
        
        System.out.println("Size of the ArrayList is :"+ar.size());
        
      // 9. array list is empty or not
        
         System.out.println(ar.isEmpty());   
        // ar.clear();                        // to remove all the elements in a array we can use ar.clear();
        //System.out.println(ar.isEmpty());    // it will return now
	
     // to remove multiple values in the list 
         
       List<Object> l=new ArrayList<Object>();    // create a separate ArrayList then pass it as a parameter to remove all
	   l.add("Accenture");
	   l.add("Kavyasree");
	  
	  ar.removeAll(l);
	  System.out.println(ar);
	  
	
	}

}
