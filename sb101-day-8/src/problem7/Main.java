package problem7;

public class Main {
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(b1);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
	}
}

/* outPut
  the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
name of thread is Dhoni
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
the priority of thread 2 is 10
the name of thread is Kohli
priority of thread is 8
the priority of thread 2 is 10
end of thread 2 of B()
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
name of thread is Dhoni
priority of thread is 8
end of thread A()*/

