package Arrays;
/*
 *  Question: -  Arrays: Left Rotation
 *  A left rotation operation on an array of size  shifts each of the array's elements  unit to the left.
 *  For example, if left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
 */

public class ArrayLeftRotation {

	public static void main(String[] args) {
		
		int[] array = new int[]{1,2,3,4,5,6};
        int k = 3;                            //by how many number of rotation
        int n = array.length;
       
        int[] output = new int[n];
        
        output = arrayLeftRotation(array, n, k);
        
        for(int i = 0; i < n; i++)
        	System.out.print(output[i] + " ");
      
        System.out.println();
	}

	public static int[] arrayLeftRotation(int[] array, int n, int k) {
		for(int i=0; i<k; i++){
			arrayrotate(array,n);
		}
		return array;
	}
	
	public static void arrayrotate(int[] array, int n){
		int i=0,temp=0;
		temp = array[0];
		for(i=0; i<n-1; i++){
			array[i] = array[i+1];
		}
		array[i] = temp;
	}
}

/*
 * Output: - 4 5 1 2 3
 */