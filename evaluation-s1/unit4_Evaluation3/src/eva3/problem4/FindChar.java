package eva3.problem4;

import java.util.Scanner;

public class FindChar {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an String");
		String str= sc.nextLine();
		
		System.out.println("Enter a position");
		int position=sc.nextInt();
		
		while(position>str.length()-1) {
			System.out.println("Invalid position, Please enter a valid position =>");
			position=sc.nextInt();
			
		}
			System.out.println("the charcter is : "+str.charAt(position));
		
		}
}
