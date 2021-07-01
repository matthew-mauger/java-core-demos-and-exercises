package demos;

public class HelloWorld {

	String name; // instance variable

	public static void main(String[] args) {

		System.out.println("Hello World!\n");

		boolean result; // local variable - defined in a method
		result = 8 < 11;

		// if statement
		System.out.println("if statement:");

		if (result) {

			System.out.println("result: " + result);

		}

		// switch statement
		System.out.println();
		System.out.println("switch statement:");

		int num = 5;

		switch (num) {

		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("default value");
			break;

		}

		System.out.println("end of switch");

		// loops
		// while loop
		System.out.println();
		System.out.println("while loop:");

		int count = 0;

		while (count < 10) {

			System.out.println("count: " + count);
			count++;
		}

		// do-while loop
		System.out.println();
		System.out.println("do-while loop:");

		int count2 = 0;

		do {

			System.out.println("count2: " + count2);
			count2++;

		} while (count2 < 5);

		// for-each loop
		System.out.println();
		System.out.println("for-each loop:");

		int[] intArray = new int[10];
		intArray[0] = 7;
		intArray[7] = 3;

		int[] secondIntArray = { 1, 2, 3, 4, 5 };

		for (int number : secondIntArray) {

			System.out.println("number:" + number);

		}

	}

}