package vaultPrograms;

public class SubString_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="blueprint";
		String sub="bprint";
	   int j=0;
	   boolean b=false;
	   for(int i=0;i<s.length();i++)
	   {
		   if(sub.charAt(j)==s.charAt(i))
		   {
			   j++;
		   }
		   else
		   {
			  j=0; 
		   }
		   if(j==sub.length())
		   {
			   b=true;
			   break;
		   }
	   }
		 if(b==true)
		 {
			 System.out.println("it is substring");
		 }
		 else
		 {
			 System.out.println("it is not substring");
		 }
	   
   }
}
