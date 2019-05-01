package com.oop;

abstract class Human {
	abstract void talk();
}

public class Man extends Human {
	void talk() {
		System.out.println("talk....ing");
	}

	public static void main(String args[]) {
		Human obj = new Man();
		obj.talk();
	}
}