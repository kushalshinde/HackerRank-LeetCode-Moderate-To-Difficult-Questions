/*
 Find maximum integer in an Array which is monotonically ascending and descending at some point.
 
 I used Binary search to search the max element in an array. Time complexity is Log(n).
 
 */


package Easyutilities;

public class FindMaxInAnArray {

	public static void main (String[] args) {

		int[] array = new int[]{1,2,3,4,5,6,7,6,3,2,1};   // Sorted Arrays is monotonically increasing and then decreasing

		int low = 0;		
	    int high = array.length-1;
	    
	    findmax(array, low, high);
	    
	}
		
	public static void findmax(int[] array, int low, int high ) {
		
		int mid = low + (high-low)/2;
		
		if(low<high) {
			if(array[mid] < array[mid+1] ) {
				if((high-low)!=1)
					findmax(array, mid, high);
				else
					System.out.println(mid>high ? array[mid] : array[high]);									
			}else if(array[mid] > array[mid+1]){
				if((high-low)!=1)
					findmax(array, low, mid);
				else
					System.out.println(low>mid ? array[low] : array[mid]);
			}
		}		
	}
}
