package com.main.roshambo;

public enum Roshambo {
	
	ROCK {
		public String toString() {
			return "Rock";
		}
	}
	, PAPER {
		public String toString() {
			return "Paper";
		}
	}
	, SCISSORS{
		public String toString() {
			return "Scissors";
		}
	};
	
	private Roshambo(){
	}
}
