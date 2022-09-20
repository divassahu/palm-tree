package Multithreading;

public class A extends Thread{

	@Override
	public void run() {
		int i=20;
		while(i>10) {
			System.out.println("inside run A "+i);
			i--;
		}
		System.out.println("end of run A");
	}
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		
		a1.start();
		b1.start();
		c1.start();
		
		for(int j=30;j<40;j++) {
			System.out.println("inside main method "+j);
		}
		System.out.println("end of main");
	}
}
