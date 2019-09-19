package vaultPrograms;
import java.util.*;

public class RepeatingWordsByHashMap_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="red,blue,green,red,blue,orange,blue,red";
		String[] s1=s.split(",");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String s2:s1)
		{
			if(map.containsKey(s2))
			{
				map.put(s2,map.get(s2)+1);
			}
			else
			{
				map.put(s2, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getValue()+ "  "+ m.getKey());
			}
		}
	}

}
