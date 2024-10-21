import java.util.Scanner;
public class Game {

	private int charInput1;
	private char charInput2;
	public void chooseChar() {
		charInput1 = (int)(Math.random()*3+1);
			if (charInput1 == 1)
				 charInput2 = 'R';
			else if (charInput1==2)
				charInput2 = 'P';
			else 
				charInput2 = 'S';
	}

	public String getInput() {
		Scanner in = new Scanner (System.in);
		String userChoice = in.nextLine();
	

		return userChoice;
	}

	public String evaluateInput(String input) {
		if (input.equalsIgnoreCase("R") && charInput2 == 'R')
			return "Tie, you both went rock.";
		else if (input.equalsIgnoreCase("R") && charInput2 =='P')
			return "You lost!";
		else if (input.equalsIgnoreCase("R") && charInput2 =='S')
			return "You won!";

		else if (input.equalsIgnoreCase("P") && charInput2 =='R')
			return "You won!";
		else if (input.equalsIgnoreCase("P") && charInput2 =='P')
			return "Tie, you both went scissors.";
		else if (input.equalsIgnoreCase("P") && charInput2 =='S')
			return "You lost!";

		else if (input.equalsIgnoreCase("S") && charInput2 =='R')
			return "You lost!";
		else if (input.equalsIgnoreCase("S") && charInput2 =='P')
			return "You won!";
		else if (input.equalsIgnoreCase("S") && charInput2 =='S')
			return "Tie, you both went paper.";


		else 
			return "What you entered was not in the form of 'R', 'P', or 'S'.";
	}

	public void print(String input) {
		System.out.println(input);
	}

}
