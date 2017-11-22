 /*
 
Following are common definition of Binomial Coefficients.
1) A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.

2) A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from 
among n objects; more formally, the number of k-element subsets (or k-combinations) of an n-element set.

The Problem
Write a function that takes two parameters n and k and returns the value of Binomial Coefficient C(n, k). 
For example, your function should return 6 for n = 4 and k = 2, and it should return 10 for n = 5 and k = 2.

Optimal Substructure
The value of C(n, k) can be recursively calculated using following standard formula for Binomial Coefficients.

   C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1

 
 */

package DynamicProgramming;

public class BinomialCoefficient {

	public static int binomialCoeff(int n, int k) {
		int[][] matrix = new int[n+1][k+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<= min(i,k); j++) {
				if(i==j || j==0)
					matrix[i][j] = 1;
				else
					matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
			}
		}
		return matrix[n][k];
	}
	
	public static int min(int a, int b) {
		return (a>b) ? b : a;
	}
	
	public static void main(String[] args) {

		int n = 5;
		int k = 2;
		
		System.out.println(binomialCoeff(n, k));
			

	}

}
