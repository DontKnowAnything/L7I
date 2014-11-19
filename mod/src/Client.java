import java.util.Scanner;

/**
 * Retrieves a name and score from user, sends it to Linked List, and displays
 * content from Link List
 * 
 * @author Patrick McKnew
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GameLinkedList LinkedList=new GameLinkedList();
		String scan = "";
		int points = 0;
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Player name");
			scan = scanner.nextLine();
			if (scan.isEmpty()) {
				System.out.print("Entered in blank");
			} else {
				System.out.println("Score");
				points = scanner.nextInt();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
