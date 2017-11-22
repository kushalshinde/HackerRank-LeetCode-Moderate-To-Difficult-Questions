/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 * 
Given input file with the following set of Strings
	
Download input file: https://www.google.com/basepages/producttype/taxonomy.en-US.txt

Example: -
	Electronics
	Electronics > Arcade Equipment
	Electronics > Arcade Equipment > Basketball Arcade Games
	Electronics > Arcade Equipment > Pinball Machine Accessories
	Electronics > Arcade Equipment > Pinball Machines
	Electronics > Arcade Equipment > Skee-Ball Machines
	Electronics > Arcade Equipment > Video Game Arcade Cabinet Accessories
	Electronics > Arcade Equipment > Video Game Arcade Cabinets
	Electronics > Audio
	Electronics > Audio > Audio Accessories
	Electronics > Audio > Audio Accessories > Audio & Video Receiver Accessories
	Electronics > Audio > Audio Accessories > Headphone & Headset Accessories
	Electronics > Audio > Audio Accessories > Headphone & Headset Accessories > Headphone Cushions & Tips
	Electronics > Audio > Audio Accessories > Karaoke System Accessories

Write a function that stores this information.
Your data structure should be able to provide information as

	Electronics = 14
	Electronics > Arcade Equipment = 7
	Electronics > Arcade Equipment > Video Game Arcade Cabinets = 1
	Electronics > Arcade Equipment > Skee-Ball Machines = 1

*/

package CompanyInterviews;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SetOfStrings {

	public static void main(String[] args) throws Exception{
    	HashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
    	
    	File file = new File("C:\\Users\\kusha\\Desktop\\SetOfStrings_InputFile.txt");

    	Scanner sc = new Scanner(new FileInputStream(file));
    	
    	while(sc.hasNextLine()){
    		String[] array = sc.nextLine().split("\\>");
    		int j=0;
    		String first = null;
    		StringBuilder sb = new StringBuilder();
    		for(int i=0; i<array.length; i++){
    			while(j<=i){
    				if(j==0){
    					first = array[j].trim();
    				}else{
    					first =">"+array[j].trim();
    				}
    				j++;
    			}
    			sb.append(first);
    			first=null;
    			String output = sb.toString();
    	
    			if(map.containsKey(output))
    				map.put(output, map.get(output)+1);
    			else
    				map.put(output, 1);
    			j=0;                    //resetting j to zero index
    		}
    		
    //		System.out.println(Arrays.toString(array));
    		Arrays.fill(array, null);
    	}
    	
    	PrintWriter out = null;
    	try {
    	    	out = new PrintWriter(new FileWriter("C:\\Users\\kusha\\Desktop\\output.txt"));
    	    } catch (IOException e) {
    	            e.printStackTrace();
    	    }
    	
    	for(Map.Entry<String, Integer> m : map.entrySet()){
			String key = m.getKey();
			Integer val = m.getValue();
			out.println(key + " = "+ val);
			
//			System.out.println(key + " = "+ val);
		}
    	out.close();
    	sc.close();
    }

}
