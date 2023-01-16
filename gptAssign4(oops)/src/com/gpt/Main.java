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

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School school=new School();
		
		Person s1=new Student("Jack", 20, "j23", 8.6);
		
		Person s2=new Student("Vimal", 17, "v17", 8.4);
		
		Person t1=new Teacher("Dean", 36, 98098, "Computer Science");
		
		Person t2=new Teacher("Abhay", 39, 90000, "Mechanics");
		
		school.addPerson(s1);
		school.addPerson(s2);
		school.addPerson(t1);
		school.addPerson(t2);
		
		System.out.println("Number of people in school are "+school.personList.size());
		
		Person p1=school.getPerson("Dean");
		
		if(p1!=null) {
			System.out.print(p1.name+" is a ");
			System.out.println(p1 instanceof Teacher ? "teacher" : "student");
			
		}
		
		school.removePerson(s1);
		System.out.println("new size of list after removing "+ school.personList.size());
		

	}

}
