package exercises.day5;

public class Question1 {

	public final int ASCII_SIZE = 256;

	public void maxCharacter(String aString) {

		// create array with size for all ascii characters
		int[] count = new int[ASCII_SIZE];

		// iterate through string input and assign to count array based on ascii
		// character
		// along with counting number of duplicates
		for (int i = 0; i < aString.length(); i++) {
			count[aString.charAt(i)]++;
		}

		int max = -1;
		char maxChar = ' ';

		// iterate through string input and find maximum char count
		for (int i = 0; i < aString.length(); i++) {
			if (max < count[aString.charAt(i)]) {
				max = count[aString.charAt(i)];
				maxChar = aString.charAt(i);
			}
		}

		int maxCharIndex = aString.indexOf(maxChar);

		System.out.println("The most common character is: " + maxChar + "\n" + "The first index is: " + maxCharIndex);

	}

	public static void main(String[] args) {

		Question1 q1 = new Question1();

		q1.maxCharacter("aaafbbbdeeeda");

	}

}
