package jeuChifoumi;

import java.util.Random;
import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		winner();

	}
	// user choice.

	public static int userChoice() {
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();

		switch (userChoice) {
		case 1:
			System.out.println("VOUS avez choisi PIERRE.");
			break;
		case 2:
			System.out.println("VOUS avez choisi FEUILLE.");
			break;
		case 3:
			System.out.println("VOUS avez choisi CISEAUX.");
			break;
		}
		return userChoice;

	}
	// choice computer.

	public static int choiceComputer() {
		Random random = new Random();
		int choiceComputer = 0;
		choiceComputer = random.nextInt(3) + 1;
		System.out.println(choiceComputer);

		switch (choiceComputer) {
		case 1:
			System.out.println("L'ORDINATEUR a choisi PIERRE.");
			break;
		case 2:
			System.out.println("L'ORDINATEUR a choisi FEUILLE.");
			break;
		case 3:
			System.out.println("L'ORDINATEUR a choisi CISEAUX.");
			break;
		}
		return choiceComputer;

	}
	// presentation of the game, comparisons of choices and results.

	public static void winner() {
		String winner;
		int userChoice = 0;
		int choiceComputer = 0;
		boolean again = true;
		int userScore = 0;
		int computerScore = 0;

		do {

			System.out.println("/// JEU DU CHIFOUMI ///, GOOD LUCK!!!");
			System.out.println("Saisie du choix : \n  (1) PIERRE, \n  (2) FEUILLE, \n  (3) CISEAUX,");

			userChoice = userChoice();
			choiceComputer = choiceComputer();
			System.out.println(
					"CHOIX DE L'UTILISATEUR : " + userChoice + " // CHOIX DE L'ORDINATEUR : " + choiceComputer);

			if (userChoice == 2 && choiceComputer == 1 || userChoice == 3 && choiceComputer == 2
					|| userChoice == 1 && choiceComputer == 3) {
				winner = "UTILISATEUR";
				System.out.println("le gagnant est " + winner);
				userScore++;
			}

			else if (userChoice == choiceComputer) {
				winner = "EGALITE";
				System.out.println("Il y a " + winner);
			}

			else {
				winner = "ORDINATEUR";
				System.out.println("le gagnant est " + winner);
				computerScore++;
			}
			// ask if he or she wants to replay and display the final results.

			System.out.println("Encore une partie ? (oui ou non),");
			String text1 = Clavier.lireString();

			if (text1.equals("non")) {
				System.out.println("Merci d'avoir jouer !!!");
				again = false;

				System.out.println();
			}

		} while (again);

		System.out.println("Le score de l'UTILISATEUR est :" + userScore);
		System.out.println("Le score de l'ORDINATEUR est :" + computerScore);

		if (userScore > computerScore) {
			System.out.println("L'UTILISATEUR EST LE VAINQUEUR, BIEN JOUE !");
		}

		if (userScore < computerScore) {
			System.out.println("L'ORDINATEUR EST LE VAINQUEUR, BIEN JOUE ! ");
		}

		else {
			System.out.println("IL Y A EGALITE ;)");
		}
	}
}