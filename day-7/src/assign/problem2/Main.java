package assign.problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		
		System.out.println("enter the position of character");
		int i = sc.nextInt();
		
		System.out.println("the character at "+i+" Position is : "+str.charAt(i-1));
	}
}
