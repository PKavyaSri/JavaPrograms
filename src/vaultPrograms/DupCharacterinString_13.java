package vaultPrograms;
import java.util.*;
public class DupCharacterinString_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//******* Using HashMap*************
		
		/*String s="abcdedef";
		char[] ch=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:ch)
		{
		  if(map.containsKey(c))
		  {
			  map.put(c, map.get(c)+1);
		  }
		  else
		  {
			  map.put(c,1);
		  }
		}
		for(Map.Entry<Character, Integer> m:map.entrySet())
		{
			if(m.getValue()>=2) 
			{
			System.out.println(m.getKey());
			}
		}*/
		//*********Using HashSet **********
		
		/* String s="abcdedef";
		char[] ch=s.toCharArray();

		 Set<Character> set=new HashSet<Character>();
		for(Character c:ch)
		{
			if(set.contains(c))
			{
				System.out.println(c);
			}
			else
			{
				set.add(c);
			}
		}*/
		//************ IntArray Dup**************
		
		int[] a= {20,10,50,10,30,50,20};
		Arrays.sort(a);
		int temp=0,count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
			   count++;
			   continue;
			}
			else
			{
				if(count>0)
				a[temp++]=a[i];
				count=0;
			}
		}
		Arrays.copyOf(a,temp);
		System.out.println(Arrays.toString(a));
	}

}
