import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Node node,node2;
		String scan="";
		int points=0;
		try {
			node = new Node();
			node2 = new Node(scan,points);
			System.out.println("Player name");

			Scanner scanner = new Scanner(System.in);
			scan = scanner.nextLine();
			node2.setS(scan);
			String s = node2.getS();
			System.out.println("Score");
			points = scanner.nextInt();
			node2.setScore(points);
			int il = node2.getScore();
			System.out.print(s + il);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}