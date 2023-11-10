import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Java Program to Check Whether a Number is Even or Odd
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }
    
}
