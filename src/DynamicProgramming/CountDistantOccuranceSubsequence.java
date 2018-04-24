/*
 * Name: - Kushal S Shinde
 * 
 * Count distinct occurrences as a subsequence

 * Given a two strings S and T, find count of distinct occurrences of T in S as a subsequence.

 * Input  : S = banana, T = ban
 * Output : 3
 * T appears in S as below three subsequences.
 * [ban], [ba  n], [b   an]

 * Input  : S = geeksforgeeks, T = ge
 * Output : 6
 * T appears in S as below three subsequences.
 * [ge], [     ge], [g e], [g    e] [g     e]
 * and [     g e]     

 * 
 * 
 */


package DynamicProgramming;

public class CountDistantOccuranceSubsequence {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		String t = "ge";
		int i = 0;
		int j = 0;

		System.out.println(recursiveSolutionCheckSubsequence(s, t, i, j));

		System.out.println(dynamicProgrammingCheckSubsequence(s, t));

	}

	public static int dynamicProgrammingCheckSubsequence(String s, String t) {
		int[][] dp = new int[s.length() + 1][t.length() + 1];

		for (int i = 0; i <= s.length(); i++) {
			for (int j = 0; j <= t.length(); j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = 1;
					continue;
				}
				if (i == 0) {
					dp[i][j] = 0;
					continue;
				}

				if (j == 0) {
					dp[i][j] = 1;
					continue;
				}

				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		return dp[s.length()][t.length()];

	}

	public static int recursiveSolutionCheckSubsequence(String s, String t, int i, int j) {
		if (i >= s.length())
			// if source and target are empty, there is 1 subsequence. else if source is
			// empty and target is not, 0 subsequence
			return j >= t.length() ? 1 : 0;

		// if target is empty, every character source is 1 subsequence.
		if (j >= t.length())
			return 1;
		
		int count;

		if (s.charAt(i) == t.charAt(j)) {
			// if the character in the source is same as target then there are 2
			// possibilities.
			// 1.) the current character is part of subsequence or 2.) Its not, in this case
			// we move on to next character
			count = recursiveSolutionCheckSubsequence(s, t, i + 1, j + 1)
					+ recursiveSolutionCheckSubsequence(s, t, i + 1, j);
		} else {
			count = recursiveSolutionCheckSubsequence(s, t, i + 1, j);
		}

		return count;

	}
}
