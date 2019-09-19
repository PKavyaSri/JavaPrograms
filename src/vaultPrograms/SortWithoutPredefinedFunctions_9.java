package vaultPrograms;

import java.util.Arrays;
import java.util.*;

public class SortWithoutPredefinedFunctions_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //******** Without Inbuilt Functions***********
		/*int[] a= {2,0,9,1,7,3,6};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	*/
 //**************** BY USING ARRAYS.SORT ***************
		
		/*int[] a= {2,9,0,1,7,88,30,22};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));*/
 //*************** BY USING ARRAYLIST ***********
		
		Integer[] a= {99,10,1,100,77,200};
		System.out.println(Arrays.toString(a));
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(al);
		System.out.println(al);
}
}