package javaPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class BasedOnTargetReturnIndex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] a= {6,3,5,7,8,11,9};
		//Arrays.sort(a);
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		System.out.println(previousValue(a,target));
		
	}
	public static int previousValue(int[] a,int target)
	{
		 for(int i=0;i<a.length;i++)
		 {
			 if(target==a[0])
			 {
				 System.out.println("no previous element");
				 break;
			 }
			 else if(target==a[i]|| a[i]>target)
			 {
				 return a[i-1];
			 }
			 else if(target>a[a.length-1])
			 {
				 return a[a.length-1];
			 }
		 }
		return 0;
	}*/

Integer[] b= {2,9,1,7,5,0,3};
List<Integer> li=new ArrayList<Integer>(Arrays.asList(b));
int target =7;
   int count=0;
   if(li.contains(target)){
     count=li.indexOf(target)-1;
     
}
   else if(!li.contains(target)){
       li.add(target);
       Collections.sort(li);
       count=li.indexOf(target)-1;
}
System.out.println(count);
}
}