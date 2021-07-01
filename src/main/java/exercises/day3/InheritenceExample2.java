package exercises.day3;

//question 2

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("I am eating");
	}

	public void bark() {
		System.out.println("I am barking");
	}

}

public class InheritenceExample2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
	}

}
