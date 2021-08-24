package com.blz.bridsanctuary;

public abstract class Bird {
	enum Colour {WHITE, BLACKWHITE, YELLOW, GREEN, GRAY, BLACK}
	
	protected String id;
	protected String birdName;
	protected Colour colour;
	protected Boolean isflyable;
	protected Boolean isSwimmable;
	

	public void eat() {
		System.out.println(birdName + " is Eating");
	}

	public void fly() {
		System.out.println(birdName + " is Flying");
	}

	public void swim() {
		System.out.println(birdName + " is Swimming");
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", colour=" + colour + ", isflyable=" + isflyable + ", isSwimmable=" + isSwimmable
				+ ", name=" + birdName + "]";
	}
}

   
