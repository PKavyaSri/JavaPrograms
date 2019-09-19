package javaPrograms;


	import java.util.HashMap;
	import java.util.Map;

	public class Anagrahm {

		public static void main(String[] args) {
			String s1="madamh";
			String s2="dammha";
			boolean flag=true;
			if(s1.length()!=s2.length()) {
				flag=false;
			}
			else
			{
				Map<Character,Integer>map=new HashMap<>();
				
				
			for(int i=0;i<s1.length();i++) 
			{	
				    char c;
				    int count=0;
				    c=s1.charAt(i);
				    
			     if(map.containsKey(c))
			     {
			    	
			    	 count=map.get(c);
			    	
			     }
			     map.put(c, ++count);
			  			     
			     c=s2.charAt(i);
			     count=0;
			     if(map.containsKey(c))
			     {
			    	 count=map.get(c);
			     }
			     map.put(c, --count);
			     
			      	 
			}
		  
			for(int val:map.values())
			 {
				 if(val!=0) {
					 flag=false;
				 }
				
			 }
			 
			
			}
			if(flag)
				System.out.println("anagram");
			else
				System.out.println("not a anagram");
			
			

		}

	}

