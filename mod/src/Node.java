public class Node {
	private String s;
	private int score;
	private Node next;

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

	public String getS() {
		String gs = s;
		return gs;
	}

	public void setS(String sS) {
		String mS = sS;
		s = mS;
	}

	public int getScore() {
		int playerScore = score;
		return playerScore;
	}

	public void setScore(int aScore) {

		int ss = aScore;
		if (ss > 0) {
			score = ss;
		}
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextNode) {
		next = nextNode;
	}
}
