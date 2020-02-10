package com.main.roshambo;

import java.util.Scanner;

public class RockPaperScissorsApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String name = Validator.getString(scnr, "What is your name?");
		
		Player player1 = new RockyBalboa("Rocky");
		Player player2 = new RandomPlayer("Rando");
		Player player3 = new HumanPlayer(name);

		boolean cont = true;
		while (cont) {

			String whichPlayer = Validator.getString(scnr, "Would you like to play against Bot1 or Bot2 (hint: Bot1 is easier)").toLowerCase();

			switch (whichPlayer) {
			case ("bot1"):
				playAgainstBot1(player3, player1);
				cont = false;
				break;
			case ("bot2"):
				playAgainstBot2(player3, player2);
				cont = false;
				break;
			default:
				System.out.println("That wasnt a choice of either Bot1, or Bot2");
				break;
			}
		}
		System.out.println("Total wins: " + won);
		System.out.println("Total ties: " + ties);
		System.out.println("Total losses: " + loss);
		System.out.println("Hope you enjoyed, cya " + player3.name + ".");
		scnr.close();
	}

	public static int won = 0;
	public static int loss = 0;
	public static int ties = 0;

	public static void playAgainstBot1(Player player1, Player player2) {
		Scanner scnr = new Scanner(System.in);
		boolean continue1 = true;
		while (continue1) {
			Roshambo a = player1.generateRoshambo();
			Roshambo b = player2.generateRoshambo();
			whoWon(a, b);
			String newChoice = Validator.getString(scnr, "Do you wanna play again? (y/n)").toLowerCase();
			if (newChoice.equals("n")) {
				continue1 = false;
			}
		}
		scnr.close();
	}

	public static void playAgainstBot2(Player player1, Player player2) {
		Scanner scnr = new Scanner(System.in);
		boolean continue1 = true;
		while (continue1) {
			Roshambo a = player1.generateRoshambo();
			Roshambo b = player2.generateRoshambo();
			whoWon(a, b);
			String newChoice1 = Validator.getString(scnr, "Do you wanna play again? (y/n)").toLowerCase();
			if (newChoice1.equals("n")) {
				continue1 = false;
			}
		}
		scnr.close();
	}

	public static void whoWon(Roshambo a, Roshambo b) {
		if (a.equals(Roshambo.ROCK)) {
			if (b.equals(Roshambo.PAPER)) {
				System.out.println("You lost by using Rock against Paper!");
				loss += 1;

			} else if (b.equals(Roshambo.SCISSORS)) {
				System.out.println("You won by using Rock against Scissors!");
				won += 1;

			} else {
				System.out.println("It was a tie, you both chose Rock. boring.");
				ties += 1;
			}

		} else if (a.equals(Roshambo.PAPER)) {
			if (b.equals(Roshambo.ROCK)) {
				System.out.println("You won by using Paper against Rock!");
				won += 1;

			} else if (b.equals(Roshambo.SCISSORS)) {
				System.out.println("You lost by using Paper against Scissors!");
				loss += 1;

			} else {
				System.out.println("It was a tie, you both chose Paper. boring.");
				ties += 1;
			}

		} else if (a.equals(Roshambo.SCISSORS)) {
			if (b.equals(Roshambo.PAPER)) {
				System.out.println("You won by using Scissors against Paper!");
				won += 1;

			} else if (b.equals(Roshambo.ROCK)) {
				System.out.println("You lost by using Scissors against Rock!");
				loss += 1;

			} else {
				System.out.println("It was a tie, you both chose Paper. boring.");
				ties += 1;
			}
		}
	}

}
