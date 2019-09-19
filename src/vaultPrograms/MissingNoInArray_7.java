package vaultPrograms;
import java.util.*;
public class MissingNoInArray_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a= {2,0,8,1,4,11,5};
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
		for(int i=0;i<Collections.max(li);i++)
		{
			if(!li.contains(i))
			{
				System.out.println(i);
			}
		}
	}

}
