package vaultPrograms;
import java.util.*;
public class SortByCollections_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a= {20,10,90,88,99,44,100};
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
			
	}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		/*Set<Integer> set=new TreeSet<Integer>(Arrays.asList(a));
		System.out.println(set);
		
		
		int[] arr= {3,7,8,2,1,4,6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		
		
	}

}
