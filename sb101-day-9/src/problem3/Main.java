package problem3;

public class Main {
	public static void main(String[] args) {
		
		A a2=new A();
		B b2=new B(a2);
		
		a2.start();
		b2.start();
	}
	
}
