/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * 
 * Question: - You are given an integer N, print N+1 lines in a following manner.
 * 
 * case 1: - N=3 then pattern would be: 
 * 333 
 * 313 
 * 323 
 * 333 

 * case 2: N=4 then the pattern would be 
 * 44444 
 * 44144 
 * 44244 
 * 44344 
 * 44444
 * 
 * 
 */

package CareerCup;

import java.util.Scanner;

public class PrintMatrixPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = sc.nextInt();
		
		int row = 0;
		int column = 0;
		
		if(n%2 == 0) {
			row = n+1;
			column = n+1;
		}
		else {
			row = n+1;
			column = n;
		}
		
		int[][] matrix = new int[row][column];
		
		int count=1;
		int half = n/2;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if((i > 0 && i<row) && j == half) {
					matrix[i][j] = count;
					count++;
				}
				else {
					matrix[i][j] = n;
				}
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
