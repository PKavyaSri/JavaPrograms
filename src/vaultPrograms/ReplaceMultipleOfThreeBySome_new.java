package vaultPrograms;
import java.util.*;

public class ReplaceMultipleOfThreeBySome_new {

	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9};
		String[]  s=new String[a.length];
		for(int i=0;i<s.length;i++)
		{
		s[i]=String.valueOf(a[i]);
		//System.out.print(s[i]+" ");
		if(a[i]%3==0)
		{
		s[i]="%20";
		}

		}
		System.out.println(Arrays.toString(s));

		/*for(int i=1;i<20;i++)
		{
			if(i%3==0)
			{
				System.out.print("%20"+",");
			}
			else
			{
				System.out.print(i+",");
			}
		}*/
	}
}
