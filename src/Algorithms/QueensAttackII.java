/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 *  
 
 A queen is standing on an n X n chessboard. The chessboard's rows are numbered from 1 to n, going from bottom to top; its columns are numbered 
 from 1 to n, going from left to right. Each square on the board is denoted by a tuple,(r,c), describing the row, r, and column, c, where 
 the square is located.

The queen is standing at position (rq,cq) and, in a single move, she can attack any square in any of the eight directions 
(left, right, up, down, or the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from (4,4):

8  - - - 0 - - - 0
7  0     0     0 -
6  - 0 - 0 - 0 - -
5  - - 0 0 0 - - -
4  0 0 0 X 0 0 0 0
3  - - 0 0 0 - - -
2  - 0 - 0 - 0 - -
1  0 - - 0 - - 0 -
   1 2 3 4 5 6 7 8 
  
There are k obstacles on the chessboard preventing the queen from attacking any square that has an obstacle blocking the the queen's path to it. 
For example, an obstacle at location (3,5) in the diagram above would prevent the queen from attacking cells (3,5), (2,6), and (1,7):

8  - - - 0 - - - 0
7  0     0     0 -
6  - 0 - 0 - 0 - -
5  - - 0 0 0 - - -
4  0 0 0 X 0 0 0 0
3  - - 0 0 1 - - -
2  - 0 - 0 - - - -
1  0 - - 0 - - - -
   1 2 3 4 5 6 7 8 

Given the queen's position and the locations of all the obstacles, find and print the number of squares the queen can attack 
from her position at (rq,cq).

Input Format

The first line contains two space-separated integers describing the respective values of n (the side length of the board) 
and k (the number of obstacles). 
The next line contains two space-separated integers describing the respective values of rq and cq, denoting the position of the queen. 
Each line i of the k subsequent lines contains two space-separated integers describing the respective values 
of ri and ci, denoting the position of obstacle i.

Constraints
0 < n <=10^5
0 <= k <=10^5

A single cell may contain more than one obstacle; however, it is guaranteed that there will never be an obstacle at position (rq,cq) 
where the queen is located.

Subtasks

For 30% of the maximum score:
0 < n <=100
0 <= k <=100

For 55% of the maximum score:
0 < n <=1000
0 <= k <=10^5

Output Format

Print the number of squares that the queen can attack from position (rq,cq).

Sample Input 0
4 0
4 4

Sample Output 0
9

Explanation 0

The queen is standing at position (4,4) on a 4 X 4 chessboard with no obstacles:

4  0 0 0 X 
3  - - 0 0
2  - 0 - 0
1  0 - - 0
   1 2 3 4
   
 We then print the number of squares she can attack from that position, which is 9.


Sample Input 1

5 3
4 3
5 5
4 2
2 3

Sample Output 1

10

Explanation 1

The queen is standing at position (4,3) on a 5 X 5 chessboard with k=3 obstacles:

5  - 0 0 0 1
4  - 1 X 0 0
3  - 0 0 0 -
2  0 - 1 - 0
1  - - - - -
   1 2 3 4 5



We then print the number of squares she can attack from that position, which is 10.


 */

package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QueensAttackII {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int rQueen = in.nextInt();
		int cQueen = in.nextInt();
		
		int[][] chessBoard = new int[n][n];

		
		for (int[] matrix : chessBoard)
			Arrays.fill(matrix, 0);
		
		int queenrow = (n-1)-(rQueen-1);
		int queencolumn = cQueen-1; 		
				
		chessBoard[queenrow][queencolumn] = n;
		
		
		for(int a0 = 0; a0 < k; a0++){
			int rObstacle = in.nextInt();
			int cObstacle = in.nextInt();
			chessBoard[(n-1)-(rObstacle-1)][cObstacle-1] = -1;
	        }
		
		int count=1;
		
		
		int top = matrixtop(chessBoard,queenrow, queencolumn, count);
		int bottom = matrixbottom(chessBoard,queenrow, queencolumn, top, n);
		int left = matrixleft(chessBoard,queenrow, queencolumn, bottom);
		int right = matrixright(chessBoard,queenrow, queencolumn, left, n);
		
		int topleft = matrixtopleft(chessBoard,queenrow, queencolumn, right);
		int bottomright = matrixbottomright(chessBoard,queenrow, queencolumn, topleft, n);
		
		int topright = matrixtopright(chessBoard,queenrow, queencolumn, bottomright, n);
		int bottomleft = matrixbottomleft(chessBoard,queenrow, queencolumn, topright, n);
		
		int finalcount = bottomleft-1;
		
/*		printMatrix(chessBoard);
		System.out.println(top);
		System.out.println(bottom);
		System.out.println(left);
		System.out.println(right);
		System.out.println(topleft);
		System.out.println(bottomright);
		System.out.println(topright);
		System.out.println(bottomleft);
*/		
		System.out.println(finalcount);
		in.close();
	}
	
	public static int matrixbottomleft(int[][]chessBoard,int queenrow, int queencolumn, int count, int n){
		while(queenrow<n-1 && queencolumn>0) {
			if(chessBoard[queenrow+1][queencolumn-1]==-1)
				return count;
			else {
				chessBoard[queenrow+1][queencolumn-1] = count;
				count++;
				queenrow++;
				queencolumn--;
			}
		}
		return count;
	}
	
	public static int matrixtopright(int[][]chessBoard,int queenrow, int queencolumn, int count, int n){
		while(queenrow>0 && queencolumn<n-1) {
			if(chessBoard[queenrow-1][queencolumn+1]==-1)
				return count;
			else {
				chessBoard[queenrow-1][queencolumn+1] = count;
				count++;
				queenrow--;
				queencolumn++;
			}
		}
		return count;
	}
	
	
	public static int matrixbottomright(int[][]chessBoard,int queenrow, int queencolumn, int count, int n){
		while(queenrow<n-1 && queencolumn<n-1) {
			if(chessBoard[queenrow+1][queencolumn+1]==-1)
				return count;
			else {
				chessBoard[queenrow+1][queencolumn+1] = count;
				count++;
				queenrow++;
				queencolumn++;
			}
		}
		return count;
	}
	
	public static int matrixtopleft(int[][]chessBoard,int queenrow, int queencolumn, int count){
		while(queenrow>0 && queencolumn>0) {
			if(chessBoard[queenrow-1][queencolumn-1]==-1)
				return count;
			else {
				chessBoard[queenrow-1][queencolumn-1] = count;
				count++;
				queenrow--;
				queencolumn--;
			}
		}
		return count;
	}
	
	
	public static int matrixright(int[][]chessBoard,int queenrow, int queencolumn, int count, int n){
		while(queencolumn<n-1) {
			if(chessBoard[queenrow][queencolumn+1]==-1)
				return count;
			else {
				chessBoard[queenrow][queencolumn+1] = count;
				count++;
				queencolumn++;
			}
		}
		return count;
	}
	
	
	public static int matrixleft(int[][]chessBoard,int queenrow, int queencolumn, int count){
		while(queencolumn>0) {
			if(chessBoard[queenrow][queencolumn-1]==-1)
				return count;
			else {
				chessBoard[queenrow][queencolumn-1] = count;
				count++;
				queencolumn--;
			}
		}
		return count;
	}
	
	
	public static int matrixtop(int[][] chessBoard,int queenrow, int queencolumn, int count){
		while(queenrow>0) {
			if(chessBoard[queenrow-1][queencolumn]==-1)
				return count;
			else {
				chessBoard[queenrow-1][queencolumn] = count;
				count++;
				queenrow--;
			}
		}
		return count;
	}
	
	public static int matrixbottom(int[][]chessBoard,int queenrow, int queencolumn, int count, int n){
		while(queenrow<n-1) {
			if(chessBoard[queenrow+1][queencolumn]==-1)
				return count;
			else {
				chessBoard[queenrow+1][queencolumn] = count;
				count++;
				queenrow++;
			}
		}
		return count;
	}
	
	
	
	
	public static void printMatrix(int[][] chessBoard) {
		for(int[] matrix : chessBoard) {
			for(int i : matrix)
				System.out.print(i + "\t");
			System.out.println();
		}
	}

}
