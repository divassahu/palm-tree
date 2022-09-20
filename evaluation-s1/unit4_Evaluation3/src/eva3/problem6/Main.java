package eva3.problem6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter your choice");
		
		int choice= sc.nextInt();
		
		if(choice==1) {
			ArtStudent art=new ArtStudent();
			
			System.out.println("enter marks for hindi");
			
			int h_Marks=sc.nextInt();
			
			System.out.println("enter marks for english");
			
			int e_Marks=sc.nextInt();
			
			System.out.println("enter marks for history");
			
			int history_Marks=sc.nextInt();
			
			art.setHindiMarks(h_Marks);
			art.setEnglishMarks(e_Marks);
			art.setHistoryMarks(history_Marks);
			
			double res1=art.findPercentage();
			System.out.println("Your percentage is : "+res1);
			
		}
		else if(choice==2) {
			
			CommerceStudent cs=new CommerceStudent();
			
			System.out.println("enter marks for Accounts");
			
			int acc_Marks=sc.nextInt();
			
			System.out.println("enter marks for economics");
			
			int eco_Marks=sc.nextInt();
			
			System.out.println("enter marks for Business studies");
			
			int bs_Marks=sc.nextInt();
			
			cs.setAccountMarks(acc_Marks);
			cs.setEconomicsMarks(eco_Marks);
			cs.setBusinessStudiesMarks(bs_Marks);
			
			double res2=cs.findPercentage();
			System.out.println("Your Percentage is : "+res2);
			
		}
		else if(choice==3) {
			ScienceStudent ss = new ScienceStudent();
			
			System.out.println("enter marks for physics");
			
			int phy_Marks=sc.nextInt();
			
			System.out.println("enter marks for chemistry");
			
			int chem_Marks=sc.nextInt();
			
			System.out.println("enter marks for Maths");
			
			int maths_Marks=sc.nextInt();
			
			System.out.println("Enter marks for biology");
			
			int bio_Marks=sc.nextInt();
			
			ss.setBiologyMarks(bio_Marks);
			ss.setPhysicsMarks(phy_Marks);
			ss.setChemistryMarks(chem_Marks);
			ss.setMathsMarks(maths_Marks);
			
			double res3=ss.findPercentage();
			System.out.println("Your percentage is : "+res3);
		}
		else {
			System.out.println("0");
		}
	}
}
