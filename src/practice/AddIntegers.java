package practice;

public class AddIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="5Sampurna1991";
	      String num="";
	      int sum=0;
	      for(int i=0;i<s.length();i++)
	      {
	         if(Character.isDigit(s.charAt(i)))
	          {
	              num=num+s.charAt(i);
	          }
	          else if(!num.equals(""))
	          {
	            sum=sum+Integer.parseInt(num);
	            num="";
	           }
	        if(i==s.length()-1)
	         {
	             sum=sum+Integer.parseInt(num);
	          }
	      }
	        System.out.println(sum);
	}

}
