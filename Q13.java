public class Q13 {public static void main(String[] args) {
    //        Java Program to Check Whether a Character is Alphabet or Not
//        Scanner sc = new Scanner(System.in);
char ch = '*';
int ascii = ch;
if(( ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
    System.out.println("the character is a alphabets " + ", ascii value of character :" + ascii);
}else {
    System.out.println("the character is not a alphabets " + ", ascii value of character :" + ascii);
}
}
    
}
