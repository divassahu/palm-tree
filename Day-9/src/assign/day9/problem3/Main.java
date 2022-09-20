package assign.day9.problem3;

public class Main {
	public static void main(String[] args) {
		Member e1= new Employee();
		e1.name="Anand";
		e1.age=30;
		e1.phoneNumber="9798989890";
		e1.salary=55678.09;
		e1.address="c-158, KashiNagar, Lmp";
		
		Member m1=new Manager();
		m1.name="Joy";
		m1.age=20;
		m1.phoneNumber="987678767";
		m1.salary=809090.90;
		m1.address="mq-144, lmp";
		
		Employee emp=(Employee)e1;
		emp.printDetails();
		
		Manager mng= (Manager)m1;
		
		System.out.println("**************");
		
		mng.printDetails();
	}
}
