package vaultPrograms;

public class SumOfNumbersInString_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc123de45fghi6j7";
		String num="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
				if(i==s.length()-1)
				{
					sum=sum+Integer.parseInt(num);
				}
			}
			else if(!num.isEmpty())
			{
				sum=sum+Integer.parseInt(num);
				num="";
			}
		}
		System.out.println(sum);
	}

}
