/*
 * Return maximum occurring character in the input string
 */

package Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReturnMaxOccCharacterInaString {

	public static void main(String[] args) {
		String input = "test";
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
			
		for(char c : input.toCharArray()){
			hashmap.put(c, hashmap.containsKey(c) ? hashmap.get(c) + 1 : 1);
		}

		int max = Collections.max(hashmap.values());
			
		for( Map.Entry<Character, Integer> e : hashmap.entrySet()){
			if(e.getValue()==max){
				System.out.println(e.getKey() + ":" +e.getValue());
			}
		}

	}

}
