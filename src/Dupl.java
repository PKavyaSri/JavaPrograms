import java.util.*;

public class Dupl {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,2,1,5,6,7,8,6,6};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int b:a)
		{
			if(!al.contains(b))
			{
				al.add(b);
			}
		}
		
		System.out.println(al);

	}

}
