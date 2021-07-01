package exercises.day4;

// question 1

public class UserMainCode {

	public static int checkCharacters(String input) {

		// return -1 if input isn't long enough, need at least 2 characters
		if (input.length() < 2) {
			return -1;
		}

		char firstChar = input.charAt(0);
		char lastChar = input.charAt(input.length() - 1);

		if (firstChar == lastChar) {
			return 1;
		} else {
			return -1;
		}

	}

}
