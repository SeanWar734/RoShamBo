package com.main.roshambo;

public class RockyBalboa extends Player {
	
	private String name;

	public RockyBalboa(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
