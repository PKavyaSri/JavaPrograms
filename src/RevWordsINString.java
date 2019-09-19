import java.util.Arrays;

public class RevWordsINString {

	public static void reverseWords(String str)
	{
		char temp[] =new char[str.length()];
		  
		  if(str==null||str.length()==0)
		   {
		      System.out.println("invalid");
		   }
		   else
		   {
			   for(int i=0;i<str.length();i++)
			   {
				   temp[str.length()-i-1] = str.charAt(i);
			   }
			   
			   System.out.println(temp);
			   
		   }
	}
	
	public static void ReverseTheWords(String str)
	{
		char[] temp= str.toCharArray();
		int x=0;
		int y = 0;
	for (int i = 0; i<=temp.length-1; i++)
	{
      if ((temp[i] == ' ') || (i == temp.length-1))
	  {
		if(i==temp.length-1)
	   {
			x=i;
	   }
		else
		{
			x = i-1;
		} 
		while (y < x)
		{
			char ch= temp[x];
			temp[x] = temp[y];
			temp[y] = ch;
			y++;
			x--;
		}
			y= i+1;
	  }
	 }
	  System.out.println( Arrays.toString(temp));
	}
	
	public static void main(String[] args)
	{
	  String str = "Today Is Wednesday";
	  
	//  reverseWords(str);
	  
	  if(str==null||str.length()==0)
	   {
	      System.out.println("invalid");
	   }
	   else
	   {
	     ReverseTheWords(str);
	 
	   }
	  
	}
	  
}



