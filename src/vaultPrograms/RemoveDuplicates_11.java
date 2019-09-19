package vaultPrograms;
import java.util.*;

public class RemoveDuplicates_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // ******** Using Arraylist********
		
		/*int[] a= {0,1,4,2,3,4,2,0};
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
			}
		}
		System.out.println(al);*/
		
		//************Generic Approach ***************
		
		int[] a= {1,0,3,5,6,0,3,5,8};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int b=0;
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[b++]=a[i];
			}
		}
		a[b++]=a[a.length-1];
		a=Arrays.copyOf(a,b);
		System.out.println(Arrays.toString(a));
		
	}

}
