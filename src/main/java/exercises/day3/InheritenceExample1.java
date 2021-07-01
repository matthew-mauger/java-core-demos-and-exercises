package exercises.day3;

// question 1

class Cycle {
	public String define_me() {
		return "a vehicle with pedals.";
	}
}

class Bike extends Cycle {
	@Override
	public String define_me() {
		return "a cycle with an engine.";
	}

	public Bike() {
		System.out.println("Hello I am a motorcycle, I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

public class InheritenceExample1 {

	public static void main(String[] args) {
		Bike m = new Bike();

	}

}
