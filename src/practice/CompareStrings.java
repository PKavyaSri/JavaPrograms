package practice;
import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java is a programming language";
	    String s2="java is a programming language";
	    System.out.println(compareStrings(s1,s2));

	}
	public static boolean compareStrings(String s1,String s2)
	{
	   
	   if(s1.length()!=s2.length()||s1.isEmpty()||s2.isEmpty()) {
		   return false;
	   }
	   String[] ss=s1.split(" ");
	   String[] sss=s2.split(" ");
	   List<String> al=new ArrayList<>(Arrays.asList(ss));
	   for(int i=0;i<sss.length;i++)
	   {
	      if(al.contains(sss[i]))
	    		  
	       {
	          al.remove(sss[i]);
	       }
	      else
	       {
	         al.add(sss[i]);
	        }
	   }
	 if(al.isEmpty())
	 {
	   return true;
	 }
	else
	{
	  return false;
	}
}
}
