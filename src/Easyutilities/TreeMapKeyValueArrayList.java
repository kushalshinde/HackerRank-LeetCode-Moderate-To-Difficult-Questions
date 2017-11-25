/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 
 This procedure is to store an ArrayList of integers as a value in a HashMap  
 */


package Easyutilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapKeyValueArrayList {

	public static void main(String[] args) {
		
		Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		 
		for(int i=2; i<67; i=i+5) {
			List<Integer> list= new ArrayList<Integer>();

			if(i==2) {
				for(int j=1; j<=5; j=j+2) {
	//				System.out.println(i + " "+j);
					list.add(j);
					if(j==5) {
						map.put(i, new ArrayList<Integer>(list));
					}
				}
			}else {
				for(int k=1; k<=4; k+=k) {
		//			System.out.println(i + " "+k);
					list.add(k);
					if(k==4) {
						map.put(i, new ArrayList<Integer>(list));
					}
				}
			}
		}
		// System.out.println(map);
		 
		
		for(Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
			Integer key = e.getKey();
			System.out.print(key + " ");
			
			for(Integer s : e.getValue()) {
				System.out.print(s+ " ");
			}
			System.out.println();
		}
	}
}
