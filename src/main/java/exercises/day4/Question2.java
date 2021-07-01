package exercises.day4;

public class Question2 {

	public static void main(String[] args) {

		String s1;
		String s2;

		s1 = new String("cat");
		s2 = "cat";

		boolean result;
		result = (s1 == s2);
		System.out.println(result);

		StringBuilder sb = new StringBuilder("cat");
		sb.append(" meow");

		System.out.println(sb);

	}

}
