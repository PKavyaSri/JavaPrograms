package vaultPrograms;
import java.util.*;
public class WordCount_27_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is a string contains string";
		String[] word=s.split(" ");
		System.out.println(wordCount(word));
	}
 public static int  wordCount(String[] word)
 {
	 int count=0;
	 Map<String,Integer> map=new HashMap<String,Integer>();
	 for(String ss:word)
	 {
		 if(map.containsKey(ss))
		 {
			 map.put(ss, map.get(ss)+1);
			 
		 }
		 else
		 {
			 map.put(ss, 1);
		 }
	 }
	 for(Map.Entry<String, Integer> m:map.entrySet())
	 {
		 if(m.getValue()>=1)
		 {
			 System.out.println(m.getKey()+ " "+m.getValue());
			 count++;
		 }
	 }
	 return count;
 }
}
