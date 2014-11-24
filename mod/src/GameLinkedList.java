/**
 * Maintains ordered linked list of Nodes
 *
 * @author Patrick McKnew
 */
public class GameLinkedList implements GameLinkedListInterface {
	private String name;
	private int nodeScore;
	private Node head;//first
	private Node tail;//last

	public GameLinkedList() {
		name = "";
		nodeScore = 0;
		head = null;
	}

	public GameLinkedList(String n, int nodeS) {
		name = n;
		nodeScore = nodeS;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean empty;
		if (head == null) {
			empty = true;
		} else {
			empty = false;
		}
		return empty;
	}

	@Override
	public void removeLowest() {//Beginning VS End : Depends on ascending or descending?
		// TODO Auto-generated method stub
		Node lowestScore = new Node();

		//Remove from end
		Node previousNode = null;
		Node currentNode = head;
		String err = "";

		if (currentNode == null) {
			err += "t";
		} else {
			if (previousNode == null) {
				head = currentNode.getNext();
				currentNode = null;
			} else {
				err += "wrong";
			}


		}
	}

	//public void add( String newName, int newScore ) {
	//Node newNode = new Node( newName, newScore );
	//Node newNode= new Node();
	//if ( isEmpty() ) {//List may be empty
	//newNode.setNext( head );
	//	head = newNode;
	//} else {
	//	if (head.getScore() > newNode.getScore()) {//Node belongs at beginning
				/*Node current = head;
				//newNode.setNext( head );
				head = newNode;*/
	//} else {
	//		Node current = head;//Node belongs at end
	//current.setS( newName );
	//		while ( current.getNext() != null && current.getNext().getScore() < newNode.getScore() ) {
	//			current = current.getNext();
	//		}
	//	}
	//}
	//}
	public String toString() {
		Node b = head;
		String s = "";
		while (b != null) {
			s += b.getS() + " " + b.getScore() + "\n";
			b = b.getNext();
		}
		return s;
	}
}
