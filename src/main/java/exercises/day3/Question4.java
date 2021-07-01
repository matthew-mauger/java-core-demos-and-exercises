package exercises.day3;

class Q4Animal {
	private String furColor;

	private void makeNoise() {
		System.out.println("Noise!");
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String color) {
		this.furColor = color;
	}
}

class Q4Dog extends Q4Animal {

}

public class Question4 {
	public static void main(String[] args) {

		Q4Dog aDog = new Q4Dog();
		aDog.setFurColor("Black");
		System.out.println("Fur Color: " + aDog.getFurColor());

	}
}
