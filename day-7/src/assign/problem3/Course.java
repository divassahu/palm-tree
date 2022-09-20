package assign.problem3;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		System.out.println("courseId is : "+courseId);
		System.out.println("course name is : "+courseName);
		System.out.println("Course fee is : "+courseFee);
	}
	
	static void authenticateUser(String userName, int pwd) {
		if(userName.equals("admin") && pwd==1234) {
			Course c1 =new Course();
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("enter course name");
			 String cname= sc.nextLine();
			 
			 System.out.println("enter Course id");
			 int id=sc.nextInt();
			 
			 System.out.println("enter course Fee");
			 int fee =sc.nextInt();
			 
			 c1.courseId=id;
			 c1.courseName=cname; 
			 c1.courseFee=fee;
			 
			 c1.displayCourseDetails();
			 }
		else {
			System.out.println("invalid userName or password");
		}
	}
	
	public static void main(String[] args) {
		authenticateUser("admin",1234);
		System.out.println("**************************");
		
		authenticateUser("divas",1234);
	}
}
