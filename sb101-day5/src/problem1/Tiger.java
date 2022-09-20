package problem1;

public class Tiger extends Animal{

	@Override
	void eat(String string) throws AnimalException {
	System.out.println(string);
	}
		public static void main(String[] args) throws AnimalException {
			Animal a1=new Tiger();
			try {
				a1.eat("Tiger is going to eat");
			}
			catch(Exception e) {
				throw new AnimalException("Tiger is eating!!");
			}
		}
}
