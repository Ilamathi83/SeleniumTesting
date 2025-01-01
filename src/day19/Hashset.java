package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		// types of declaration for the HashSet
		
				HashSet<Object> hs=new HashSet<Object>();
				//Set l=new HashSet();
				//HashSet<Integer> in=new HashSet<Integer>();
				
				// 1. adding array element
				
				hs.add("Ilamathi");
				hs.add(22);
				hs.add("Accenture");
		        hs.add("Kavyasree");
		        hs.add(21);
		        
		        //2. printing the elements
		        
		        System.out.println("Printing the array elements "+hs);
		        
		        //3.Element insertion is not possible in HashSet as it is not following the order, we can only add values
		        
		        //4. Remove element
		        
		        hs.remove("Accenture");
		        System.out.println("Removing any particular value "+hs);
		        
		      /* //5. modify the values   
		        
		        ar.set(0, "Mathesh");
		        System.out.println("Modified value"+ar);*/
		        
		        //6. access specific element form the list is not possible but there is one alternate option
		              // we can convert the set to arrayList
		    
		        ArrayList<Object> ar=new ArrayList<Object>(hs);
		        System.out.println(ar.get(2));             // similarly for modification
		        ar.set(0, "Mathesh");
		        System.out.println("Modified value"+ar);
		        
		      // 7. Read all the elements form the list can be done only using for each loop and iterator
		        
		  
		        for(Object x:hs)
		        {
		        	System.out.println("For each loop "+x);                 // for each loop
		        }
		        
		        Iterator<Object> it=hs.iterator();
		       
		        while(it.hasNext())
		        {
		        	System.out.println("Iterator "+it.next());              // Iterator
		        }
		        
		        
		      //  8. size of array
		        
		        System.out.println("Size of the ArrayList is :"+hs.size());
		        
		     // 9. array list is empty or not
		        
		         System.out.println(hs.isEmpty());   
		        // hs.clear();                        // to remove all the elements in a set we can use hs.clear();
		        //System.out.println(hs.isEmpty());    // it will return now
			
		     // to remove multiple values in the list 
		         
		       Set<String> l=new HashSet<String>();   // create a separate Set then pass it as a parameter to remove all
			   l.add("Accenture");
			   l.add("Kavyasree");
			  
			  hs.removeAll(l);
			  System.out.println(hs);	

	}

}
