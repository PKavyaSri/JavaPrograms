package vaultPrograms;
import java.util.*;
public class OpenCloseBraces_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> st=new Stack<Character>();
		String s="({[)}]";
		int c;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				st.push(s.charAt(i));
			}
			else if(st.isEmpty()) 
			{
				System.out.println("false");
				return;
			}
			else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
			{
			 	 c=st.peek();
			 	 if(s.charAt(i)==')' && c=='('||s.charAt(i)==']' && c=='['||s.charAt(i)=='}' && c=='{')
			 	 {
			 		 st.pop();
			 	 }
			}
		}
	}

	
}
