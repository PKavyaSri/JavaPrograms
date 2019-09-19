package vaultPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class UniqueStrings_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //**********using ArrayList*************
		
		
		/*List<String> li=new ArrayList<String>();
		li.add("rama");
		li.add("seetha");
		li.add("lakshman");
		li.add("rama");
		li.add("hanuma");
		HashSet<String> hs=new HashSet<String>(li);
		System.out.println(hs);
		//treeset by default sorts in some order(asending order)
		TreeSet<String> ts=new TreeSet<String>(li);
		System.out.println(ts);*/
		
		
		
		//using *************HashSet *******************
		
		String[] s= {"rama","seetha","lakshman","hanuman","bharath","rama","seetha"};
		List<String> al=new ArrayList<String>(Arrays.asList(s));
		List<String> arrli=new ArrayList<String>();
		for(String s1:al)
		{
			if(arrli.contains(s1))
			{
				continue;
			}
			else
				arrli.add(s1);
		}
		System.out.println(arrli);
			Collections.sort(arrli);
			System.out.println(arrli);
}

}
