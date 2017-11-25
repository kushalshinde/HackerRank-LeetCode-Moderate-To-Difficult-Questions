/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 */

package CrackingTheCodingInterview;
import java.util.Scanner;
import java.util.Stack;

class MyQueue<T>{
	
	Stack<T> stack1 = new Stack<T>();
	Stack<T> stack2 = new Stack<T>();	
	
	public T peek() {
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}
	
	public void dequeue(){		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		stack2.pop();
    }
	
	public void enqueue(T t) {
		stack1.push(t);
	}
}

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) {                 // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) {          // dequeue
				queue.dequeue();
			} else if (operation == 3) {          // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}



/*
Sample Input
10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2



Sample Output
14
14

*/

