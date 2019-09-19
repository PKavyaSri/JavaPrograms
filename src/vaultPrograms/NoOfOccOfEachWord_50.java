package vaultPrograms;
import java.util.*;
public class NoOfOccOfEachWord_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="internet safari chrome opera";
		String[] words=s.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String ss:words)
		{
			if(map.containsKey(ss))
			{
				map.put(ss,map.get(ss)+1);
			}
			else
			{
				map.put(ss, 1);
			}
		}
		System.out.println(map);
	}

}
