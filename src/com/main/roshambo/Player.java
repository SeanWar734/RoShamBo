package com.main.roshambo;

public abstract class Player {
	
	protected String name;
	
	public abstract Roshambo generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public Player() {
		super();
	}
	
	
}
