package vaultPrograms;
import java.util.*;
public class CouneachCharInString_34t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"racecar","abcdecac","override","madam" };
		countOfCharacter(s);
	}
   public static void countOfCharacter(String[] s) 
   {
	   Map<String,Map<Character,Integer>> hmap=new HashMap<>();
	   for(String ss:s)
	   {
		   Map<Character,Integer> lmap=new LinkedHashMap<>();
		   char[] ch=ss.toCharArray();
		   for(char c:ch)
		   {
			   if(lmap.containsKey(c))
			   {
				   lmap.put(c,lmap.get(c)+1);
			   }
			   else
			   {
				   lmap.put(c, 1);
			   }
			   hmap.put(ss, lmap);
		   }
		   
	   }
	   System.out.println(hmap);
   }
}
