package com.oop;

class Animal {
	void show() {
		System.out.println("animal");
	}
}

class Dog extends Animal {
	void show() {
		System.out.println("dog");
	}
}

public class Casting {
	public static void main(String[] args) {

		Animal dog = new Animal();
		dog.show();

		Dog dog1 = new Dog();
		dog1.show();

		Animal dog2 = new Dog();
		dog2.show();

		// downcasting
		Animal animal = new Dog();
		Dog dog3 = (Dog) animal;
		dog3.show();

		// Guaranteed to succeed, barring classloader
		if (animal instanceof Dog) {
			Dog castedDog = (Dog) animal;
			castedDog.show();
		}
	}
}
