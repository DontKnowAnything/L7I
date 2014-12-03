import java.awt.*;
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
	/*private JTextField nameField;
	private JTextField scoreField;
	private JButton add;
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JTextArea area;
	private Container pane;
	*//**
	 * 
	 *//*
	public Client() {
		//try{
		nameField = new JTextField();
		scoreField = new JTextField();
		area= new JTextArea();
		frame = new JFrame();
		panel1 = new JPanel();
		panel2 = new JPanel();
		add = new JButton();
		pane = new Container();
		ButtonListener b1=new ButtonListener();
		frame.setContentPane( pane );
		panel2.add( area );
		panel1.add( nameField );
		panel1.add( scoreField );
		panel1.add( add );
		pane.add( panel2 );
		pane.add(panel1);
		//panel2.setLayout(new GridLayout(0,3));
		panel1.setLayout(new GridLayout(3,0));
		pane.setLayout( new GridLayout(0,2) );
		frame.setSize(100, 100);
		pane.setSize( 100, 100 );
		//scoreField.setSize(70,30);
		scoreField.setText( "score" );
		add.setText( "Add" );
		frame.setVisible( true );
		frame.setLayout( new FlowLayout() );
		area.setColumns( 11 );
		area.setRows( 11 );
		scoreField.setColumns( 10 );
		nameField.setColumns( 10 );
		add.addActionListener( b1 );
		nameField.addActionListener( b1 );
		frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE );
		frame.pack();
	
		}catch(LinkedListException li){
			li=new LinkedListException();
		}
	}
	private void build() {
		try {
			panel2.add( area );
			panel1.add( nameField );
			panel1.add( scoreField );
			panel1.add( add );
			pane.add( panel2 );
			pane.add(panel1);
		}
		catch ( LinkedListException e ) {
			e.getMessage();
		}
	}
	private class ButtonListener implements ActionListener {
		
		GameLinkedList ll=new GameLinkedList();
		public void actionPerformed( ActionEvent e ) {
			//while(true){
			String nameInput = nameField.getText();
			int scoreInput=Integer.parseInt( scoreField.getText() );
			if ( e.getSource() == add ){
				ll.add( nameInput, scoreInput );
				area.setText( ll.toString() );
				}
			else
				area.setText( "Sample" );
			}
			//toggle = !toggle;
		}*/
	
	//}

	/**
	 * @param args the
	 */
	public static void main(String[] args) {
		try{
		Client c = new Client();
		}catch(LinkedListException lle){
			lle=new LinkedListException();
		}
		String start = "";
		String scan = "";
		int points = 0;
		//Node node = new Node();
		GameLinkedList LinkedListOL;
//		//node.setScore(-1);
//		//node.setScore(-2);
//		//node.setScore(3);
//
//		//LinkedListOL.add("",4);
//		//LinkedListOL.add("inv",-1);
//
////      LinkedListOL.add("z",9);
////      LinkedListOL.add("w",3);
////      LinkedListOL.add("tom",22);
////      LinkedListOL.add("a",10);
////      LinkedListOL.add("Code",30);
////      LinkedListOL.add("dr",30);
////      LinkedListOL.add("ab",5);
////      LinkedListOL.add("ty",8);
////      LinkedListOL.add("elev",14);
////      LinkedListOL.add("twive",13);
////      LinkedListOL.add("opii",12);
////      //LinkedListOL.removeLowest();
////      System.out.println(LinkedListOL.toString());
		LinkedListOL=new GameLinkedList( scan, points );
		try {
			Scanner scanner = new Scanner( System.in );

			String s = "";
			String quit = "";
			do {
				//
				System.out.println( "Player name" );
				scan = scanner.nextLine();//Replace
				System.out.println( "Score" );
				points = scanner.nextInt();
				scanner.nextLine();
				LinkedListOL.add( scan, points );
				System.out.println( LinkedListOL.toString() );
				System.out.println( "Press Y to enter in another player" );

				quit = scanner.nextLine();
			}while ( quit.equalsIgnoreCase( "Y" ) );


		}
		catch ( LinkedListException e ) {
			e.getMessage();

		}
	}
}
