package TwoThreadOnSingleObject;

public class NewThread implements Runnable{

	@Override
	public void run() {
		for(int i=20223;i>=1;i=i/3) {
			String firstThread=Thread.currentThread().getName();
			System.out.println(firstThread+" inside newThread 1() of runnable "+i);
		}
	}
	public static void main(String[] args) {
		NewThread nt=new NewThread();
		Thread one=new Thread(nt);
		Thread two=new Thread(nt);
		
		one.setPriority(10);
		two.setPriority(1);
		one.setName("Kohli");
		two.setName("Dhoni");
		
		one.start();
		two.start();
	}
}
