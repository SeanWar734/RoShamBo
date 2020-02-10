package com.main.roshambo;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private String name;

	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter Rock, Paper, or Scissors: ");
		String choice = scnr.nextLine().toLowerCase();
		Roshambo choice2 = null;
		//scnr.close();
		
		switch(choice){
		case("rock"):
			choice2 = Roshambo.ROCK;
			break;
		case("paper"):
			choice2 = Roshambo.PAPER;
			break;
		case("scissors"):
			choice2 = Roshambo.SCISSORS;
			break;
		default:
			choice2 = Roshambo.PAPER;
			break;
		}
		return choice2;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
