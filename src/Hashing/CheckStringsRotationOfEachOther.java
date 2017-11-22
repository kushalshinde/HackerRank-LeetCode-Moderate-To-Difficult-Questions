/*
 * Program to check if strings are rotations of each other or not
 */

package Hashing;

import java.util.HashMap;

public class CheckStringsRotationOfEachOther {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		
		for(int i=0; i<str1.length(); i++){
			char c = str1.charAt(i);
			if(hashmap.containsKey(c))
				hashmap.put(c,hashmap.get(c)+1);
			else
				hashmap.put(c,1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str2.length(); i++){
		 if(!hashmap.containsKey(str2.charAt(i)))
				 sb.append(str2.charAt(i));
		}
		if(sb.toString().isEmpty())
			System.out.println("Rotating String");
		else
			System.out.println("not a rotating string");

	}

}
