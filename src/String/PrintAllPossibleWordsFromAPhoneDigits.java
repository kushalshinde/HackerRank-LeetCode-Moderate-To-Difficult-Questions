/*
 * Name: - Kushal S Shinde
 * Date: - 20 January 2018
 * Email: - kshinde1@binghamton.edu
 *
 * 
 * Print all possible words from phone digits
 * 
 * Given a keypad as shown in diagram, and a n digit number, list all words which are possible by pressing these numbers.
 * 
 * For example if input number is 234, possible words which can be formed are (Alphabetical order):
 * [adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, 
 *  cdi, ceg, ceh, cei, cfg, cfh, cfi]
 * 
 *   ________________
 *  |    | ABC | DEF |
 *  |  1 |  2  |  3  |
 * 	|____|_____|_____|
 *  |    |     |     |
 *  | GHI| JKL | MNO |
 *  |  4 |  5  |  6  |
 *  |____|_____|_____|  
 *  |    |     |     |
 *  |PQRS| TUV |WXYZ |
 *  | 7  |  8  |  9  |
 *  |____|_____|_____| 
 *  |    |     |     |
 *  | *  |  0  |  #  |
 *  |____|_____|_____|
 *
 * 
 */

package String;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPossibleWordsFromAPhoneDigits {

	public static void main(String[] args) {
		
		String[] array = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int[] digits = {2,3,4};
		
		System.out.println(letterCombinations(array, digits));
		
	}
	 public static List<String> letterCombinations(String[] array, int[] digits) {
         List<String> result = new ArrayList<String>();
 
         if (digits.length==0) 
        	 return result;
         
         result.add("");
         
         for (int i: digits) 
             result = combine(array[i], result);
         
         return result;
     }
     
     public static List<String> combine(String letter, List<String> l) {
         List<String> result = new ArrayList<String>();
         
         for (int i=0; i<letter.length(); i++) 
             for (String x : l) 
                 result.add(x+letter.charAt(i));
 
         return result;
     }
	
}
