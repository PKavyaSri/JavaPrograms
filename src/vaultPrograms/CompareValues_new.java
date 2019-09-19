package vaultPrograms;
import java.util.*;
public class CompareValues_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "Java is programming language";
		String s2= "Java is programming language";
		ComStrings(s1,s2);
	}
	/*public static boolean compareValues(String s1,String s2){
        boolean flag=true;
        int[] charcnt=new int[256];
        if (s1.length()!=s2.length()|| s1.isEmpty()||s2.isEmpty()){
            return false;
        }
         for(int i=0;i<s1.length();i++){
             charcnt[s1.charAt(i)]++;
             
             
         }
         for(int i=0;i<s2.length();i++){
             charcnt[s2.charAt(i)]--;
         }
         for (int i=0;i<charcnt.length;i++){
             if(charcnt[i]!=0){
                 return false;
             }
         }
        return true;
}*/
	/*public static void ComStrings(String s1,String s2)
	{
	String s[] = s1.split(" ");
	String st2[] =s2.split(" ");
	List <String> l = new ArrayList<String>(Arrays.asList(s));
	for(int i=0;i<st2.length;i++)
	{
	if(l.contains(st2[i]))
	{
	l.remove(st2[i]);
	}
	else
	{
	l.add(st2[i]);
	}
	}
	if(l.isEmpty())
	{
	System.out.println("String s1 is similar to s2");
	}
	else
	{
	System.out.println("Strings are not equal");
	}
	}*/
	
	public static void ComStrings(String s1,String s2)
	{
		String[] s=s1.split(" ");
		String[] ss=s2.split(" ");
		List<String> li=new ArrayList<String>(Arrays.asList(s));
		List<String> al=new ArrayList<String>(Arrays.asList(ss));
		Collections.sort(li);
		//System.out.println(li);
		Collections.sort(al);
		//System.out.println(al);
		if(li.equals(al)) {
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
	}
}
