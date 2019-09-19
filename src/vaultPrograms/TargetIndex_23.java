package vaultPrograms;

public class TargetIndex_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a= {1,3,4,5,6,8};
      int target=4;
      System.out.println(indexOfElement(a,target));
	}
	public static int indexOfElement(int[] a,int target)
	{
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(a[i]>=a[mid])
			{
				i=mid+1;
			}
			else if(a[i]<=mid)
			{
				j=j-1;
			}
			else
			{
				return(mid);
			}
		}
		return i;
	}
	}


