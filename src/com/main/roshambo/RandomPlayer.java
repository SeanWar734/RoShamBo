package com.main.roshambo;

public class RandomPlayer extends Player{
	
	private String name;

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		double x = Math.random() * 3;
		
		if (x < 1) {
			return Roshambo.PAPER;
		} else if (x >= 1 && x < 2) {
			return Roshambo.ROCK;
		} else {
			return Roshambo.SCISSORS;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
