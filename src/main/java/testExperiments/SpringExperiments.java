package testExperiments;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SpringExperiments {
 
	
	
	public static String abc= new String();
	
	public static void main(String[] args) {
		
		abc="Naresh";
		System.out.println("Original String = "+ abc);
		String reverse = new String();
		int len= abc.length();
		int i=0;
		for (i=len-1;i>-1;i--)
		{
			reverse = reverse+ abc.charAt(i);
		}
		System.out.println("Reversed String = "+reverse );
	     
		//
		
		abc="aabccddhgglopga";
		
		char[] cha= abc.toCharArray();
		Map<Character, Integer> dmap= new HashMap<Character, Integer>();
		
	    for (Character ch: cha)
	    {
	        if( dmap.containsKey(ch))
	        	dmap.put(ch,dmap.get(ch)+1 );
	        	else
	        	dmap.put(ch,1);
	        	
	    }
	    Iterator<Character> itr = dmap.keySet().iterator();
	    while(itr.hasNext()){
	    	  char key=(char) itr.next();
	    	 	if(dmap.get(key)>1)
	    	 	System.out.println("Duplicate Character is = " + key + "  ,  Number of times = "+ dmap.get(key));	
	    }
	    
	      
	    
	    // Find Sub set
	    
	    
	}
	
}
