package vaultPrograms;

import java.util.Arrays;

public class DupWordWithoutCollections_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Book key table book key smart on the table science book";
		
		String[] s1=s.split(" ");
		Arrays.sort(s1);
		
		duplicate(s1);
	  }
	  public static void duplicate(String[] s1)
	  {
		  int count=0;int j=0;
		  for(int i=0;i<s1.length-1;i++)
		  {
			  if(s1[i].equals(s1[i+1]))
			  {
				  count++;
				  continue;
			  }
			  else
			  {
				  if(count>0)
					  
				  s1[j++]=s1[i];
				  
				  count=0;
			  }
		  }
		  s1=Arrays.copyOf(s1,j);
		  	System.out.println(Arrays.toString(s1));
	  }
	
	}


