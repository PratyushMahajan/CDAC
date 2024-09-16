package com.assignment3;

import java.util.Scanner;

class Parent {
	
	private int salary;
	private int id;
	
	
	public void acceptRecord(int a, int b) {
		this.salary = a;
		this.id = b;
	}
	
	public void printRecord() {
		System.out.println("Salary of Employee "+this.id+" is: "+this.salary);
	}
	
	
	
}
class Child extends Parent {
	private String name;
	
	public void acceptRecord(String s) {
		this.name = s;
	}
	
	public void printRecord() {
		System.out.println("Name of Employee: "+this.name);
	}
}

public class Program {
    public static void main(String[] args) {
        
    }
}
