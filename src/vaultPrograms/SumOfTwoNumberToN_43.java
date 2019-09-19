package vaultPrograms;

import java.util.*;

public class SumOfTwoNumberToN_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a= {1,2,3,4};
		Integer[] b= {30,29,22,91};
		int sum=31;
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> bl=new ArrayList<>(Arrays.asList(b));
		for(Integer i:al)
		{
			if(bl.contains(sum-i))
			{
				System.out.println(i+","+(sum-i));
			}
			else
			{
				continue;
			}
			
		}
	}
}

		/*int[] a= {2,1,5,6,3,9,7,4,8};
		int sum=8;
		Arrays.sort(a);
		printPairs(a,sum);*/
	
    /*public static void printPairs(int[] a,int sum)
    {
    	int i=0;
    	int j=a.length-1;
    	while(i<j)
    	{
    		if(a[i]+a[j]==sum) 
    		{
    		System.out.println(a[i]+","+a[j]);
    		i++;
    		j--;
    		}
    	
    	else if(a[i]+a[j]<sum)
    	{
    		i++;
    	}
    	else
    	{
    		j--;
    	}
    }*/
	
 /*public static void printPairs(int[] a,int sum)
 {
   HashSet<Integer> set=new HashSet<Integer>();
   for(int i=0;i<a.length;i++)
   {
	   int temp=sum-a[i];
       if(set.contains(temp))
       {
    	  System.out.println(a[i]+","+temp); 
       }
       else
       {
    	   set.add(a[i]);
       }
   }*/


