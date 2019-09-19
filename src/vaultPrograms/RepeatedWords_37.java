package vaultPrograms;
import java.util.*;
public class RepeatedWords_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s="Book key table book key smart on Book the table science book";
		
		String[] s1=s.split(" ");
		System.out.println(repeatedWords(s1));
		
	}
    public static int repeatedWords(String[] s1)
    {
    	int count=0;
    	Map<String,Integer> map=new HashMap<String,Integer>();
    	for(String ss:s1)
    	{
    		if(map.containsKey(ss)) 
    		{
    			map.put(ss, map.get(ss)+1);
    		}
    		else
    		{
    			map.put(ss, 1);
    		}
    	}
    	for(Map.Entry<String,Integer> m:map.entrySet())
    	{
    		if(m.getValue()>=2)
    		{
    			System.out.println(m.getKey()+"  "+m.getValue());
    			count++;
    		}
    	}
    	return count;
    }
}
