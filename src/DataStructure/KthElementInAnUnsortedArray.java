/*
 * Name:- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 * 
 * Find K-th largest element in an array.
 * 
 * In array [9,3,2,4,8], the 3rd largest element is 4.
 * In array [1,2,3,4,5], the 1st largest element is 5, 2nd largest element is 4, 3rd largest element is 3 and etc.

 * Challenge
 * O(n) time, O(1) extra memory.
 * 
 * 
 * Using Max Heap
 * 
 */


package DataStructure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElementInAnUnsortedArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {15,35,82,18,9,10,23,43,54};
		int k=3;
		
		System.out.println(kthLargestElement(array, k));

	}

	public static int kthLargestElement(int[] array, int k) {
		if(array.length==0 || k==0 || array==null)
			return -1;
		
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		
		for(int i=0; i<array.length; i++) {
			heap.offer(array[i]);
		}
			
		for(int j=0; j<k-1; j++) {
			heap.poll();
		}
		
		return heap.peek();
		
		
	}
}
