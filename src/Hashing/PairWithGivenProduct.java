/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * Date: - 21 Nov 2017
 * 
 * Given an array of distinct elements and a number x, find if there is a pair with product equal to x.

   Examples :

   Input  : arr[] = {10, 20, 9, 40};
            int x = 400;
   Output : Yes

   Input  : arr[] = {10, 20, 9, 40};
            int x = 190;
   Output : No

   Input  : arr[] = {-10, 20, 9, -40};
            int x = 400;
   Output : Yes

   Input  : arr[] = {-10, 20, 9, 40};
            int x = -400;
   Output : Yes

   Input  : arr[] = {0, 20, 9, 40};
            int x = 0;
   Output : Yes
  
 * 
 */


package Hashing;

import java.util.HashSet;

public class PairWithGivenProduct {

	public static void main(String[] args) {
		
		int[] array = new int[]{10, 20, 9, 40};
        int x = 190;
        
        System.out.println(isPairofProductIsPresent(array, x) ? "YES" : "NO");
	}
	
	public static boolean isPairofProductIsPresent(int[] array, int x){
       
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(array.length<2)
			return false;
		
		
		for(int i : array) {
			if(i==0) {
				if(x==0)
					return true;
				else
					continue;
			}
			
			if(x % i == 0) {
				int div = x/i;
				if(set.contains(div))
					return true;	
				set.add(i);	
			}
		}
		
		return false;
	}

}
