package vaultPrograms;
import java.util.*;
public class SearchParticularChar_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="manjusha";
		char ck='z';
		charsInString(s,ck);
		//char[] ch=s.toCharArray();
	    //System.out.println(findChar(s,ck));
		/*boolean a=(charsInString(ch,ck));
		if(a==true) {
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed"); 
		}*/
		/*Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			map.put(c, 1);
		}
		if(map.containsKey(ck))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
	    /*Set<Character> set=new HashSet<Character>();
	    for(char c:ch)
	    {
	    	set.add(c);
	    }
	    if(set.contains(ck))
	    	{
	    		System.out.println("test passed");
	    	}
	    else
	    {
	    	System.out.println("test failed");
	    }*/
	}
public static void charsInString(String s,char ck)
{
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==ck)
		{
			System.out.println("true");
			return;
		}
	}
	System.out.println("false");

}
/*public static boolean findChar(String s,char ck)
{
	List li=new ArrayList();
	char[] ch=s.toCharArray();
	for(char c:ch)
	{
		li.add(c);
	}
	if(li.contains(ck))
	{
		return true;
	}
	else
	{
		return false;
	}
}*/
}
