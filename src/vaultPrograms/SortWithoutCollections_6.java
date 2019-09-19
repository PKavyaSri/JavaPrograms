package vaultPrograms;

import java.util.Arrays;

public class SortWithoutCollections_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int[] a= {2,7,5,1,0,9,6,3};
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
}*/
//*****************DESCENDING ORDER****************
	/* int[] a= {30,-1,9,0,4,22,11,6};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}*/
//****************BUBBLE SORT ***************
		
		int[] a= {3,1,5,0,9,4,7};
		System.out.println(Arrays.toString(a));
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				a[i]=a[i]+a[i-1];
				a[i-1]=a[i]-a[i-1];
				a[i]=a[i]-a[i-1];
				i=0;
			}
		}
		System.out.println(Arrays.copyOf(a,a.length));
}
}