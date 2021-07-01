package exercises.day4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		String input = sc.nextLine();
		char middleChar;

		if (input.length() < 1) { // determine if there's any input

			System.out.println("There is no middle character, empty input");

		} else {

			if (input.length() % 2 == 0) { // determine if length if even

				middleChar = input.charAt((input.length() / 2) - 1);
				char charAfterMiddleChar = input.charAt(input.length() / 2);

				System.out.println("The middle characters in the string: " + middleChar + charAfterMiddleChar);

			} else { // go here if length is odd

				middleChar = input.charAt((input.length() / 2));

				System.out.println("The middle character in the string: " + middleChar);

			}

		}

	}

}
