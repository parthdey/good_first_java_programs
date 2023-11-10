import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        //        Java Program to Find Factorial of a Number
        Scanner sc = new Scanner(System.in);
        int factorial = 1, num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
    
}
