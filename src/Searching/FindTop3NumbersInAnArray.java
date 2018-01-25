/*
 * Name: - Kushal S Shinde
 * Date: - 20 January 2018
 * Email: - kshinde1@binghamton.edu
 * 
 * Find the largest three elements in an array
 * 
 * Input:   arr[] = {10, 4, 3, 50, 23, 90}
 * Output:  90, 50, 23
 * 
 * 
 * 
 */

package Searching;

import java.util.PriorityQueue;

public class FindTop3NumbersInAnArray {

	public static void main(String[] args) {
		int[] array = {10, 4, 3, 50, 23, 90};
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(3);
		
		for(int i : array) {
			pq.add(i);
			if(pq.size()>3)
				pq.poll();
		}
		
		System.out.println(pq);

	}

}
