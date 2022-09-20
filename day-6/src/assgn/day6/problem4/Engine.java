package assgn.day6.problem4;

public class Engine {
	int rmp;
	String power;
	String manufacturer;
	boolean hasTurbo;
	
	Engine(){
		
	}
	
	Engine(int rmp, String power, String manufacturer, boolean hasTurbo){
		this.rmp=rmp;
		this.power=power;
		this.manufacturer=manufacturer;
		this.hasTurbo=hasTurbo;
	}
	
	public void engineDetail() {
		System.out.println("engine has rmp of : "+rmp);
		System.out.println("engine has power of : "+power);
		System.out.println("engine manufacturer is : "+manufacturer);
		System.out.println("engine is turbo : "+hasTurbo);
	}
}
