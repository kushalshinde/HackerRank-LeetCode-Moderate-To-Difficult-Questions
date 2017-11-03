/*
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. 
However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

1. Its length is at least 6.
2. It contains at least one digit.
3. It contains at least one lowercase English character.
4. It contains at least one uppercase English character.
5. It contains at least one special character. The special characters are: !@#$%^&*()-+

She typed a random string of length n in the password field but wasn't sure if it was strong. Given the string she typed, 
can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+" 

==============================================================
Input 1: -
3
Ab1

Expected Output 1: -  
3
==============================================================
Input 2: -
11
#HackerRank

Expected Output 2: -  
1
==============================================================
Input 3: -
5
rZaEu

Expected Output 3: -  
2
==============================================================
  
  
 */

package Algorithms;

import java.util.*;

public class StrongPassword {
	static int minimumNumber(int n, String password) {
		   
        char[] pass = password.toCharArray();
 
        boolean[] flags = new boolean[4];    
        
        int count=0;
        if(n<6)
            count+=(6-n);
        	
        for(char c : pass) {
        	if(!flags[0]) {
        		if(Character.isLowerCase(c))
        			flags[0] = true;
        	}
        	if(!flags[1]) {
        		if(Character.isUpperCase(c))
        			flags[1] = true;
        	}
        	if(!flags[2]) {
        		if(Character.isDigit(c))
        			flags[2] = true;
        	}
        	if(!flags[3]) {
        		if(checkAlphanumeric(c))
        			flags[3] = true;
        	}
        }	
        
        int countflag=0;
        for(boolean bol : flags)
        	if(bol == false)
        		countflag++;
        
        return Math.max(count, countflag);  
	}
   
    static boolean checkAlphanumeric(char c) {
    	String special_characters = "!@#$%^&*()-+";
    	for(char i : special_characters.toCharArray()) {
    		if(i==c)
    			return true;
    	}
    	return false;
    }
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }

}
