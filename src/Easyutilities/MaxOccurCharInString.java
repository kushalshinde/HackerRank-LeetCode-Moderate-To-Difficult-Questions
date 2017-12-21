package Easyutilities;
/*
 * Question: - Return maximum occurring character in the input string
 */
 
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurCharInString{
	public static void main(String[] args){
		String input = "test";
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i =0; i<input.length(); i++){
			char c = input.charAt(i);
			if(hashmap.containsKey(c))
				hashmap.put(c, hashmap.get(c)+1);
			else
				hashmap.put(c,1);
		}
		
		Set<Map.Entry<Character, Integer>> set = hashmap.entrySet();

		int max = Collections.max(hashmap.values());   //finding maximum value of a key
		
		for( Map.Entry<Character, Integer> e : set){
			if(e.getValue()==max){
				System.out.println(e.getKey() + " : " +e.getValue());
			}
		}
	}
}

/*
 * Output: - t : 2
 */
