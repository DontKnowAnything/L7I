/**
 * Defines a single name, score, and the next Node object in the Linked List.
 * Nodes must contain a non-blank name and score greater then 0;
 *
 * @author Patrick McKnew
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
   public Node(String sconstructor, int gameScore, Node n) {
   	//sconstructor=getS();
      setS(sconstructor);
      setScore(gameScore);
      setNext(n);
   }

	/**
	 * @return Name of Player
	 */
   public String getS() {
      String gs = s;
   
      return gs;
   
   
   }

	/**
	 * @param sS Player name
	 */
   public void setS(String sS) {
   
      String mS = sS;
      if (!(mS.equals(""))) {
         s = mS;
      } 
      else {
         System.err.println("Player name is empty");
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
	 * @param aScore Score for player
	 */
   public void setScore(int aScore) {
      int ss = aScore;
      if(ss>0){
         score = ss;
      }
      else{
         System.err.println("Score less then 0");
      }
   }
	/**
	 * @return The Node
	 */
   public Node getNext() {
      return next;
   }

	/**
	 * @param nextNode The next node is GameLinkedList
	 */
   public void setNext(Node nextNode) {
      next = nextNode;
   }
}
