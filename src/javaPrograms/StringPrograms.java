package javaPrograms;

import java.util.LinkedHashMap;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		commaString("rahul");
		remLastWord("it is rainy season");
		remFirstWord("it is rainy season");
		replaceAllEx("saiyuvansaisuryasai");
		remSpace("  this is    sampurna   g");
		vowelsCount("sampurnaaeiou");
		lengthFunction("sampurna");
		reverseString("yuvan");
		swapString("rama","seetha");
		countAlphabets("abc12ghyy6789mj9773839jjsyhhns");
		removeSpecialChar("!jsiismk#788%6&&(*&&^abcdefghijk");
		reverseStrByStringBuffer("purna");
		revSentence("purna chowdary gadipudi");
		revEachWord("tulasi surya sasi ajay sai");
		revParticularWord("surya teja sai ajay");
		stringManipulation("Rama", "Seetha");
		
	}
public static void commaString(String s)
{
	String cs="";
	for(int i=0;i<s.length();i++) {
		cs=cs+s.charAt(i)+",";
	}
	System.out.println(cs);
	
}
public static void remLastWord(String s)
{
 String word="is";
 String temp="";
 if(s.contains(word))
 {
	 temp=" "+word;
	 s=s.replace(temp,"");
	 System.out.println(s);
 }
}
public static void remFirstWord(String s)
{
  String word="it";
  String temp="";
  if(s.contains(word))
  {
	  temp=word+" ";
	  s=s.replace(temp, "");
	  System.out.println(s);
  }
}
public static void replaceAllEx(String s)
{
	String word="sai";
	s=s.replaceAll(word," ");
	s=s.trim();
	System.out.println(s);
}
public static void remSpace(String s)
{
	String rs=s.replaceAll("\\s","");
	System.out.println(rs);
}
public static void vowelsCount(String s)
{
	s=s.replaceAll("[^aeiouAEIOU]","");
	LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
	for(int i=0;i<s.length();i++)
	{
		if(map.containsKey(s.charAt(i)))
			{
			 map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			 else
			 {
				 map.put(s.charAt(i), 1);
			 }
	}
	System.out.println(map);
			 
}
public static void lengthFunction(String s)
{
	int count=0;
	char ch[]=s.toCharArray();
	for(char c:ch)
	{
		count++;
	}
	System.out.println(count);
}
public static void reverseString(String s)
{
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
}
public static void swapString(String s1,String s2)
{
	 s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println(s1 + "  "+ s2);
}
public static void countAlphabets(String s)
{
	s=s.replaceAll("[0-9]","");
	System.out.println(s.length());
}
public static void removeSpecialChar(String s)
{
	s=s.replaceAll("[^0-9a-zA-Z]","");
	System.out.println(s);
}
public static void reverseStrByStringBuffer(String s)
{
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
}
public static void revSentence(String s)
{
	String[] words=s.split(" ");
	for(int i=words.length-1;i>=0;i--)
	{
		System.out.print(words[i]+ " ");
	}
	System.out.println();
}
public static void revEachWord(String s)
{
	String word="";
	String eWord="";
	String[] words=s.split(" ");
	for(int i=0;i<words.length;i++)
	{
		 word=words[i];
	for(int j=word.length()-1;j>=0;j--)
	{
		eWord=eWord+word.charAt(j);
	}
	
	eWord=eWord+" ";
	}
  System.out.println(eWord);
}
public static void revParticularWord(String s)
{
	String word;
	String revWord = "";
	//String str = "Sai Teja Pawar";

	String[] st1 = s.split(" ");

	for (int i = 0; i < st1.length; i++) 
	{
		if (st1[i].equals("teja")) 
		{
			word = st1[i];
			for (int j = word.length() - 1; j >= 0; j--) 
			{
				revWord = revWord + word.charAt(j);
			}
			revWord = revWord + " ";
		}

		else {

			revWord = revWord + st1[i] + " ";

		     }
	}

	System.out.println(revWord);
}
public static void stringManipulation(String s1,String s2) 
{
  
  System.out.println(s1.length());//4
  System.out.println(s2.length());//4
  System.out.println(s1.indexOf('a'));//0
  System.out.println(s2.indexOf('z'));// -1,if we dont have this character it will gives you negative value
  System.out.println(s1.indexOf('1'));//same as above -1
  System.out.println(s1.charAt(0));//a
  System.out.println(s2.charAt(2));//j
  //System.out.println(s1.charAt(6));// if we give more than string length it will through string index out of range exception.
 System.out.println(s1.indexOf("d"));//3
 System.out.println(s1.compareTo("Saikrishna"));// -1
 System.out.println(s1.compareTo("Rama"));//0
 System.out.println(s2.compareTo("S"));// 5
 System.out.println(s1.trim());//Rama
 System.out.println(s1.toLowerCase());//rama
 System.out.println(s1.toUpperCase());//RAMA
 System.out.println(s1.compareToIgnoreCase("RAMA"));//0
 System.out.println(s1.concat("Srirama"));//RamaSrirama
 System.out.println(s1.contains("a"));//true
 System.out.println(s1.contentEquals("Rama"));//true
 System.out.println(s1.replace('a', 'b'));//Rbmb
 System.out.println(s1.replace("Ra", "ga"));//gama
 System.out.println(s1.replaceAll(s1, "jio"));//jio
 System.out.println(s1.replaceFirst("a", "s"));//Rsma
 System.out.println(s1.endsWith("z"));//false
 System.out.println(s1.equals(s2));//false
 System.out.println(s1.equalsIgnoreCase("RAMA"));//true
 System.out.println(s1.indexOf('s'));//-1
 System.out.println(s1.indexOf("ma"));//2
 System.out.println(s1.indexOf('a',2));//3
 System.out.println(s1.indexOf("ra",3));//-1
 System.out.println(s1.intern());//Rama
 System.out.println(s1.isEmpty());//false
 System.out.println(s1.lastIndexOf('a'));
 System.out.println(s1.lastIndexOf("ra"));//-1
 System.out.println(s1.lastIndexOf('a', 2));//1
 System.out.println(s1.lastIndexOf("ma", 1));//-1
 System.out.println(s1.length());//4
 System.out.println(s1.substring(2));//ma
 System.out.println(s1.substring(1,2));//a
 System.out.println(s1.toCharArray());//Rama
 
 
}
}


