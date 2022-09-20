package problem7;

public class A implements Runnable{

	@Override
	public void run() {
		String t1Name=Thread.currentThread().getName();
		int t1Priority=Thread.currentThread().getPriority();
		for(int i=0;i<10;i++) {
			System.out.println("name of thread is "+t1Name);
			System.out.println("priority of thread is "+t1Priority);
		}
		System.out.println("end of thread A()");
	}

}
