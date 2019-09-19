package vaultPrograms;

public class ReverseString_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //*********Approach 1***********
		
		/*String s="web internet web chrome internet safari";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		/*String s="web internet web chrome internet safari";
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
				res=res+s1+' ';
				s1="";
			}
			if(i==0)
				res=res+s1;
		}
		System.out.println(res);*/
		/*String s="web internet web chrome internet safari";
		String[] word=s.split(" ");
		for(int i=0;i<word.length;i++)
		{
		  System.out.print(word[i]+"");
		  }
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i] +" ");
		}*/
		
		String s="sampurna chowdary";
		      String[] word=s.split(" ");
		        for(int i=1;i<word.length;i++){
		            for(int j=word[i].length()-1;j>=0;j--){
		                System.out.print(word[i].charAt(j));
		            }

		        }
		     }
		
	}


