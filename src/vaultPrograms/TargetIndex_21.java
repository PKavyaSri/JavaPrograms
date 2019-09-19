package vaultPrograms;
import java.util.*;
public class TargetIndex_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] a= {1,2,3,5,6,7,10};
		int target=3;
		System.out.println(indexOfElement(a,target));
	}*/
		
		int[] a= {0,1,2,4,6,9};
		//System.out.println(findTarget(a));
		System.out.println(findIndex(a));
	}
		/*public static int findTarget(int[] a)
		{
	        List<Integer> li=new ArrayList<>();
	        for(int i:a)
	        {
	        	li.add(i);
	        }
	        Integer target =7;
	           int count=0;
	           if(li.contains(target))
	           {
	             count=li.indexOf(target)-1;
	           }
	           else if(!li.contains(target))
	           {
	               li.add(target);
	               Collections.sort(li);
	               count=li.indexOf(target)-1;
	           }
	        return count;
	    }*/
			 
      public static int findIndex(int a[])
       { 
         int target=9;
	    for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
			
				return i;
			}
			else if(a[i]>target)
			{
				return i;
			}
		}
		return -1;
	}
}
/*public static int indexOfElement(int[] a,int target)
{
	int i=0;
	int j=a.length-1;
	while(i<=j)
	{
		int mid=(i+j)/2;
		if(target>a[mid])
		{
			i=mid+1;
		}
		else if(target<mid)
		{
			j=j-1;
		}
		else
		{
			return(mid);
		}
	}
	return i;
}*/


