package vaultPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveElementRandomly_2 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,4,6,8,2,9,5};
         System.out.println("given array is" +Arrays.toString(a));
         System.out.println("enter element to remove");
         Scanner sc=new Scanner(System.in);
         int value=sc.nextInt();
         System.out.println(Arrays.toString(removeElement(a,value)));
  }
      public static int[] removeElement(int[] a, int value)
{
   int j=0;
   for(int i=0;i<a.length;i++)
   {
	    if(a[i]!=value)
	      { 
		     a[j]=a[i];
		     j++;
	      }
   }
return Arrays.copyOf(a,j);
}*/
//************using HashMap***************	
	/*public static void main(String[] args)
	{
		Integer[] a= {2,4,6,8,9,1};
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		removeElement(a,value);
	}
    public static void removeElement(Integer[] a,int value)
     {
	   HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    for(Integer i:a)
	    {
	    	if(map.containsKey(i))
	    	{
	    		map.put(i, map.get(i)+1);
	    	}
	    	else
	    		map.put(i,1);
	    }
	    System.out.println(map);
	    map.remove(value);
	    System.out.println(map);
      
}*/
	
	/*public static void removeElement(Integer[] a,int value)
	{
		HashSet<Integer> hs=new HashSet<Integer>(Arrays.asList(a));
		hs.remove(value);
		System.out.println(hs);
		
	}*/
	
	public static void main(String[] args)
	{
		Integer[] a= {1,4,6,7,0,3,6,5};
		int x=6;
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)==x)
			{
				li.remove(li.get(i));
				//break;
			}
		}
		System.out.println(li);
	}
}


