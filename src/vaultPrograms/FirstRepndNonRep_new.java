package vaultPrograms;
import java.util.*;
public class FirstRepndNonRep_new {

	public static void main(String[] args) {
		
		System.out.println(firstnonrep("abcdedcd"));
	}
	public static char firstnonrep(String word ) {
			Set<Character> repeating = new HashSet<Character>(); 
			List<Character> nonRepeating = new ArrayList<Character>();
			for (int i = 0; i < word.length(); i++) 
			{ 
			char letter = word.charAt(i); 
			if (repeating.contains(letter)) 
			{
			continue; 
			}
			if (nonRepeating.contains(letter)) 
			{ 
			nonRepeating.remove((Character) letter); 
			repeating.add(letter); 
			} 
			else 
			{ 
			nonRepeating.add(letter); 
			} 
			} 
			System.out.println(nonRepeating.get(0));
			return 0;


	}

}
