/**
 * Maintains ordered linked list of Nodes and throws error message for invalid Node
 *
 * @author Patrick McKnew
 */
public class GameLinkedList implements GameLinkedListInterface {
	private String name;
	private int newScore;
	private int count;
	private int nodeScore;
	private Node head;//first

	/**
	 * 
	 */
	public GameLinkedList() {
		name = "";
		count = 0;
		nodeScore = 0;
		head = null;
	}

	/**
	 * @param n     The name
	 * @param nodeS The score
	 */
	public GameLinkedList(String n, int nodeS) {
		try{
		name = n;
		nodeScore = nodeS;
		}
		catch(IllegalDataFieldException dfe){
			dfe.getMessage();
		}

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

		//Remove from end
		Node previousNode = null;
		Node currentNode = head;
		String err = "";

		if (currentNode == null) {
			err += "t";
		}
		head = ((currentNode != null) ? currentNode.getNext() : null);
		currentNode = null;
		count--;
	}

	/**
	 * @param newName  The players name
	 * @param newScore Score for player
	 * @throws LinkedListException If
	 */
	public void add(String newName, int newScore) throws LinkedListException {
		name = newName;
		nodeScore = newScore;

		Node newNode = new Node(newName, newScore, head);

		
			if (newScore >= 0 && (!(newName.equals("")))) {
				try {
					if (isEmpty()) {//List may be empty
						newNode.setNext(head);
						head = newNode;
						count++;
					} else {
						if (head.getScore() > newNode.getScore()) {//Node belongs at beginning, change to < and
							Node current = head;
							newNode.setNext(current);
							head = newNode;
							count++;
							if (count > 5) {
								removeLowest();
							}
						} else {
							Node current = head;//Node belongs at end
							while (current.getNext() != null && current.getNext().getScore() < newNode.getScore()) {//to > for highest to lowest
								current = current.getNext();
							}
							count++;

							newNode.setNext(current.getNext());
							current.setNext(newNode);
							//if( count > 4 ){
							if (count > 5) {
								removeLowest();
							}
						}
					}
				} catch (IllegalDataFieldException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
			} else {
				throw new LinkedListException("Node not entered");
			}
		} 
	

	public String toString() {
		Node b = head;
		String s = "";
		while (b != null) {
			s += " Player "+b.getS() + " Score " + b.getScore() + "\n";
			b = b.getNext();
		}
		return s;
	}
}
