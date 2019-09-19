package javaPrograms;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            missingNum();
	}

	
	public static void missingNum()
	{

	    int sum1=0,sum2=0;
		int[] a= {2,4,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println(sum1);
		for(int j=2;j<=7;j++)
		{
			sum2=sum2+j;
		}
		System.out.println(sum2);
		System.out.println("missing num is:"+(sum2-sum1));
	}
	

}
