package problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File f=new File("new1.txt");
		System.out.println(f);
		System.out.println(f.exists());
		try {
			f.createNewFile();
			FileWriter fw=new FileWriter("new1.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no of employee");
			int n=sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println("enter the name of emp - "+i);
				String empName=sc.next();
				fw.write(empName);
				fw.write("\n");
				
				System.out.println("enter address of emp - "+i);
				String add=sc.next();
				fw.write(add);
				fw.write("\n");
			}
			fw.flush();
			fw.close();
			System.out.println(f.length());
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
