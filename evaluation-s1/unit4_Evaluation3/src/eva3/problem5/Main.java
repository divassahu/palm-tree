package eva3.problem5;

public class Main {
	public static void main(String[] args) {
		Vehical v1=new FuelCar();
		Vehical v2=new ElectricCar();
		
		v1.run();
		v2.service();
	}
}

