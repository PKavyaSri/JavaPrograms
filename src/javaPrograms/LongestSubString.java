package javaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {
	public static void main(String[] args) {
			String s="abedefgh";
			//String s="abcdecdghijk";
			Map<Character,Integer>map=new LinkedHashMap<>();
			List<String>list=new ArrayList<>();
			String r="";
			int count=0;
		for(int i=0;i<s.length();i++)
			{
				if(!map.containsKey(s.charAt(i)))
				{
					map.put(s.charAt(i), 1);
				    r=r+s.charAt(i);
				    
				}
				else
				{
					list.add(r);
					map.clear();
					r="";
	                i=count;
					count=count+1;
					
				}
				if(i==s.length()-1) {
					list.add(r);
				}
					
			}
		System.out.println(list);
		String l="";
		 for(int i=0;i<list.size();i++)
		 {
			if(list.get(i).length()>l.length()) {
				l=list.get(i);
				 
			 }
		 }
		
	   System.out.println(l);
		}

		

	}


