package eva3.problem5;

public interface Vehical {
	void run();
	
	default void service() {
		System.out.println("car needs service");
	}
}
