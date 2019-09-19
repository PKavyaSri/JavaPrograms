package vaultPrograms;

import java.util.*;

public class DupChar_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcda";
		char[] ch=s.toCharArray();
		//String ss=new String(ch);
		//System.out.println(ss);
		Arrays.sort(ch);
        System.out.println(dupChar(ch));
		
	}
	public static boolean dupChar(char[] ch)
	{
		boolean b=false;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				b=true;
				break;
			}
			else
			{
				map.put(c, 1);
				
			}
		}
 		/*Set<Character> set=new HashSet<Character>();
		for(Character c:ch)
		{
			if(set.contains(c))
			{
				b=true;
				break;
			}
			else
			{
				set.add(c);
			}
		}*/
		
		/*for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				b=true;
				break;
			}
		}*/
		return b;
	}

}
