package assgn.day6.problem4;

public class Car {
	String model;
	String companyName;
	String color;
	Engine engine;
	
	Car() {
	}
	
	Car(String model, String companyName, String color, Engine engine){
		this.model=model;
		this.companyName=companyName;
		this.color=color;
		this.engine=engine;
	}
	
	public void carDetail() {
		System.out.println("Model of car is : "+model);
		System.out.println("car's companyName is : "+companyName);
		System.out.println("car is of -"+color+ " -color");
		
		Engine e1=new Engine();
		e1.rmp = 1200;
		e1.power="3000HP";
		e1.manufacturer="Honda";
		e1.hasTurbo=true;
		
		e1.engineDetail();
	}
}
