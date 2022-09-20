package SleepMethod;

public class Sleep implements Runnable{
	int sum=0;
	@Override
	public void run() {
		for(int i=4096;i>=1;i=i/4) {
			System.out.println("inside run method "+i);
			sum+=i;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		public static void main(String[] args) {
			Sleep s=new Sleep();
			Thread t=new Thread(s);
			
			t.start();
			try {
				
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end of main"+s.sum);
		}
}
