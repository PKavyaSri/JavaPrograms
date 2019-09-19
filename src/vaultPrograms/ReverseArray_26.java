package vaultPrograms;

import java.util.Arrays;

public class ReverseArray_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // ********** Simple Approach******* 
		/*int[] a= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+",");
		}*/
		
		//*********** Second Approach *********
		int[] a= {1,2,3,4,5};
		System.out.println(Arrays.toString(reverseArray(a)));
	}	
public static int[] reverseArray(int[] a)
{
	int[] temp=new int[a.length];
	int count=0;
	for(int i=a.length-1;i>=0;i--)
	{
		temp[count]=a[i];
		count++;
	}
	for(int i=0;i<temp.length;i++)
	{
		a[i]=temp[i];
	}
	return a;
}
}
