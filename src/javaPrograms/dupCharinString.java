package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dupCharinString {

	public static void main(String[] args) {
		
	 String s="kavyaSriPaladugu2";
	 StringBuilder sb=new StringBuilder();
	 List<Character> ls =new ArrayList<>();
	 for(int i=0;i<s.length();i++)
	 {
		 if(!ls.contains(s.charAt(i)))
		 {
			 ls.add(s.charAt(i));
			 sb.append(s.charAt(i));
			// if(s.charAt(s.length()-1))
			 
	    }
	
	 }
//	 System.out.println(s.charAt(s.length()-1));
	 System.out.println(sb);
	
			 

	}

}
