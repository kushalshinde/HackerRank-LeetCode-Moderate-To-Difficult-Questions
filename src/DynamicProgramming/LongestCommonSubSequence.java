/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * Date: - 7 December 2017
 * 
 * Longest Common Subsequence (LCS) 
 * 
 * Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence 
 * that appears in the same relative order, but not necessarily contiguous. 
 * For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. 
 * So a string of length n has 2^n different possible subsequences.
 * 
 * 
 * Examples:
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 * 
 */


package DynamicProgramming;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
			
		String string1 = "AGGTAB";
		String string2 = "GXTXAYB";
		
		
		System.out.println(LCSUsingRecursion(string1, string2, string1.length(), string2.length()));
		
		System.out.println(LCSUsingDP(string1, string2, string1.length(), string2.length()));
	}
	
	
	public static int LCSUsingRecursion(String string1, String string2, int length1, int length2) {
		if(length1==0 || length2==0)
			return 0;
		
		if(string1.charAt(length1-1)==string2.charAt(length2-1))
			return (1 + LCSUsingRecursion(string1, string2, length1-1, length2-1));
		else	
			return Math.max(LCSUsingRecursion(string1, string2, length1-1, length2), LCSUsingRecursion(string1, string2, length1, length2-1));
		
	}
	
	public static int LCSUsingDP(String string1, String string2, int length1, int length2) {
		
		int[][] matrix = new int[length1+1][length2+1];
		
		for(int i=0; i<=length1; i++) {
			for(int j=0; j<=length2; j++) {
				if(i==0 || j==0)
					matrix[i][j] = 0;	
				else if(string1.toCharArray()[i-1] == string2.toCharArray()[j-1])
					matrix[i][j] = matrix[i-1][j-1] + 1;
				else
					matrix[i][j] = Math.max(matrix[i][j-1],matrix[i-1][j]);

			}
		}
		
		return matrix[length1][length2];
		
	}


}
