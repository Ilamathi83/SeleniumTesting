package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		// declaring the HashMap
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		Map<Integer, Object> m=new HashMap<Integer, Object>();
		
		// aligning values
       
		hm.put(101,"Ilamathi");
		hm.put(102,"Kavyasree");
		hm.put(102, "Suruthi");       // 102 got overrided here, so 102 will be mapped with Suruthi
		
		System.out.println(hm);           // printing the values
		System.out.println(hm.size());    // size
	
	    hm.remove(102,hm);                  // first duplicate will be removed else if you enter just 102 then both will be removed
	    System.out.println(hm);
	   
	    hm.replace(102,"kavi");           // modify the value
	    System.out.println(hm);
	    
	   System.out.println(hm.get(102));        // access particular value
	   System.out.println(hm.keySet());        // all the keys can be printed
	   System.out.println(hm.values());        // all the values can be printed
	  
	   System.out.println(hm.entrySet());      // keys along with the values can be printed
	   
	   // reading values from the map
	   
	   for(Object x:hm.keySet())
	   {
		   System.out.println(x+" "+hm.get(x));     // enhanced for loop
	   }
	   
	 Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
	 while(it.hasNext())
	 {
		 Entry<Integer, String> s=it.next();
		 System.out.println(s.getKey()+" "+s.getValue());           // iterator
	 }
	   
	  
	}

}
