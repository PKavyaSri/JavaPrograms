import java.util.Arrays;

public class MergeArrays {
	
	
	public static void mergeSortedArrays(int arr1[],int arr2[],int m,int n)
	{
	 //   int i,j,k;
	 //   i=m-1;
	 //   j=n-1;
	  //  k=m+n-1;
	    
	    for (int i=n-1; i>=0; i--)
	    {
	        int j, last = arr1[m-1];
	        for (j=m-1; j >= 0 && arr1[j] > arr2[i]; j--)
	        {
	            arr1[j+1] = arr1[j];

	        // If there was a greater element
	        if (j != m-1)
	        {
	            arr1[j+1] = arr2[i];
	            arr2[i] = last;
	        }
	    }
	    }
	   /* while(i>0 && j>0)
	    {
	        if(arr1[i]>arr2[j])
	        {
	        arr1[k]=arr1[i--];
	        }
	        else
	        {
	        arr1[k]=arr2[j--];
	        	        }
	        k--;
	    }
	    while(j>=0)
	    {
	    arr1[k--]=arr2[j--];
	    }*/
	    System.out.println("Merged Sorted Array" + Arrays.toString(arr1));
	}

	public static void mergeSortedArrays(int arr1[],int arr2[])
	{
		int arr3[]= new int[arr1.length + arr2.length];
	    int i,j,k;
	    i = 0;
	    j = 0;
	    k=0;
	    while (i < arr1.length && j < arr2.length) {
	           if (arr1[i] < arr2[j])
	           {
	               arr3[k] = arr1[i];
	               i++;
	           } 
	           else 
	           {
	               arr3[k] = arr2[j];
	               j++;
	           }
	           k++;
	      }

	    if (i < arr1.length) 
	    {
         System.arraycopy(arr1, i, arr3, k, (arr1.length - i));
	    }
	      if (j < arr2.length) 
	      {
	         System.arraycopy(arr2, j, arr3, k, (arr2.length - j));
	      }

       System.out.println("Merged Sorted Array" + Arrays.toString(arr1));
	}
	    
	public static void mergeArrays(int[] arr1, int[] arr2, int m,int n) 
	{ 
	 int i = 0, j = 0, k = 0; 
	 int arr3[] = new int[m+n];
     
      
     while (i<m && j <n) 
     { 
          
         if (arr1[i] < arr2[j]) 
         {
             arr3[k++] = arr1[i++]; 
         }
         else
         {
             arr3[k++] = arr2[j++];
         }
     } 
   
    
    while (i < m) 
     {
         arr3[k++] = arr1[i++]; 
     } 
        
     while (j < n) 
     {
         arr3[k++] = arr2[j++]; 
     }
     System.out.println("Merged Sorted Array" + Arrays.toString(arr3));
 } 
   
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
	      int arr2[] = {1,1,2,2,5,5,6,6,8,0};
	      int m= arr1.length;
	      int n =arr2.length;
	    //  mergeSortedArrays(arr1,arr2);
	   //   mergeSortedArrays(arr1,arr2,m, n);
	      mergeArrays(arr1,arr2,m, n); 

	}

}
