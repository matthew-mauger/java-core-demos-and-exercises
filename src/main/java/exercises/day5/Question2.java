package exercises.day5;

public class Question2 {

	public void isPalindrome(String str) {

		StringBuilder str2 = new StringBuilder(str);
		str2 = str2.reverse();

		if (str.equals(str2.toString())) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is NOT a palindrome");
		}

	}

	public static void main(String[] args) {

		Question2 q2 = new Question2();

		q2.isPalindrome("racecar");

	}

}
