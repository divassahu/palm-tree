package problem3;

public class A extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			if(i%2==0)
			System.out.println("even numbers between 1 to 20 is "+i);
		}
		System.out.println("end of even numbers");
	}
}
