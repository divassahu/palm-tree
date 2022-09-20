package problem3;

public class B extends Thread {
	
	A a1;

	public B(A a1) {
		this.a1=a1;
	}

	@Override
	public void run() {
		try {
			a1.join();
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.println("odd number between 1 to 20 is "+i);
			}
		}
		System.out.println("end of odd numbers");
	}

}
