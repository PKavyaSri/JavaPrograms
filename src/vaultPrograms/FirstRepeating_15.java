package vaultPrograms;
import java.util.*;
public class FirstRepeating_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcddeff";
		System.out.println(firstRepeating(s));
		
	}
	public static Character firstRepeating(String s)
	{
		char[] ch=s.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(char c:ch)
		{
			if(set.contains(c))
			{
				return c;
			}
			else
				set.add(c);
		}
		return '\0';
	}

}
