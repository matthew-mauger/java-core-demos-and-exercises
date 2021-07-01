package exercises.day4;

// question 5

public class Calculator {

	public static int add(int num1, int num2) {
		return Math.addExact(num1, num2);
	}

	public static int subtract(int num1, int num2) {
		return Math.subtractExact(num1, num2);
	}

	public static int multiply(int num1, int num2) {
		return Math.multiplyExact(num1, num2);
	}

	public static int divide(int num1, int num2) {
		return Math.floorDiv(num1, num2);
	}

	public static void main(String[] args) {

		System.out.println("5 + 5: " + add(5, 5));
		System.out.println("5 - 5: " + subtract(5, 5));
		System.out.println("5 * 5: " + multiply(5, 5));
		System.out.println("5 / 5: " + divide(5, 5));

	}

}
