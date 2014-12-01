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
   public Node(String sconstructor, int gameScore, Node n) /*throws IllegalDataFieldException*/ {
      //if(!(sconstructor.isEmpty())){
      setS(sconstructor);
      //}
      //else{
         //throw new IllegalDataFieldException("Name is empty");
      //}
      //if(gameScore>=0){
      setScore(gameScore);//Use ifs?
      /*}
      else{
         throw new IllegalDataFieldException("Score less then 0");
      }*/
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
   public void setS(String sS) throws IllegalDataFieldException{
   
      String mS = sS;
      try{
         if (!(mS.equals(""))) {
            s = mS;
         } 
         else {
            throw new IllegalDataFieldException("Name is empty");
         }
      }
      catch(IllegalDataFieldException d){throw new IllegalDataFieldException("Name is empty");}
   
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
      if(ss>=0){
         score = ss;
      }
      else{
         throw new IllegalDataFieldException("Score less then 0");
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
