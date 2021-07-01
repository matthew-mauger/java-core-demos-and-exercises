package exercises.day3;

class Q5Animal {
	private String furColor;

	public void makeNoise(String noise) {
		System.out.println("Animal Noise: " + noise);
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String color) {
		this.furColor = color;
	}
}

class Q5Dog extends Q5Animal {

	@Override
	public void makeNoise(String noise) {
		System.out.println("Dog Noise: " + noise);
	}

}

public class Question5 {

	public static void main(String[] args) {
		Q5Animal a = new Q5Animal();
		Q5Dog d = new Q5Dog();

		a.makeNoise("Noise!");
		d.makeNoise("Bark!");
	}

}
