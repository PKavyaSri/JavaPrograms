package vaultPrograms;

import java.util.Arrays;

public class MoveZerostoEnd_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //*************** MOVE ZEROS TO END ****************
		
		/*int[] a= {2,8,0,7,4,0,1,0,0};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count++;
			}
		}
			while(count<a.length)
			{
				a[count]=0;
				count++;
			}
		System.out.println(Arrays.toString(a));*/
		
		//****************MOVE ZEROS TO FRONT****************
		
		/*int[] a= {2,0,7,0,6,1,0,0,4};
		int count=a.length-1;
		for(int i=count;i>=0;i--)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count--;
			}
		}
		while(count>=0)
		{
			a[count--]=0;
			
		}
		System.out.println(Arrays.toString(a));*/
	
	//*************** 2nd Approach(MOVE ZEROS TO END)****************
		int[] a= {1,0,9,3,0,7,2,0,55,0};
		
		int count=0,temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}
