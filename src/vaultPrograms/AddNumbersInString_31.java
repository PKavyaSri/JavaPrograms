package vaultPrograms;

public class AddNumbersInString_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="5sampurna199";
		int sum=0;
		String num="";
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
