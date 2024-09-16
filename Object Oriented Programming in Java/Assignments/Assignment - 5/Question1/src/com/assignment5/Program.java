package com.assignment5;

class InstanceCounter  {
	
	private static int count;
	
	public InstanceCounter() {
		setCount();
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount() {
		count++;
	}
	
}

public class Program {

	public static void main(String[] args) {
		
		InstanceCounter ic1 = new InstanceCounter();
		InstanceCounter ic2 = new InstanceCounter();
		InstanceCounter ic3 = new InstanceCounter();
		InstanceCounter ic4 = new InstanceCounter();
		
		System.out.println("Number of Instances created: "+InstanceCounter.getCount());

	}

}
