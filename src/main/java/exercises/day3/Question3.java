package exercises.day3;
class A{
	
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}

class B extends A{
	
	private int height;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void printAgeAndHeight() {
		System.out.println("Age: " + getAge() + " Height: " + height);
	}
}


public class Question3 {

	public static void main(String[] args) {
		
		B b = new B();
		b.setAge(20);
		b.setHeight(5);
		b.printAgeAndHeight();

	}

}
