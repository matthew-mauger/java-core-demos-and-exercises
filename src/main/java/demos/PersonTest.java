package demos;

public class PersonTest {

	static int z = 1;
	int blah;

	public static void main(String[] args) {

		int x; // local variable

		Person p1 = null; // variable defined in methods are local varibles - don't have default values
		p1 = new Person(); // right hand side of equals sign happens first (creates a person object
							// and returns an address and assigns that to p1)
		// p1.age = 20;
		p1.setAge(10);

		// p1.name = "Franny";
		p1.setName("Franny");

		p1.makeNoise();

		Person p2 = new Person(); // new is calling the default "no-args" constructor

		// p2.age = 50;
		p2.setAge(30);

		// p2.name = "Fred";
		p2.setName("Fred");

		p2.setSalary(10000);

		p2.makeNoise();

		p1.makeNoise("Hello");

		Person p3 = new Person(20);

		p3.makeNoise();

		System.out.println(); // println method is overloaded many times

		System.out.println(Person.count);

		String staticResult = Person.staticPracticeMethod();
		System.out.println("static result: " + staticResult);

		Person p4 = new Person();
		p4.makeNoise();

		System.out.println("person count = " + Person.count);

		// from a static context, you can only directly access other static
		// methods/variables

		System.out.println(z); // ok
		// System.out.println(blah); //will throw error - which instance is blah a part
		// of?
	}

}
