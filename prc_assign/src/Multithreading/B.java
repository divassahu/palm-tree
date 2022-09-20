package Multithreading;

public class B extends Thread{
	@Override
	public void run() {
		int i=20;
		while(i>10) {
			System.out.println("inside run B "+i);
			i--;
		}
		System.out.println("end of run B");
	}
}
