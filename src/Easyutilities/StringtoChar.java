/*
Convert String input to char array  
 
 
Input: - 
========================
5
ebacd
fghij
olmkn
trpqs
xywuv

Output: -
========================
e b a c d 
f g h i j 
o l m k n 
t r p q s 
x y w u v 

  
  
 */

package Easyutilities;

import java.util.Scanner;

public class StringtoChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] matrix = new char[n][n];
		
		int m=0;
		for(int i=0; i<n; i++) {
			String input = sc.next();
			while(m!=n) {
				matrix[i][m] = input.toCharArray()[m];
				m++;
			}
			m=0;
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
