 package ExceptionHandling;

//import java.io.IOException;

public class Main {
	void method()throws ArithmeticException{
		throw new ArithmeticException("device Error");
	}
	public static void main(String[] args) {
		
			Main m=new Main();
			m.method();
		System.out.println("normal flow");
	}
}
