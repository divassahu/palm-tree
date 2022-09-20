package assign.day9.problem2;

public class Cat extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Meawing...");
	}
	@Override
	public void walk() {
		System.out.println("Cat is walking");
	}
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
}
