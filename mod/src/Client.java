/**
 * Retrieves a name and score from user, sends it to Linked List, and displays
 * content from Link List
 *
 * @author Patrick McKnew
 */
public class Client {
	/**
	 * @param args
	 */
   public static void main(String[] args) {
   	//GameLinkedList LinkedList;
   	//LinkedList = new GameLinkedList();
      String scan = "";
      int points = 0;
      Node node = new Node();
      GameLinkedList LinkedListOL=new GameLinkedList(scan,points);
      //node.setScore(-1);
      //node.setScore(-2);
      //node.setScore(3);
   
   
      LinkedListOL.add("a",-1);
   	
      LinkedListOL.add("yu",9);
      LinkedListOL.add("w",3);
      LinkedListOL.add("",4);
      System.out.println("adding 9,");
      LinkedListOL.add("a",10);
      LinkedListOL.add("ab",5);
   	//LinkedListOL.removeLowest();
   	System.out.println(LinkedListOL.toString());
   
   	/*try {
   		Scanner scanner = new Scanner( System.in );
   
   			try {
   				while ( LinkedList != null ) {
   					System.out.println("Player name");
   					scan = scanner.next();
   					System.out.println( "Score" );
   					points = scanner.nextInt();
   
   					LinkedList = new GameLinkedList( scan, points );
   					//LinkedList.add( scan, points );
   					System.out.println("Player: " + scan + " Score: " + points);
   
   				}
   
   
   			}catch (Exception e){
   
   			}
   			finally {
   
   				scanner.close();
   			}System.out.println( LinkedList.toString() );
   
   
   	} catch ( Exception e ) {
   		e.printStackTrace();
   	}*/
   }

}
