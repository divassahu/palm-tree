package assign.day9.problem2;

public class Tiger extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Tiger is Roaring...");
	}
	@Override
	public void walk() {
		System.out.println("Tiger is walking");
	}
	@Override
	public void eat() {
		System.out.println("Tiger is eating");
	}
}
