package vaultPrograms;

public class SuStrinCount_42 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="flipcart";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
				count++;
			}
		}
		System.out.println(count);*/
		
	
	   static int count=0;
		public static void subString(String sub,String s)
		{
			if(s.length()==0)
			return;

			sub=sub+s.charAt(0);
			
			System.out.println(sub);
			count++;
			   subString(sub, s.substring(1, s.length()));
			   return;
			}


			public static void main(String[] args) {

			String s="abcd";
			int n = s.length();
					for(int i=0;i<n;i++) 
			{
			String sub="";
			subString(sub,s);
			s=s.substring(1, s.length());
			}
			System.out.println(count);
	}    
			}


