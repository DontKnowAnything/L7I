/**
 * Defines a single name, score, and the next Node object in the Linked List.
 * Nodes must contain a non-blank name and score greater then 0;
 * 
 * @author Patrick McKnew
 *
 */
public class Node {
	private String s;
	private int score;
	private Node next;

	/**
	 * 
	 */
	public Node() {
		s = "";
		score = 0;
		next = null;
	}

	/**
	 * The overloaded constructor
	 *
	 * @param sconstructor String for name
	 * @param gameScore    The score
	 */
	public Node(String sconstructor, int gameScore) {
		s = sconstructor;
		score = gameScore;
		next = null;

	}

	/**
	 * @return Name of Player
	 */
	public String getS() {
		String gs = s;
		return gs;
	}

	/**
	 * @param sS
	 */
	public void setS(String sS) {
		String mS = sS;
		if(!mS.isEmpty()){
		s = mS;
		}
		else
		{
			
		}
	}

	/**
	 * @return Score for player
	 */
	public int getScore() {
		int playerScore = score;
		return playerScore;
	}

	/**
	 * @param aScore
	 */
	public void setScore(int aScore) {

		int ss = aScore;
		if (ss > 0) {
			score = ss;
		}
	}

	/**
	 * @return The Node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param nextNode
	 */
	public void setNext(Node nextNode) {
		next = nextNode;
	}
}
