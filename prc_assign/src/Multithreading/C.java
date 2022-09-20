package Multithreading;

public class C extends Thread{
	@Override
	public void run() {
		int i=20;
		while(i>10) {
			System.out.println("inside run C "+i);
			i--;
		}
		System.out.println("end of run C");
	}
}
