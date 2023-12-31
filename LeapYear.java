public class LeapYear {
   public static void main(String[] args) {
      int year = 2001;
      if (year % 4 == 0) {
      if (year % 100 == 0) {
      if (year % 400 == 0) {
      System.out.println("Leap year");
      } else {
      System.out.println("Not leap year");
      }
      } else {
      System.out.println("Not leap year");
      }
      } else {
      System.out.println("Not leap year");
      }
      // second method
      // if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
      // System.out.println("Leap year");
      // } else {
      // System.out.println("Not leap year");
      // }
   }
}
