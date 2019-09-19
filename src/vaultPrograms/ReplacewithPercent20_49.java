package vaultPrograms;

public class ReplacewithPercent20_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"abc","bca","def"};
		String ss="";
		for(int i=0;i<s.length;i++)
		{
			ss=ss+s[i]+" ";
		}
		System.out.println(ss);
		ss=ss.replace(" ", "%20");
		System.out.println(ss);
	}

}
