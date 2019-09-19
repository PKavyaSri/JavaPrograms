package vaultPrograms;
import java.util.*;
public class RemSpaceWithSpecilaChar_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc bca defs";
		char[] ch=s.toCharArray();
		String text="";
		repSpaceSplChar(ch,text);
	}
   public static void repSpaceSplChar(char[] ch,String text)
   {
	   LinkedList<Character> li=new LinkedList<>();
	   for(int i=0;i<ch.length;i++)
	   {
		   if(ch[i]==' ')
		   {
			li.add('%');
			li.add('2');
			li.add('0');
		   }
		   else
		   {
			   li.add(ch[i]);
		   }
	   }
	   char[] c=new char[li.size()];
	   for(int j=0;j<c.length;j++)
	   {
		   c[j]=li.get(j);
	   }
	   System.out.println(Arrays.toString(c));
	   text=new String(c);
	   System.out.println(text);
   }
}
