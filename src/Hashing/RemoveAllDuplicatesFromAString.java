/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Remove all duplicates from a String
 * 
 */


package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveAllDuplicatesFromAString {

	public static void main(String[] args) {
		String input = "aabdffsdfusdd";
		
		HashSet<Character> hashset = new LinkedHashSet<Character>();
		
		for(char c : input.toCharArray()){
			hashset.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for(char ch : hashset){
			sb.append(ch);    	
		}
		System.out.println(sb.toString());

	}

}
