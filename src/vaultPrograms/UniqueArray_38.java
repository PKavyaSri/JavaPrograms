package vaultPrograms;

import java.util.*;

public class UniqueArray_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,8,5,4,2,5,9,7};
		Arrays.sort(a);
		uniqueArray(a);
	}
   /*public static void uniqueArray(int[] a)
   {
	Set<Integer> set=new HashSet<Integer>();
	for(Integer i :a)
	{
		if(i>2.5)
		{
			set.add(i);
		}
	}
	System.out.println(set);
   }*/
	
	public static void uniqueArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1 || a[i]!=a[i+1] && a[i]>2.5)
			{
				System.out.print(a[i]+",");
			}
		}
	}
}
