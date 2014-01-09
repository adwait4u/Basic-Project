/***************************************************
 * This program is a linked list program
 * It created one list with A, B and C as data
 * It adds D to the second position of the list
 * It adds E to the last position (after C)
 * It removes the last element E from the list 
 * 
 * Author - Adwait Paranjpe July 10, 2013
****************************************************/

package linkedListPkg;
public class Node {
	// Variables
		public String data;
		public Node next;
	// Constructor	
		public Node(String data, Node next){
			this.data = data;
			this.next = next;
			}
		
		public String toString(){
			return data;
			// for int data return data+"";
			}
	
		
//==========================Getter and Setters for Data and Next ==================================
		
		@SuppressWarnings("unused")
		private String getData() {
			return data;
		}

		@SuppressWarnings("unused")
		private void setData(String data) {
			this.data = data;
		}

		private Node getNext() {
			return next;
		}
		
		private void setNext(Node next) {
			this.next = next;
		}

//=================================================================================================		

		//Creating a list
		public static Node createList(){
			Node list = new Node("A", new Node("B", new Node("C", null)));
			return list;
		}
		
		//add a node at second position
		public static Node addSecond(Node list, String s){
			if(list!=null){
			/***************************
			 *  This is method 1********
			 *  ************************
				Node dNode = new Node(s, null);
				dNode.setNext(list.getNext());
				list.setNext(dNode);
			**********************************/	
				 list.setNext(new Node(s, list.getNext()));
			}
			return list;
		}
		
		//Add a node to the end
		public static Node addLast(Node list, String s){
			if (list == null){
				return new Node(s, null);
			}else{
				Node temp = list;
				while(temp.getNext() != null)
				{
					temp = temp.getNext();
				}
					temp.setNext(new Node(s, null));
				return list;
				}
		}
		
		//Remove the last node
		public static Node removeLast(Node list){
			if(list == null){
				System.out.println("List is empty");
			}else{
				
				Node prev = null;
				Node curr = list;
				
				while(curr.getNext() != null){
					prev = curr;
					curr = curr.getNext();
				}
				
				prev.setNext(null);
			}
			return list;
			
		}

		//printing the list
		public static void printList(Node list){
			while(list != null)
			  {
				System.out.print(list+" ");
				list = list.getNext();
			  }
		}

		
	public static void main(String[] args){
		Node list = addSecond(createList(), "D");
		printList(list);
		list = addLast(list,"E");
		System.out.println("\n\nAfter adding 'E' to the end\n");
		printList(list);
		list = removeLast(list);
		System.out.println("\n\nAfter removing 'E' from the end\n");
		printList(list);
	}

}
