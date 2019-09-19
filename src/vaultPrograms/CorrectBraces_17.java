package vaultPrograms;
import java.util.*;

public class CorrectBraces_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> st=new Stack<Character>();
		String s="((()))";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}
			else if(st.isEmpty())
			{
				System.out.println("false");
				return;
			}
			else
			{
				st.pop();
			}
		}
			if(!st.isEmpty())
			{
				System.out.println("false");
			}
		    else
			{
				System.out.println("true");
	        }
		}
		
	}


