import java.util.Scanner;
public class Game {

	private int charInput;

	public void chooseChar() {
		charInput = (int)(Math.random()*3+1);
	}

	public String getInput() {
		Scanner in = new Scanner (System.in);
		String userChoice = in.nextLine();
	

		return userChoice;
	}

	public String evaluateInput(String input) {
		if (input.equalsIgnoreCase("R") && charInput == 1)
			return "Tie, you both went rock.";
		else if (input.equalsIgnoreCase("R") && charInput ==2)
			return "You lost!";
		else if (input.equalsIgnoreCase("R") && charInput ==3)
			return "You won!";

		else if (input.equalsIgnoreCase("P") && charInput ==1)
			return "You won!";
		else if (input.equalsIgnoreCase("P") && charInput ==2)
			return "Tie, you both went scissors.";
		else if (input.equalsIgnoreCase("P") && charInput ==3)
			return "You won!";

		else if (input.equalsIgnoreCase("S") && charInput ==1)
			return "You lost!";
		else if (input.equalsIgnoreCase("S") && charInput ==2)
			return "You won!";
		else if (input.equalsIgnoreCase("S") && charInput ==3)
			return "Tie, you both went paper.";


		else 
			return "What you entered was not in the form of 'R', 'P', or 'S'.";
	}

	public void print(String input) {
		System.out.println(input);
	}

}
