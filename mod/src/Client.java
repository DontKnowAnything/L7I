import java.util.*;
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
      GameLinkedList LinkedList;
      LinkedList = new GameLinkedList();
      String start="";
      String scan = "";
      int points = 0;
      //Node node = new Node();
      GameLinkedList LinkedListOL;
      //node.setScore(-1);
      //node.setScore(-2);
      //node.setScore(3);
   
      // LinkedListOL.add("",4);
      // LinkedListOL.add("inv",-1);
   //    
      // LinkedListOL.add("z",9);
      // LinkedListOL.add("w",3);
      // LinkedListOL.add("tom",22);
      // LinkedListOL.add("a",10);
      // LinkedListOL.add("Code",30);
      // LinkedListOL.add("dr",30);
      // LinkedListOL.add("ab",5);
      // LinkedListOL.add("ty",8);
      // LinkedListOL.add("elev",14);
      // LinkedListOL.add("twive",13);
      // LinkedListOL.add("opii",12);
      // LinkedListOL.removeLowest();
      //System.out.println(LinkedListOL.toString());
      LinkedListOL=new GameLinkedList( scan, points );
   	//try {
      Scanner scanner = new Scanner( System.in );
      
      String s = "";
      System.out.print( "Begin?" );
      s = scanner.nextLine();
      String quit = "";
      do {
         System.out.println( "Player name" );
         scan = scanner.nextLine();//Replace
         scanner.nextLine();
         System.out.println( "Score" );
         points = scanner.nextInt();
         
         LinkedListOL.add( scan, points );
         System.out.println( LinkedListOL.toString() );
         System.out.println( "Press Y to enter in another player" );
         quit = scanner.next();
         
      }while ( LinkedListOL != null && quit.equalsIgnoreCase( "Y" ) );
      
      
      //} catch ( Exception e ) {
      	//e.printStackTrace();
      //}
   }

}
