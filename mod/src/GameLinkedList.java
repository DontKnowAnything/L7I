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

   public GameLinkedList( String n, int nodeS ) {
      name = n;
      nodeScore = nodeS;
   
   }

   @Override
   public boolean isEmpty() {
   	// TODO Auto-generated method stub
      boolean empty;
      if (head == null) {
         empty = true;
      } 
      else {
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
      } 
      else {
         if (previousNode == null) {
            head = currentNode.getNext();
            currentNode = null;
         } 
         else {
            err += "wrong";
         }
      
      
      }
   }

   public void add( String newName, int newScore ) {
      Node newNode = new Node( newName, newScore, head );
      
      if(newScore>=0&&(!(newName.equals("")))){
         if ( isEmpty() ) {//List may be empty
         //newNode.setScore(newScore);
         //Node newNode= new Node();
         
            newNode.setNext( head );
            head = newNode;
         }
         else{
            //newNode.setScore(newScore);
         //System.err.print("Error");
         
         
         //} else {
            if ( head.getScore() > newNode.getScore() ) {//Node belongs at beginning, change to > and
               Node current = head;
               newNode.setNext( current );
               head = newNode;//Works
            } 
            else {
               Node current = head;//Node belongs at end
               
               while ( current.getNext() != null && current.getNext().getScore() < newNode.getScore() ) {//to < for lowest to highest
                  current = current.getNext();
               }
               newNode.setNext( current.getNext() );
               current.setNext( newNode );
            }
         }
      }
   }
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
