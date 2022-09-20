package problem2;

import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>((aStr,bStr) -> bStr.compareTo(aStr));
		   
		  // Add elements to the Treeset
		  ts.add("Agra");
		  ts.add("Mathura");
		  ts.add("Kanpur");
		  ts.add("Bhilai");
		  ts.add("Ranchi");
		  ts.add("Indore");
		  ts.add("Bhopal");
		  
		  //Display the elements .
		  for(String element : ts)
		    System.out.println(element + "");
		   
		  System.out.println();                       
	}
}