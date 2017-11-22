/*

The Fibonacci numbers are the numbers in the following integer sequence.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation

    Fn = Fn-1 + Fn-2

with seed values
   F0 = 0 and F1 = 1.
 
 
 */

package DynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 9;
		
		System.out.println(FibUsingDP(num));
	}
	
	public static int FibUsingDP(int num) {
		
		int[] array = new int[num+1];
		
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i<=num; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		return array[num];
	}

}
