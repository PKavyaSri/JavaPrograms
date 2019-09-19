package vaultPrograms;
import java.util.*;
public class PerTwentyPrg_New {

	public static void main(String[] args) {
		
		df(ss,ss.length);
	}

		static String s="abc123de45fge7";
		static String ss[] =s.split("");

		public static void df(String [] ss, int length) {

		for (int i = 0; i < s.length(); i++) {

		if(Character.isAlphabetic(s.charAt(i)))
		{

		ss[i]="%20";

		}
		}
		System.out.println(Arrays.toString(ss));
		}


	}


