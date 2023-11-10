import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // check wheather it is a leap year or not

                Scanner scanner = new Scanner(System.in);

                // Input: Ask the user to enter a year
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                // Check if it's a leap year
                if (isLeapYear(year)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }

                scanner.close();
            }

            public static boolean isLeapYear(int year) {
                // Check if the year is divisible by 4
                if (year % 4 == 0) {
                    // Check for exceptions for centuries
                    if (year % 100 != 0 || (year % 400 == 0)) {
                        return true; // It's a leap year
                    }
                }
                return false; // It's not a leap year
    }
    
}
