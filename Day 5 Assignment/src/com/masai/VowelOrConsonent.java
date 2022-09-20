package com.masai;

public class VowelOrConsonent {
	void check(char x) {
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U') {
			System.out.println("character is an vowel");
		}
		else
			System.out.println("character is a consonent");
	}
	public static void main(String []args) {
		new VowelOrConsonent().check('y');
		
		new VowelOrConsonent().check('a');
		
		//how to take invalid characters		
	}
}
