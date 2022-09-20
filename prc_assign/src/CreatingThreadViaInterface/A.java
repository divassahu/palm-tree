package CreatingThreadViaInterface;

public class A implements Runnable{

	@Override
	public void run() {
		for(int i=1024;i>=1;i=i/2) {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" inside run of A implementing runnable "+ i);
		}
	}
	static public void main(String[] args) {
		A a1= new A();
		Thread t1= new Thread(a1);
		t1.start();
		
		t1.setName("Ronaldo");
		
		for(long j=(long) 1000000000;j>1;j=j/10){
			String t2=Thread.currentThread().getName();
			System.out.println(t2+" inside main of A() "+j);
		}
	}
}
