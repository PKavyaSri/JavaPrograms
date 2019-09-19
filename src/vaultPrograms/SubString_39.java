package vaultPrograms;

public class SubString_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1="rabbbit";
		String s2="ab";
		int m=s1.length();
		int n=s2.length();
		System.out.println(subString(s1,s2,m,n));
		
	}
   public static boolean subString(String s1,String s2,int m,int n)
   {
	   int j=0;
	   for(int i=0;i<m && j<n;i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				j++;
			}
		}
	   return n==j;
   }
}
