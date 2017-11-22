package Easyutilities;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInReverseOrder {

	public static void main(String[] args) {

		 Integer[] array = {5, 2, 6, 4, 1, 9, 13, 11, 7};
		 
		 Arrays.sort(array, (o1,o2) -> Integer.compare(o2,o1));
		 
		 Arrays.sort(array, Collections.reverseOrder());
		 
		 for(Integer i : array) {
			 System.out.println(i);
		 }
		 

	}

}
