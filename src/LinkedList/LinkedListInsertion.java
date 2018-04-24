package LinkedList;

public class LinkedListInsertion {
	Node head;

	
	public void push(int n) {	
		Node new_node = new Node(n);
		new_node.next = head;
		head = new_node;
	}
	
	public void displayLinkedList() {
		while(head!=null) {
			System.out.print(head.data+ " ");
			head = head.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListInsertion l = new LinkedListInsertion();
		
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.push(6);
		
		l.displayLinkedList();
		
		
	
	}

}
