package p2;

public class Main {
	public static void main(String[] args)throws Exception {
		Mobile obj=new Mobile();
		
		obj.buyMobile("Samsung","a51");
		System.out.println("Model added successfully");
		
		obj.getMobile("Samsung");
		obj.buyMobile("Samsung", "a51");
	}
}
