package exercises.day4;

// question 1

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String input = sc.nextLine();

		int comparisonResult = UserMainCode.checkCharacters(input);

		if (comparisonResult == 1) {
			System.out.println("Valid - first and last character are the same.");
		} else {
			System.out.println("Invalid - first and last character are NOT the same.");
		}

	}

}
