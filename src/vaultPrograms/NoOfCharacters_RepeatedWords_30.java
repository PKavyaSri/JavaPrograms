package vaultPrograms;
import java.util.*;
public class NoOfCharacters_RepeatedWords_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="selenium is most popular languages in automation selenium is a";
		char[] ch=s.toCharArray();
		int l=ch.length;
		System.out.println("no of characters:"+l);
		String[] word=s.split(" ");
		System.out.println(repeatedWords(word));
		
	}
public static int repeatedWords(String[] word)
{
	int count=0;
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(String ss:word)
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
	for(Map.Entry<String, Integer> m:map.entrySet())
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
