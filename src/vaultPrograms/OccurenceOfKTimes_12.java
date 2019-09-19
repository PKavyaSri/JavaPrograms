package vaultPrograms;

import java.util.Scanner;
import java.util.*;

public class OccurenceOfKTimes_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch= {'a','b','b','c','d','f'};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		System.out.println(OccurenceOfKTimes(ch,k));
		
	}
 public static char OccurenceOfKTimes(char[] ch,int k)
 {
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(char c:ch)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
        }
		else
		{
			map.put(c, 1);
		}
	}
	for(Map.Entry<Character, Integer> m:map.entrySet())
	{
		if(m.getValue()==k)
		{
			return(m.getKey());
			// if u want to print all go with sop
			//System.out.println((m.getKey()));
		}
	}
	return 'z';
 }
}
