import java.util.Scanner;

public class LCM_HCF {
   public static int findHCF(int[] nums) {
      int hcf = 1;
      int min = Integer.MAX_VALUE;
      for (int num : nums) {
         if (num < min) {
            min = num;
         }
      }
      for (int i = 2; i <= min; i++) {
         boolean isCommon = true;
         for (int num : nums) {
            if (num % i != 0) {
               isCommon = false;
               break;
            }
         }
         if (isCommon) {
            hcf = hcf * i;
            for (int j = 0; j < nums.length; j++) {
               nums[j] = nums[j] / i;
            }
         }
      }
      return hcf;
   }

   public static int findLCM(int[] nums) {
      int lcm = nums[0];
      for (int i = 1; i < nums.length; i++) {
         lcm = (lcm * nums[i]) / findHCF(new int[]{lcm, nums[i]});
      }
      return lcm;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int n = sc.nextInt();
      int[] nums = new int[n];
      System.out.print("Enter the elements: ");
      for (int i = 0; i < n; i++) {
         nums[i] = sc.nextInt();
      }
      System.out.println("The LCM of the given numbers is: " + findLCM(nums));
      System.out.println("The HCF of the given numbers is: " + findHCF(nums));
   }
}
