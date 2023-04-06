package funProgrammes;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int computersChoice = random.nextInt(3) + 1;

		String computerChoiceString;

		switch (computersChoice) {
		case 1:
			computerChoiceString = "rock";
			break;
		case 2:
			computerChoiceString = "paper";
			break;
		case 3:
			computerChoiceString = "scissors";
			break;
		default:
			computerChoiceString = "Invalide Choice";
			break;
		}
		System.out.println("Which one do you want rock paper or scissor pleas write it: ");
		String usersChoice = input.nextLine();

		if (usersChoice.equals("rock") && computerChoiceString.equals("scissors")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You win");
		} else if (usersChoice.equals("paper") && computerChoiceString.equals("rock")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You win");
		} else if (usersChoice.equals("scissors") && computerChoiceString.equals("paper")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You win");
		} else if (usersChoice.equals("rock") && computerChoiceString.equals("paper")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You lose");
		} else if (usersChoice.equals("paper") && computerChoiceString.equals("scissors")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You lose");
		} else if (usersChoice.equals("scissors") && computerChoiceString.equals("rock")) {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("You lose");
		} else {
			System.out.println("Your choice " + usersChoice + " vs coputers choice " + computerChoiceString);
			System.out.print("Its a draw");
		}
	}

}
