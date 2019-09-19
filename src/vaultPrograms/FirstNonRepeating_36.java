package vaultPrograms;

public class FirstNonRepeating_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="maedamedc";
		char[] ch=s.toCharArray();
	    for(Character c:ch)
	    {
	    	if(s.indexOf(c)==s.lastIndexOf(c))
	    	{
	    		System.out.println("First non repeating is:"+c);
	    		break;
	    	}
	    }
	}

}
