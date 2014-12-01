import java.util.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Retrieves a name and score from user, sends it to Linked List, and displays
 * content from Link List
 *
 * @author Patrick McKnew
 */
public class Client {
   private JTextField field;
	/**
	 * @param args
	 */
   public static void main(String[] args) {
      String start="";
      String scan = "";
      int points = 0;
      //Node node = new Node();
      GameLinkedList LinkedListOL;
      //node.setScore(-1);
      //node.setScore(-2);
      //node.setScore(3);
      LinkedListOL=new GameLinkedList();
   
      //LinkedListOL.add("",4);
      //LinkedListOL.add("inv",-1);
      
      LinkedListOL.add("z",9);
      LinkedListOL.add("w",3);
      LinkedListOL.add("tom",22);
      LinkedListOL.add("a",10);
      LinkedListOL.add("Code",30);
      LinkedListOL.add("dr",30);
      LinkedListOL.add("ab",5);
      LinkedListOL.add("ty",8);
      LinkedListOL.add("elev",14);
      LinkedListOL.add("twive",13);
      LinkedListOL.add("opii",12);
      //LinkedListOL.removeLowest();
      System.out.println(LinkedListOL.toString());
      // LinkedListOL=new GameLinkedList( scan, points );
      // try {
         // Scanner scanner = new Scanner( System.in );
      // 
         // String s = "";
         // String quit = "";
         // do {
         // //
            // System.out.println( "Player name" );
            // scan = scanner.nextLine();//Replace
            // System.out.println( "Score" );
            // points = scanner.nextInt();
            // scanner.nextLine();
            // LinkedListOL.add( scan, points );
            // System.out.println( LinkedListOL.toString() );
            // System.out.println( "Press Y to enter in another player" );
         // 
            // quit = scanner.nextLine();
         // }while ( LinkedListOL != null && quit.equalsIgnoreCase( "Y" ) );
      // 
      // } 
      // catch ( LinkedListException e ) {
         // e.printStackTrace();
      // }
   // }
//       
   // private class ButtonListener implements ActionListener {
      // boolean toggle = true;
   // 
      // public void actionPerformed(ActionEvent e) {
         // if (toggle)
            // field.setText("Simple");
         // else
            // field.setText("Sample");
         // toggle = !toggle;
      // }
    }
 }
