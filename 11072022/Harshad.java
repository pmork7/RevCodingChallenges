import java.math.*;

public class Harshad {

   public static boolean isHarshad(int n) {
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

   public static void main(String[] args) {
      System.out.println(isHarshad(75));
      System.out.println(isHarshad(171));
      System.out.println(isHarshad(481));
      System.out.println(isHarshad(89));
      System.out.println(isHarshad(516));
      System.out.println(isHarshad(200));     
   }
}