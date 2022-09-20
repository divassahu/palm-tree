package assign2.p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static <E> ArrayList<Integer> printList(int[] arr){
		ArrayList<Integer> al=new ArrayList<>();
		for(int element:arr) {
			al.add((Integer) element);
		}
		return al;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element ");
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the elemnts");
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> res=printList(arr);
		for(Integer x:res) {
			System.out.print(x+" ");
		}
	}
}
