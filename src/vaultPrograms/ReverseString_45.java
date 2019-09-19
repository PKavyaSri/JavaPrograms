package vaultPrograms;

public class ReverseString_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";
		String s1="";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{	
				s1=s1+s.charAt(i);
			}
			else
			{
				res=s1+" "+res;
				s1="";
			}
			if(i==0)
				res=s1+" "+res;
			
		}
			
		System.out.println(res);
	}

}
