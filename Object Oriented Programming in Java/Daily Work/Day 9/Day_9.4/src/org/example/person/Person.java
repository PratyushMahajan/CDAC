package org.example.person;

public class Person {
	private String name;
	private int age;
	
	public Person( ) {
		this.name = "";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printRecord( ) {
		System.out.println("Name	:	"+this.name);
		System.out.println("Age	:	"+this.age);
	}
	
}
