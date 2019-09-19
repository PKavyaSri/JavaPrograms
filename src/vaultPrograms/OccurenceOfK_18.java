package vaultPrograms;
import java.util.*;
public class OccurenceOfK_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] a= {1,2,3,4,5,7};
		int k=2;
		int[] count=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]=count[a[i]]+1;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>=k)
			{
				System.out.println(i+" "+count[i]);
			}
			}*/
		
		
		int[] a= {1,3,3,7,4,5,7};
		int k=2;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
		}
		for(Map.Entry<Integer,Integer> m:map.entrySet() )
		{
			if(m.getValue()==k)
			{
				System.out.println(m.getKey()+"  "+m.getValue());
			}
		}
		}
	}


