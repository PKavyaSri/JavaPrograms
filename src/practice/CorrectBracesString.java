package practice;

import java.util.Stack;

public class CorrectBracesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="((((())))";
	    Stack<Character> st=new Stack<Character>();
	    for(int i=0;i<s.length();i++)
	    {
	       if(s.charAt(i)=='(')
	        {
	             st.push(s.charAt(i));
	        }
	       else if(st.isEmpty())
	       {
	         System.out.println("incorrect String");
	          return;
	        }
	      else
	       {
	         st.pop();
	        }
	    }
	 if(st.isEmpty())
	  {
	    System.out.println("correct string");
	  }
	 else
	 {
	  System.out.println("incorrect string");
	 }
	}

}
