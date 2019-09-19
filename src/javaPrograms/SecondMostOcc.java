package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostOcc {

	public static void main(String[] args) {
		
		 String s="sabbabbs";
		 int max=0,smax=0;
		 char smaxch=' ',maxch=' ';
		 char[] ch=s.toCharArray();
		 Map<Character,Integer> hm=new LinkedHashMap<>();
		 for(Character c:ch)
		 {
		 if(hm.containsKey(c))
		 {
		 hm.put(c,hm.get(c)+1);
		 }
		 else
		 {
		 hm.put(c,1);
		 }
		 }
		 for(Map.Entry<Character,Integer> m:hm.entrySet())
		 {
		 if(m.getValue()>max)
		 {
		 smax=max;  
		 max=m.getValue();  
		 smaxch=maxch;  
		 maxch=m.getKey();
		 }
		 else if(m.getValue()>smax && m.getValue()!=max)
		 {
		 smaxch=m.getKey();
		 smax=m.getValue();
		 }
		 }
		 System.out.println(smaxch +" "+smax);;

		 }

	}