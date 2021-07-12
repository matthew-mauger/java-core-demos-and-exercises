package exercises.day11;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Question1 {

	public static void main(String[] args) {

		// 1-1
		double result;

		ProductInterface productInterface = (a, b) -> (a * b);
		result = productInterface.product(4, 5);
		System.out.println(result);

		// 1-2
		StringInterface stringInterface = () -> ("Here is a lambda String");
		System.out.println(stringInterface.message());

		// 1-3
		ConstructorInterface constructorInterface = ArrayList::new;
		List<String> list = constructorInterface.getList();
		list.add("Hello");
		list.add("World");
		System.out.println(list);

		// 1-4
		// JavaFX Version
		// Slider fxSlider = new Slider();
		// fxSlider.valueProperty()
		// .addListener((ov, oldValue, newValue) -> System.out.printf("The slider's new
		// value is %s%n", newValue));

		// Java Swing Version
		JSlider slider = new JSlider();

		// -- Anonymous class way
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("ChangedEvent is" + e);
			}
		});

		// -- Lambda expression way
		slider.addChangeListener((e) -> System.out.println("ChangedEvent is" + e));

	}

}
