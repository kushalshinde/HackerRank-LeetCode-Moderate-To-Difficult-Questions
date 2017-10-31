/*
We're going to make our own Contacts application! The application must perform two types of operations:

1. add name, where "name" is a string denoting a contact name. This must store  as a new contact in the application.
2. find partial, where "partial" is a string denoting a partial name to search the application for. It must count the number of contacts 
   starting with "partial" and print the count on a new line.
   
   Given n sequential add and find operations, perform each operation in order. 
   
Sample Input: -
4
add hack
add hackerrank
find hac
find hak


Sample Output:-
2
0

Explanation:-

We perform the following sequence of operations:
1. Add a contact named hack.
2. Add a contact named hackerrank.
3. Find and print the number of contact names beginning with hac. There are currently two contact names in the application and 
   both of them start with hac, so we print 2 on a new line.
4. Find and print the number of contact names beginning with hak. There are currently two contact names in the application but 
   neither of them start with hak, so we print 0 on a new line.
 
 */

package Algorithms;

import java.util.*;


class TrieNode {
	private static int ALPHABET_SIZE = 26;
	TrieNode[] children = new TrieNode[ALPHABET_SIZE];
	int size = 0;
	
	private static int getCharIndex(char c) {
		return c-'a';
	}
	
	private TrieNode getNode(char c) {
		return children[getCharIndex(c)];
	}
	
	private void setNode(char c, TrieNode node) {
		children[getCharIndex(c)] = node;
	}
	
	public void add(String s) {
		add(s, 0);
	}
	
	public void add(String s, int index) {
		size++;
		if(index == s.length())
			return;
		
		char current = s.charAt(index);
		TrieNode child = getNode(current);
		
		if(child==null) {
			child = new TrieNode();
			setNode(current, child);
		}
		child.add(s, index+1);
			
	}
	
	public int findCount(String s, int index) {
		if(index==s.length())
			return size;
		
		TrieNode child = getNode(s.charAt(index));
		if(child==null)
			return 0;
		return child.findCount(s, index+1);
				
	}
	
}


public class Tries_Contacts {
	
	static TrieNode root;
	
	public static void main(String[] args) {
		root = new TrieNode();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();
			
			if(op.contains("add"))
				root.add(contact);
			
			if(op.contains("find"))
				System.out.println(root.findCount(contact, 0));
		}
		in.close();
	}

}
