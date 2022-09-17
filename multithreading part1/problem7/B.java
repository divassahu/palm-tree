package problem7;

public class B implements Runnable {
	@Override
	public void run() {
		String t2Name=Thread.currentThread().getName();
		int t2Priority=Thread.currentThread().getPriority();
		for(int i=0;i<10;i++) {
			System.out.println("the name of thread is "+t2Name);
			System.out.println("the priority of thread 2 is "+t2Priority);
		}
		System.out.println("end of thread 2 of B()");
	}
}
