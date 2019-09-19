package javaPrograms;

import java.util.HashMap;

public class CharacterOcc {

	public static void main(String[] args) {
		
		 HashMap<Integer,String> hm = new HashMap<>();
		 hm.put(1, "One");
		 hm.put(2, "Two");
		 hm.put(3, "Three");
		 hm.put(4, "Four");
		 hm.put(5, "Five");
		 hm.put(6, "Six");
		 hm.put(7, "Seven");
		 hm.put(8, "Eight");
		 hm.put(9, "Nine");
		 
		 int count = 1;
		 String s = "aba";

		 StringBuilder sb = new StringBuilder();
		 for(int i=0;i<s.length()-1;i++) {
		  if(s.charAt(i) == s.charAt(i+1))
		  {
		   count= count+1;
		  }
		  else {
		   sb.append(hm.get(count)+" "+s.charAt(i)+",");
		   count = 1;
		  }
		 }
		sb.append(hm.get(count)+" "+s.charAt(s.length()-1));
		 System.out.println(sb);
		}
		}
