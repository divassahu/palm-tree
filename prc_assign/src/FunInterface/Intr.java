package FunInterface;
@FunctionalInterface
public interface Intr {
	void sayHi(String name);
}
class X implements Intr{

	@Override
	public void sayHi(String name) {
		System.out.println("Hiii "+name);
	}
	public static void main(String[] args) {
		Intr i1=new X();
		i1.sayHi("abx");
	}
}
