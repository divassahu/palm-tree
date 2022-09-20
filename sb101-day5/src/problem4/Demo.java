package problem4;

import java.util.Arrays;
import java.util.List;

public class Demo implements PrintList{

	@Override
	public void display(List<String> city) {
		city.forEach(System.out::println);
	}
		public static void main(String[] args) {
			List<String> city=Arrays.asList("Gaya","Patna","Chennai","Kolkata","Mumbai");
			
			Demo d=new Demo();
			d.display(city);
		}
}
