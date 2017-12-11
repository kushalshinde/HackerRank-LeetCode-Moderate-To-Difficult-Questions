/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * Date: - 11 December 2017
 * 
 * Search a Word in a 2D Grid of characters
 * 
 * Given a 2D grid of characters and a word, find all occurrences of given word in grid. 
 * A word can be matched in all 8 directions at any point. Word is said be found in a direction 
 * if all characters match in this direction (not in zig-zag form).

 * The 8 directions are, Horizontally Left, Horizontally Right, Vertically Up and 4 Diagonal directions.
 * 
 * Input:  grid[][] = {"GEEKSFORGEEKS",
                       "GEEKSQUIZGEEK",
                       "IDEQAPRACTICE"};
        
           word = "GEEKS"

   Output: 
           pattern found at 0, 0
           pattern found at 0, 8
           pattern found at 1, 0

   Input:  grid[][] = {"GEEKSFORGEEKS",
                       "GEEKSQUIZGEEK",
                       "IDEQAPRACTICE"};
        
           word = "EEE"

   Output: pattern found at 0, 2
           pattern found at 0, 10
           pattern found at 2, 2
           pattern found at 2, 12
 * 
 * 
 * 
 */

package Arrays;

public class SearchAWordInA2DGrid {

	public static void main(String[] args) {
		char[][] matrix = new char[][] {{'G','E','E','K','S','F','O','R','G','E','E','K','S'},
                                        {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
                                        {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}};

        String word = "EEE";

        int rowLength = matrix[0].length;  //13
        int columnLength = matrix.length;  //3
            
        patternSearch(matrix, word, rowLength, columnLength);
	}

	public static void patternSearch(char[][] matrix, String word, int rowLength, int columnLength) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				checkalldirections(matrix,i,j, word.toCharArray(), rowLength, columnLength);
			}
		}
	}

	public static void checkalldirections(char[][] grid, int i, int j, char[] word, int rowLength, int columnLength) {
		int lengthOfWord = word.length;

		if(grid[i][j]==word[0]) {
			
			if((j+lengthOfWord)<=rowLength)
				rightFromthatPoint(grid, i, j, word);
			
			if(((j+1)-lengthOfWord)>=0)
				leftFromthatPoint(grid, i, j, word);
			
			if(((i+1)-lengthOfWord)>=0)
				topFromthatPoint(grid, i, j, word);	
			
			if((i+lengthOfWord)<=columnLength)
				bottomFromthatPoint(grid, i, j, word);
			
			if((i+1-lengthOfWord)>=0 &&(j+1-lengthOfWord)>=0)
				topLeftFromthatPoint(grid, i, j, word);
			
			if((i+lengthOfWord)<=columnLength &&(j+lengthOfWord)<=rowLength)
				bottomRightFromthatPoint(grid, i, j, word);
			
			if((i+1-lengthOfWord)>=0 &&(j+lengthOfWord)<=rowLength)
				topRightFromthatPoint(grid, i, j, word);
			
			if((i+lengthOfWord)<=columnLength &&(j+1-lengthOfWord)>=0)
				bottomLeftFromthatPoint(grid, i, j, word);
		}

	}
	
	public static void rightFromthatPoint(char[][] grid, int i, int j, char[] word) {

		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				j++;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag ==true)
			System.out.println("Found Pattern at: "+i+","+(j-word.length)+" Ending at: "+i+ ","+(j-1));
	}

	public static void leftFromthatPoint(char[][] grid, int i, int j, char[] word) {

		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				j--;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag ==true)
			System.out.println("Found Pattern at: "+i+","+(j+word.length)+" Ending at: "+i+ ","+(j+1));
	}

	public static void topFromthatPoint(char[][] grid, int i, int j, char[] word) {

		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i--;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag ==true)
			System.out.println("Found Pattern at: "+(i+word.length)+","+j+" Ending at: "+(i+1)+ ","+j);
	}
	
	public static void bottomFromthatPoint(char[][] grid, int i, int j, char[] word) {

		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i++;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag ==true)
			System.out.println("Found Pattern at: "+(i-word.length)+","+j+" Ending at: "+(i-1)+ ","+j);
	}

	public static void topLeftFromthatPoint(char[][] grid, int i, int j, char[] word) {
		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i--;
				j--;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag ==true)
			System.out.println("Found Pattern at: "+(i+word.length)+","+(j+word.length)+" Ending at: "+(i+1)+ ","+(j+1));
		
	}

	public static void bottomRightFromthatPoint(char[][] grid, int i, int j, char[] word) {
		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i++;
				j++;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag ==true)
			System.out.println("Found Pattern at: "+(i-word.length)+","+(j-word.length)+" Ending at: "+(i-1)+ ","+(j-1));

	}

	public static void topRightFromthatPoint(char[][] grid, int i, int j, char[] word) {
		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i--;
				j++;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag ==true)
			System.out.println("Found Pattern at: "+(i+word.length)+","+(j-word.length)+" Ending at: "+(i+1)+ ","+(j-1));
	}

	public static void bottomLeftFromthatPoint(char[][] grid, int i, int j, char[] word) {
		boolean flag = false;
		for(int k=0;k<word.length; k++) {
			if(grid[i][j]==word[k]) {
				i++;
				j--;
				flag = true;
			}
			else {
				flag=false;
				break;
			}
		}

		if(flag ==true)
			System.out.println("Found Pattern at: "+(i-word.length)+","+(j+word.length)+" Ending at: "+(i-1)+ ","+(j+1));
	}

	

}
