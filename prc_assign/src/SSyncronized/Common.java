package SSyncronized;

public class Common {
	public void fun1(String name) {
		System.out.println("Welcome");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
	}
}
