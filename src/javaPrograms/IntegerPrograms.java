package javaPrograms;

public class IntegerPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=0,b=1,c;
		 int num=10;
		 System.out.println(a);
		 System.out.println(b);
		for(int i=0;i<num;i++)
		{
		  c=a+b;
		  System.out.println(c);
		  a=b;
		  b=c;
		}*/
		
		/*for(int i=1;i<10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}*/
		/*for(int i=1;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}*/
		/*int limit = 100;

        System.out.println("Prime numbers between 1 and " + limit);

        //loop through the numbers one by one
        for(int i=1; i < 100; i++){

                boolean isPrime = true;

                //check to see if the number is prime
                for(int j=2; j < i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.print(i + " ");
        }	*/
		
		int a=0,b=1,count=0;
		for(int i=0;i<89;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			for(int j=2;j<c-1;j++)
			{
				if(c%j==0)
				{
					count++;
				}
			}
			if(count<0)
			{
				System.out.println(c+" ");
			}
		}
	}

}