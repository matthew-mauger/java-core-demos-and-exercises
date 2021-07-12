package exercises.day9;

import java.time.LocalDateTime;

public class Exercise1 implements Runnable {

	private LocalDateTime now;

	@Override
	public void run() {

		now = LocalDateTime.now();
		System.out.println(now);

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		now = LocalDateTime.now();
		System.out.println(now);

	}

	public static void main(String[] args) {

		Exercise1 ex = new Exercise1();
		Thread t1 = new Thread(ex);
		t1.setName("MyThread");
		System.out.println(t1.getName());
		t1.start();

	}

}
