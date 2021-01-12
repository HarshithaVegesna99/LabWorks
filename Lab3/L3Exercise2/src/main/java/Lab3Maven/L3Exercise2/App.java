package Lab3Maven.L3Exercise2;
/**
	 * a class containing a method to create the mirror image of a String. 
	 * The method should return the two Strings separated with a pipe(|) symbol 
	 * @author Vegesna.Harshitha 
	 *
	 */

import java.util.*;
public class App {
	
	      
	       public static String stringReverse(String str)
	       {
	    	   
	    	    //sending String to StringBuffer
	              StringBuffer stringbr = new StringBuffer(str);
	              if(stringbr==null) 
		    	 return null;
		    	   
	              //Adding Split Pipe To String
	              stringbr.append('|');
	              // now sbr has "String|"
	              StringBuffer sb = new StringBuffer(str);
	              sb.reverse();
	              
	              stringbr.append(sb);
	              return stringbr.toString();
	       }
	       
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       
	        
           
            System.out.println("Enter a String");
            String str = sc.next();
            System.out.println(""+stringReverse(str));
	        
	        

	}

}