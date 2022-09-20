package problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("new1.txt");
		BufferedReader br=new BufferedReader (fr);
		
		String lines=br.readLine();
		
		while(lines!=null) {
			System.out.println(lines);
			lines=br.readLine();
		}
		br.close();
	}
	
}
