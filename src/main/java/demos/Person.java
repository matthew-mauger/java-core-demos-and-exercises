package demos;

public class Person { // class is called type

	// variables, properties, attributes, fields - all refer to same thing
	// data

	// instance variables - every object instance gets it's own copy of the variable

	private int age; // int is a primitive - value is stored directly in variable
	private String name; // reference/address TO a live String object out on the heap - default value of
							// ref variable == null
	private double heightInInches;
	private double salary;

	// static variables

	static int count; // static == blueprint - found in one place only, the blueprint - does have a
						// default value

	public Person() {

	}

	public Person(int ageInput) {

		age = ageInput;

	}

	public static String staticPracticeMethod() {

		return "testing";

	}

	// instance method - every object instance gets it's own copy of the method

	public void makeNoise() {

		Person.count++;

		System.out.println("static count is now: " + Person.count);

		int x = 5; // local variable - it was declared inside a method
		int y; // local variables do NOT have a default value

		System.out.println("name: " + name + " age: " + age + " height: " + heightInInches);

	} // x is deleted - evaporated

	// instance method and it is an overloaded version of makeNoise

	public void makeNoise(String message) {

		System.out.println("my message is this: " + message);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { // instance method - has to be running a particular instance. P1? P2?
		this.age = age; // "this" is a reference variable that holds an address of the instance you are
						// currently accessing.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

}
