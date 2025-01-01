package day7;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" abc,123@xyz"; // abc 123 xyz
		//System.out.println(s.replace(",", " ").replace("@", " "));
 
		String m[]=s.split(",");
		System.out.println(Arrays.toString(m));
	     String n[]=m[1].split("@");
		System.out.println(m[0]+" "+n[0]+" "+n[1]);
		
		//Length()
		System.out.println(s.length());    
		
		//Concatenation
		String q="mathi";
		System.out.println(s.concat(q));
		System.out.println("ila".concat(q));
		System.out.println(s.trim());            // trim
		System.out.println(s.concat(" Ila"+q));
	
		System.out.println(s.charAt(8));            //CharAt()
		System.out.println(s.contains("xy"));       //Contains()
		
		System.out.println("MATHI".equalsIgnoreCase(q));   //Equals and equalsignorecase
		System.out.println(q.equals(s));
		
		System.out.println(s.replace("a"," x"));
		System.err.println(q.substring(0,4));
		System.out.println("ma".substring(0,1));
		
		System.out.println(q.toLowerCase());        //Upper or lower case
		
		s.split("@");
		System.out.println(s);
		
		
	}

}
