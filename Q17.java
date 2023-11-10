import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        // Java Program to Display Fibonacci Series
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int firstTerm = 0, secondTerm = 1, new_number = 0;
        System.out.println("fibonacci int of :"+ target);
        for (int i = 1; i <= target; i++) {
            System.out.println(firstTerm + ", ");

            new_number = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = new_number;
            
        }
    }
    
}
