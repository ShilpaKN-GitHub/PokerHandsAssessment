import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PokerHands {

	public static void main(String[] args) throws IOException {
		int player1_WinCount = 0, player2_WinCount = 0;

		java.net.URL path = PokerHands.class.getResource("poker-hands.txt");
		File f = new File(path.getFile());

		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String twoHands;

			while ((twoHands = br.readLine()) != null) {
				String player1_HandData = twoHands.substring(0, twoHands.length() / 2);
				String player2_HandData = twoHands.substring(twoHands.length() / 2 + 1, twoHands.length());

				Hand player1_Hand = new Hand(player1_HandData, "Player1");
				Hand player2_Hand = new Hand(player2_HandData, "Player2");

				String result = new Hand().getWinner(player1_Hand, player2_Hand);
				if (result.equals("Player1")) {
					player1_WinCount++;
				} else if (result.equals("Player2")) {
					player2_WinCount++;
				} else {
					System.out.println(result);
				}
			}

			System.out.println("Player 1: " + player1_WinCount);
			System.out.println("Player 2: " + player2_WinCount);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getLocalizedMessage());
		}
	}
}
