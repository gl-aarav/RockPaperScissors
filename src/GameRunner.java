import java.util.Scanner;
public class GameRunner {

	private static String playAgain = "no";

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Game game1 = new Game();
		System.out.println("\t\tWelcome to Rock Paper Scissors!");
		do {
			System.out.print("Enter 'R' for Rock, 'P' for Paper, 'S' for Scissors: ");
			game1.chooseChar();
			String getInput = game1.getInput();
			String input = game1.evaluateInput(getInput);
			game1.print(input);
			System.out.print("\nDo you want to play again: ");

			playAgain = in.nextLine();
			if (playAgain.equalsIgnoreCase("no"))
					System.out.println("Bye!");
			else if (!playAgain.equalsIgnoreCase("no") && !playAgain.equalsIgnoreCase("yes"))
				System.out.println("\nYou did not enter \"yes\" or \"no\". \nBye!");

		}while (playAgain.equalsIgnoreCase("yes"));
	}

}
