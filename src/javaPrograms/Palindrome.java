package javaPrograms;
import java.util.HashMap;
import java.util.Map;
public class Palindrome {

	public static void main(String[] args) {
		String s="aabcdaab";
		boolean flag=false;
		Map<Character,Integer>map=new HashMap<>();
		for(Character c:s.toCharArray())
		{
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else
				map.remove(c);
		}
		System.out.println(map);
		if(s.length()%2==0 && map.size()==0||s.length()%2==1&& map.size()==1)
		{
			flag=true;
		}
		if(flag==true)
			System.out.println("palindrome formed");
		else
			System.out.println("palindrome not formed");

	}
	
}
