package vaultPrograms;

public class MissingNoInArray_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,3,6,8,10};
		int count=0;
		for(int i=0;i<a[a.length-1];i++)
		{
			if(i!=a[count])
			{
				System.out.println(i);
			}
			else
			{
				count++;
			}
		}	
	}

}
