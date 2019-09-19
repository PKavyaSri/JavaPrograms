package vaultPrograms;
import java.util.*;
public class NoOfOccurenceOfEachDigit_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] a= {0,1,2,2,1,3,4,5,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a);
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int i:a)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		System.out.println(map);
		for(int m:map.keySet())
		{
			if(map.get(m)>=4)
			System.out.println(m);
		}
		for(Map.Entry<Integer, Integer> e:map.entrySet()) {
			//if(e.getValue()>=3)
			
			System.out.println(e.getKey()+" "+e.getValue());
		}
		*/
		// *************2nd Way***************
		
		int[] a= {0,1,1,1,3,2,4,4,5,6};
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]=count[a[i]]+1;
			
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>=1)
			{
				System.out.println(i+" "+count[i]);
				
			}
		}
	}

}
