package com.gpt;

/*

 * Assignment:


Create a class called "Person" that has the following properties:

name (a string)

age (an int)

Create a class called "Student" that inherits from the Person class and has the following properties:

studentId (a string)

gpa (a double)

Create a class called "Teacher" that inherits from the Person class and has the following properties:

salary (a double)

subject (a string)

Create a class called "School" that has a list of Person objects (students and teachers) and the following methods:

addPerson(Person p)

removePerson(Person p)

getPerson(String name)

Create a few instances of the Student and Teacher classes, add them to a School object, and test out the methods of the School class to see the output.

 */

public class Person {
	
	public String name;
	
	public int age;
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
