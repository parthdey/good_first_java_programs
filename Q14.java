import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //        Java Program to Calculate the Sum of Natural Numbers
        Scanner sc = new Scanner(System.in);
        int sum = 0, num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
    
}
