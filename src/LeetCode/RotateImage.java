/*

You are given an n x n 2D matrix representing an image.  Rotate the image by 90 degrees (clockwise).

Note:
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.


Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [3,6,9],
  [2,5,8],
  [1,4,7]
]
Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [11,10, 7,16],
  [ 9, 8, 6,12],
  [ 1, 4, 3,14],
  [ 5, 2,13,15]
]
 */

package LeetCode;

import java.util.Scanner;

public class RotateImage {

	 public static void rotate(int[][] matrix) {
		 
		 int N = matrix.length;
		 
		 for (int x = 0; x < N / 2; x++) {
			 for (int y = x; y < N-x-1; y++) {
				 
				 int temp = matrix[x][y];
				 
				 matrix[x][y] = matrix[y][N-1-x];
				 
				 matrix[y][N-1-x] = matrix[N-1-x][N-1-y];
				 
				 matrix[N-1-x][N-1-y] = matrix[N-1-y][x];
				 
				 matrix[N-1-y][x] = temp;
			 }
		 }
	 }
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		displaymatrix(matrix);
		System.out.println();
		
		rotate(matrix);
		System.out.println();
		
		displaymatrix(matrix);

		sc.close();
	}
	
	public static void displaymatrix(int[][] matrix) {
		for(int[] m : matrix) {
			for(int b : m) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
	}

}
