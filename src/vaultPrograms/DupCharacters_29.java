package vaultPrograms;
import java.util.*;
public class DupCharacters_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="selenium";
		char[] ch=s.toCharArray();
	    Map<Character,Integer> map=new HashMap<Character,Integer>();
	    for(Character c:ch)
	    {
	    	if(map.containsKey(c))
	    	{
	    		map.put(c,map.get(c)+1);
	    	}
	    	else
	    	{
	    		map.put(c,1);
	    	}
	    }
	    for(Map.Entry<Character,Integer> m:map.entrySet())
	    {
	    	if(m.getValue()>1)
	    	{
	    		System.out.println(m.getKey()+ "  "+m.getValue());
	    	}
	    }
	}

}
