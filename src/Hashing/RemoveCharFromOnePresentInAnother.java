/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Remove characters from the first string which are present in the second string

		String input = "geeksforgeeks";
		String mask = "mask";
		Output : - geeforgee
 */

package Hashing;

import java.util.HashMap;

public class RemoveCharFromOnePresentInAnother {

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		String mask = "mask";
		
		RemoveFromNormalApproach(input, mask);
		RemoveFromHashTableApproach(input, mask);

	}
	
	public static void RemoveFromNormalApproach(String input1, String input2) {

	    char[] input1char = input1.toCharArray();
	    
	    String output = "";

	    for (int i = 0; i < input1char.length; i++) {
	        String value = String.valueOf(input1char[i]);
	        if (value.equals(" ")) {
	            continue;
	        } else {
	            if (!input2.contains(value)) {
	                 output = output + value;
	            }
	        }
	    }
	    
	    System.out.println(output);
	}
	
	public static void RemoveFromHashTableApproach(String input1, String input2) {
		HashMap<Character,Integer> maskmap = new HashMap<Character,Integer>();
		
		for(int i=0; i<input2.length(); i++){
			char c = input2.charAt(i);
			if(maskmap.containsKey(c))
				maskmap.put(c,maskmap.get(c)+1);
			else
				maskmap.put(c,1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input1.length(); i++){
		 if(!maskmap.containsKey(input1.charAt(i)))
				 sb.append(input1.charAt(i));
		}
		 System.out.println(sb.toString());
		
	}

}
