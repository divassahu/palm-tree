package assign.day9.problem2;

public class Main {
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		
		Animal a1=new Dog();
		Animal c1=new Cat();
		Animal t1=new Tiger();
		
		arr[0]=a1;
		arr[1]=c1;
		arr[2]=t1;
		
		System.out.println("-------------------------------");
		
		arr[0].makeNoise();
		arr[0].eat();
		arr[0].walk();
		
		System.out.println("-------------------------------");
		
		arr[1].makeNoise();
		arr[1].eat();
		arr[1].walk();
		
		System.out.println("-------------------------------");
		
		arr[2].makeNoise();
		arr[2].eat();
		arr[2].walk();
		
		
	}
}
