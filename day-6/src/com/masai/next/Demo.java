package com.masai.next;

public class Demo {
	Demo(){
		this("abc");
		System.out.println("inside demo zero parameter constructor");
	}
	Demo(String s){
		this(60);
		System.out.println("inside demo string parameterized constructor");
	}
	Demo(int i){
		this((float)10.0);
		System.out.println("inside demo integer parameterized constructor");
	}
	Demo(float f){
		System.out.println("inside demo float parameterized constructor");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
	}
}
