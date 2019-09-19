package vaultPrograms;
import java.util.*;
public class RemoveDupFromArray_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	/*	Integer[] a= {20,5,7,8,9,10,20,50,10,3};
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		Collections.sort(li);
		System.out.println(li);
		
		for(int i=0;i<li.size();i++)
		{
			if(li.contains(li.get(i)))
			{
				li.remove(a[i]);
			}
		}
			System.out.println(li);*/
		
		//**************** by HashSet*********************
		
		/*Integer[] a= {1,5,8,9,3,4,2,5,6,8,9};
		//Set<Integer> set= new HashSet<Integer>(Arrays.asList(a));
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);*/
		
		//****************** by List ************************
		
		Integer[] a= {20,30,10,90,60,10,40,20};
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				
			}
		}
		System.out.println(al);
	}

}
