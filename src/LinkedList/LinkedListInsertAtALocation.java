package LinkedList;

public class LinkedListInsertAtALocation extends LinkedListInsertion{

	public void insertAfter(Node head, int n, int data) {
		Node prev = found(head, n);
		
		if(prev != null) {
			Node new_node = new Node(data);
			new_node.next = prev.next;
			prev.next = new_node;
		}
			
		else {
			System.out.println("The previous node is not found");
			return;
		}
				
		
	}
	
	public Node found(Node head, int n) {
		
		if (head == null)
            return null;
		
			if(head.data==n) {
				return head;
			}
			
		return found(head.next, n);
	}
	

	public static void main(String[] args) {
		LinkedListInsertAtALocation ll = new LinkedListInsertAtALocation();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		
		ll.displayLinkedList();
		
		
	}

}
