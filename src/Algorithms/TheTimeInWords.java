/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 *  The Time in Words 

Given the time in numerals we may convert it into words, as shown below:

5:00 -> five o' clock
5:01 -> one minute past five
5:10 -> ten minutes past five
5:15 -> quarter past five
5:30 -> half past five
5:40 -> twenty minutes to six
5:45 -> quarter to six
5:47 -> thirteen minutes to six
5:28 -> twenty eight minutes past five

Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1 <= H < 12
0 <= M < 60

Output Format

Display the time in words.

Sample Input

5  
47  

Sample Output

thirteen minutes to six
 */


package Algorithms;

import java.util.*;

public class TheTimeInWords {
	static HashMap<Integer, String> map = new HashMap<>();

	public static void main(String[] args) {
		hashmapcreated();	
		
		 Scanner sc = new Scanner(System.in);
		 int hh = sc.nextInt();
		 int mm = sc.nextInt();
		 
		 String hour = (mm>30) ? hourcalculate(hh+1) : hourcalculate(hh);

		 String minutes = minutecalculate(mm);
		 
		 System.out.println(mm==0 ? hour + " "+minutes : minutes+" "+hour);	 
		 
		 sc.close();
	}

	public static String hourcalculate(int hh) {
		 if(hh>12)
			 throw new IllegalArgumentException("Invalid hour");

		 return map.get(hh);
	 }
	 
	 public static String minutecalculate(int mm) {	 
		 int rem = 0;
		 String result = "";
		 switch(mm) {
		 case 0:
			 result += map.get(mm);
			 break;
		 case 1:
			 result += map.get(mm)+" minute past";
			 break;
		 case 2:
		 case 3:
		 case 4:
		 case 5:
		 case 6:
		 case 7:
		 case 8:
		 case 9:
		 case 10:
		 case 11:
		 case 12:
		 case 13:
		 case 14:
			 result += map.get(mm)+" minutes past";
			 break;
		 case 15:
			 result += map.get(mm)+" past";
			 break;
		 case 16:
		 case 17:
		 case 18:
		 case 19:
		 case 20:
			 result += map.get(mm)+" minutes past";
			 break;
		 case 21:
		 case 22:
		 case 23:
		 case 24:
		 case 25:
		 case 26:
		 case 27:
		 case 28:
		 case 29:{
			 rem = mm%10;
			 mm = mm -rem;
			 result+= map.get(mm)+" "+map.get(rem)+" minutes past";
			 break;
		 }
			 
		 case 30:
			 result += map.get(mm)+" past";
			 break;
		 case 31:
		 case 32:
		 case 33:
		 case 34:
		 case 35:
		 case 36:
		 case 37:
		 case 38:
		 case 39:{
				 mm = 60-mm;
				 rem = mm%10;
				 mm = mm - rem;
				 result += map.get(mm)+" "+map.get(rem)+" minutes to";
				 break;
		 }
		 case 40:
			 result += map.get(60-mm)+ " minutes to";
			 break;
		 case 41:
		 case 42:
		 case 43:
		 case 44:{
			 mm = 60-mm;
			 result += map.get(mm)+" minutes to";
			 break;
		 }
		 case 45:
			 result += map.get(60-mm)+ " to";
			 break;
		 case 46:
		 case 47:
		 case 48:
		 case 49:
		 case 50:
		 case 51:
		 case 52:
		 case 53:
		 case 54:
		 case 55:
		 case 56:
		 case 57:
		 case 58:
		 case 59:{
			 mm = 60-mm;
			 result += map.get(mm)+" minutes to";
			 break;
		 	}
		 }
		 return result;
	 }
	 
	 
	 public static void hashmapcreated() {
			
			map.put(0, "o' clock");
			map.put(1, "one");
			map.put(2, "two");
			map.put(3, "three");
			map.put(4, "four");
			map.put(5, "five");
			map.put(6, "six");
			map.put(7, "seven");
			map.put(8, "eight");
			map.put(9, "nine");
			map.put(10, "ten");
			map.put(11, "eleven");
			map.put(12, "twelve");
			map.put(13, "thirteen");
			map.put(14, "fourteen");
			map.put(15, "quarter");
			map.put(16, "sixteen");
			map.put(17, "seventeen");
			map.put(18, "eighteen");
			map.put(19, "nineteen");
			map.put(20, "twenty");
			map.put(30, "half");
			map.put(45, "quarter");
			
		 
	 }


}
