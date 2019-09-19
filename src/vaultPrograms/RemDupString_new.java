package vaultPrograms;
import java.util.*;
public class RemDupString_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"abc","hari","laya","priya","abc","priya","laya"};
		dupString(s);
		
	}

	/*public static void dupString(String[] s)
	{
		Set<String> set=new HashSet<String>();
		for(String ss:s)
		{
			set.add(ss);
		}
		System.out.println(set);
	}*/
		
	/*public static void dupString(String[] s)
	{
		List<String> li=new ArrayList<String>();
		for(String ss:s)
		{
			if(!li.contains(ss))
			{
				li.add(ss);
			}
		}
		System.out.println(li);
		}*/
public static void dupString(String[] s){
        Arrays.sort(s);
        
       for(int i=0;i<s.length;i++)
       {
           while(i<s.length-1&&s[i].equals(s[i+1])){
               i++;
           }
           System.out.println(s[i]);
           
       }
}
       
       
       
}
