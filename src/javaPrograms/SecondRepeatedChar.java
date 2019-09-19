package javaPrograms;

import java.util.*;
import java.util.List;

public class SecondRepeatedChar {
	
	
	public static void test(String s)
	{
	int count=0;
	char c=' ';
	List<Character> list=new ArrayList<Character>();
	for(int i=0;i<s.length();i++)
	{
	if(list.contains(s.charAt(i)))
	{
	count++;
	if(c!=s.charAt(i) && count>1)
	{
	System.out.println(s.charAt(i));
	break;
	}
	c=s.charAt(i);
	}else
	{
	list.add(s.charAt(i));
	}
	}

	}
	public static void test1(String s)
	{
	int count=0;

	Set<Character> set=new HashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
	if(set.add(s.charAt(i))==false)
	{
	count++;
	}
	if(count>1)
	{
	System.out.print(s.charAt(i));
	}
	}
	}


	public static void main(String[] args) {
		String s="ababcc";
		test(s);
		test1(s);

	}

}
