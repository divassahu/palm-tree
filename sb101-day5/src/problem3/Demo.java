package problem3;

import java.util.function.Function;

public class Demo implements X {

	@Override
	public int convetStringToNumber(String s) {
		Function<String,Integer> f= i-> Integer.parseInt(i);
		int x=f.apply(s);
		return x;
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		int ans=d.convetStringToNumber("98");
		System.out.println(ans*ans);
	}
}
