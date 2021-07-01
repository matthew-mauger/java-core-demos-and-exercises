package exercises.day4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		String input;
		int vowelCount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the string: ");
		input = sc.nextLine();

		for (int i = 0; i < vowels.length; i++) { // iterate through vowel array

			for (int j = 0; j < input.length(); j++) { // iterate through input string

				if (vowels[i] == input.charAt(j)) {
					vowelCount++;
				}
			}
		}

		System.out.println("Number of vowels in the string: " + vowelCount);

	}

}
