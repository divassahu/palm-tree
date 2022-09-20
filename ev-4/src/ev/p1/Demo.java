package ev.p1;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank){
        Bank b = null;

        if(b instanceof ICICIBank){
            return new ICICIBank();
        }
        else if(b instanceof AxisBank){
            return new AxisBank();
        }


        return b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Demo d = new Demo();
        Demo.getBank("ICICIBank");

        Bank e = new ICICIBank();
        String ba = sc.nextLine();
        e.branchName = "Madanpura";
        e.ifscCode = "cnb123456";



    }
}
