import java.math.*;

public class Harshad {
   
   // Non-recursive solution
   public static boolean isHarshadnr(int n) {
      // A copy of the input number
      // that will be used to pull out each
      // individual digit.
      int temp = n;
      // Will store sum of digits
      int sum = 0;
      
      // Log base 10 of input number
      int base = (int) Math.floor(Math.log(n) / Math.log(10));
      
      // Each iteration sums the digit in the ones place 
      // then truncates the digit in the ones places.
      for (int i = 0; i <= base; i++) {
         sum += temp % 10;
         temp /= 10;
      }
      return n % sum == 0;
   }
   
   // Recursive solution
   public static boolean isHarshad(int n, int temp, int sum) {
      if (temp == 0) {
         return n % sum == 0;
      } else {
         sum += temp % 10;
         temp /= 10;
         return isHarshad(n, temp, sum);
      }
   }

   public static void main(String[] args) {
      System.out.println(isHarshad(75, 75, 0));
      System.out.println(isHarshad(171, 171, 0));
      System.out.println(isHarshad(481, 481, 0));
      System.out.println(isHarshad(89, 89, 0));
      System.out.println(isHarshad(516, 516, 0));
      System.out.println(isHarshad(200, 200, 0));
   }
}