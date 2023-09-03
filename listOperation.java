public class listOperation{
	private node head = null;
	private node prev;
	
	void push(int value, node Node){
		Node.value = value;
		Node.next = head;
		head = Node;
	}
	
	void append(int value, node Node){
		Node.value = value;
		while(head == null){
			head = Node;
			prev = Node;
			prev.next = null;break;
		}
		prev = head;//This line doesn't matter in the next appending to a un empty list because it is always used to traverse the list
		while(prev.next != null){
			prev = prev.next;
		}
		prev.next = Node;
		Node.next = null;
	}
	
	void insert(node prev, int value, node Node){
		Node.value = value;
		Node.next = prev.next;
		prev.next = Node;
	}
	
	void printList(){
		node pointer = head;
		if(head == null)
			System.out.println("This list has nothing to display!");
		for(; pointer != null;){
			System.out.print(pointer.value+", ");
			pointer = pointer.next;
		}
	}
}