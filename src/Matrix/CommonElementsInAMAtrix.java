/* 
 * Name:- Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * Date:- 7 January 2018
 * 
 * Common elements in all rows of a given matrix
 * Given an m x n matrix, find all common elements present in all rows in O(mn) time and one traversal of matrix.
 * Example:
 * Input:
 * mat[4][5] = {{1, 2, 1, 4, 8},
                {3, 7, 8, 5, 1},
                {8, 7, 7, 3, 1},
                {8, 1, 2, 7, 9},
               };

 * Output: 
 * 1 8 or 8 1
 * 8 and 1 are present in all rows.
 * 
 * 
 */

package Matrix;

import java.util.HashMap;


public class CommonElementsInAMAtrix {

	public static void main(String[] args) {
		int[][] mat = {{1, 2, 1, 4, 8},
	                   {3, 7, 8, 5, 1},
	                   {8, 7, 7, 3, 1},
	                   {8, 1, 2, 7, 9},
	                  };
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<mat[0].length; i++)
			if(!map.containsKey(mat[0][i]))
				map.put(mat[0][i], 1);
		
		for(int i=1; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if (map.containsKey(mat[i][j]) && map.get(mat[i][j]) == i) {
					map.put(mat[i][j], i + 1);
					if (i == mat.length - 1) {
						System.out.println(mat[i][j]);
					}
				}
			}
		}
		
		
		
	}

}
