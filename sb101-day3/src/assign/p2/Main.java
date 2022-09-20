package assign.p2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		
		String dob = sc.next();
		
		try{
		LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate c1 = LocalDate.now();
		Period diff = Period.between(d1,c1);
		if(diff.getYears() > 0)
		System.out.println("Your age is :"+diff);
		}catch (Exception e){
		System.out.println("Please enter Date of bith in valid pattern"+e.getCause());
		}
	}
}