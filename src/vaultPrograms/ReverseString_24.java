package vaultPrograms;

public class ReverseString_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*********1st Apporach**********
		String s="Chennai is a green city";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//*********By StringBuffer********
		
		String s1="Sampurna";
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println(sb);
		
		//********** 2nd Approach **********
		
		/*String s="Chennai is a green city";
		String s1="";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
			s1=s.charAt(i)+s1;
			}
			else
			{
				res=res+s1+" ";
				s1="";
				
			}
			if(i==0)
			{
				res=res+s1;
			}
		}
	
		System.out.println(res);
		*/
    	
    }
}
