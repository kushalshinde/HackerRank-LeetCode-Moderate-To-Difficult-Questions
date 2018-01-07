/*
 * Name: - Kushal Sunil Shinde
 * Email: - kshinde1@binghamton.edu
 * Date: - 7 January 2018
 * 
 * Given a matrix of ‘O’ and ‘X’, replace ‘O’ with ‘X’ if surrounded by ‘X’
 * 
 * Given a matrix where every element is either ‘O’ or ‘X’, replace ‘O’ with ‘X’ if surrounded 
 * by ‘X’. A ‘O’ (or a set of ‘O’) is considered to be by surrounded by ‘X’ if there are ‘X’ at 
 * locations just below, just above, just left and just right of it.
 * 
 * Examples:

   Input: mat[M][N] =  {{'X', 'O', 'X', 'X', 'X', 'X'},
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'O', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'},
                       };
   Output: mat[M][N] =  {{'X', 'O', 'X', 'X', 'X', 'X'},
                         {'X', 'O', 'X', 'X', 'X', 'X'},
                         {'X', 'X', 'X', 'X', 'X', 'X'},
                         {'O', 'X', 'X', 'X', 'X', 'X'},
                         {'X', 'X', 'X', 'O', 'X', 'O'},
                         {'O', 'O', 'X', 'O', 'O', 'O'},
                        };

   Input: mat[M][N] =  {{'X', 'X', 'X', 'X'}
                        {'X', 'O', 'X', 'X'}
                        {'X', 'O', 'O', 'X'}
                        {'X', 'O', 'X', 'X'}
                        {'X', 'X', 'O', 'O'}
                       };
   Output: mat[M][N] =  {{'X', 'X', 'X', 'X'}
                         {'X', 'X', 'X', 'X'}
                         {'X', 'X', 'X', 'X'}
                         {'X', 'X', 'X', 'X'}
                         {'X', 'X', 'O', 'O'}
                        };
 * 
 * 
 */

package Matrix;

public class ReplaceOwithXifSurroundedByX {

	public static void main(String[] args) {
		char[][] mat =  {{'X', 'X', 'X', 'X'},
				 		 {'X', 'O', 'X', 'X'},
				 		 {'X', 'O', 'O', 'X'},
				 		 {'X', 'O', 'X', 'X'},
				 		 {'X', 'X', 'O', 'O'}
						};
		
		int row = mat.length;
		int column = mat[0].length;
		
		replaceSurrounded(mat, row, column);
	}
	
	public static void replaceSurrounded(char[][] mat, int M, int N){
	    // Step 1: Replace all 'O'  with '-'
		for (int i=1; i<M-1; i++)
			for (int j=1; j<N-1; j++)
				if (mat[i][j] == 'O')
					mat[i][j] = '-';

		
		for (int i=1; i<M-1; i++) 
			for (int j=1; j<N-1; j++) 
				if(mat[i][j] == '-')
					if(mat[i-1][j] == 'O' || mat[i][j+1] == 'O' || mat[i+1][j] == 'O' || mat[i][j-1] == 'O')
						mat[i][j] = 'O';
					else
						mat[i][j] = 'X';
				
			
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) { 
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
