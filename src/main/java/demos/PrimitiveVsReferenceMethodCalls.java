package demos;

public class PrimitiveVsReferenceMethodCalls {

	public static void main(String[] args) {

		// passing a primitive variable
		int x = 5; // local variable
		int result = testingPrimitivePass(x);
		System.out.println("result from method call: " + result);
		System.out.println("x = " + x);

		// passing a reference variable
		StringBuffer sb1 = new StringBuffer("Fido");
		StringBuffer sb3 = testingReferencePass(sb1);
		System.out.println("sb3 = " + sb3);
		System.out.println("sb1 = " + sb1);

	}

	public static int testingPrimitivePass(int y) { // y is a local variable

		y = 10;
		return y;

	}

	public static StringBuffer testingReferencePass(StringBuffer input2) {

		input2.append(" is wonderful.");
		return input2;

	}

}
