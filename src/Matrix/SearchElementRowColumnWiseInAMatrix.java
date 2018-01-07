/* 
 * Name:- Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * Date:- 7 January 2018
 * 
 * Search in a row wise and column wise sorted matrix
 * 
 * Given an n x n matrix and a number x, find position of x in the matrix if it is present in it. 
 * Else print “Not Found”. In the given matrix, every row and column is sorted in increasing order. 
 * The designed algorithm should have linear time complexity.

	Example :

	Input : mat[4][4] = { {10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
              x = 29
    Output : Found at (2, 1)

    Input : mat[4][4] = { {10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
              x = 100
    Output : Element not found
 * 
 */

package Matrix;

public class SearchElementRowColumnWiseInAMatrix {

	public static void main(String args[]) { 
		 int[][] mat = {{10, 20, 30, 40},
                	    {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
        int x = 29;
        
        findelement(mat,3,x);
	}
	
	public static void findelement(int[][] mat,int m, int x) {
		int i = 0;
		int j = m-1;
		
		while(i<m && j>=0) {
			if(mat[i][j] == x) {
				System.out.println("Found at: Matrix["+i+"]["+j+"]");
				break;
			}else if(mat[i][j] > x)
				j--;
			else
				i++;
		}
	}

}
