package javaPrograms;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
	
		int A1[]= {1,2,3,4,5,6};
		int A2[] = {1,1,2,2,5,5,6,6};
		int A3[] = new int[A1.length+A2.length];
		
		int count =0;
		for(int i=0;i<A1.length;i++)
		{
			A3[i] = A1[i];
			count++;
		}
		for(int j=0;j<A2.length;j++)
		{
			A3[count++]= A2[j];
		}

		Arrays.sort(A3);
		System.out.println(Arrays.toString(A3));
		
	}

}
