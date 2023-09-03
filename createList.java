public class createList{
	public static void main(String args[]){
		
		node a = new node();
		node b = new node();
		node c = new node();
		node d = new node();
		node e = new node();
		node f = new node();
		node g = new node();
		node h = new node();
		listOperation LL = new listOperation();
		
		//Operation set 01 - Testing the push operation
		LL.push(3,a);
		LL.push(5,b);
		LL.push(2,c);
		System.out.println();
		System.out.println("Linked list before appending:");
		LL.printList();
		
		//Operation set 02 - Testing the append operation
		LL.append(5,d);
		LL.append(9,e);
		LL.append(10,f);
		System.out.println();
		System.out.println("Linked list after appending:");
		LL.printList();
		
		//Operation set 03 - Testing the insert operation
		LL.insert(d,11,h);
		LL.insert(b,33,g);
		System.out.println();
		System.out.println("Linked list after inserting:");
		LL.printList();
	}
}