package SSyncronized;

public class Main {
	
	public static void main(String[] args) {
		Common c=new Common();
		ThreadA t1=new ThreadA(c,"Dhoni");
		ThreadB t2=new ThreadB(c,"Kohli");
		
		t1.start();
		t2.start();
		
	}
}
