package ru.obolensk.afff.wagner.jwac.il;

public abstract class Element {

	private final String name;
	
	public Element(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
