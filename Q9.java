public class Q9 {
    public static void main(String[] args) {
        //        Java Program to Find the Largest Among Three Numbers
        int a = 16, b = 8, c = 12;
        if(a >= b && a >= c){
            System.out.println("a is greatest in three of them " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is greatest in three of them" + b);
        }else {
            System.out.println("c is greatest in three of them" + c);
        }
    }
    
}
