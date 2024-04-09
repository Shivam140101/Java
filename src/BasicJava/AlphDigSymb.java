package BasicJava;
import java.util.Scanner;
public class AlphDigSymb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any charater ");
        char ch = sc.next().charAt(0);
        System.out.println("The character is  "+ch+" ASCII  "+(int)ch);
        if((ch >='A' && ch <='Z') || (ch >='a' && ch<='z') ) {
            System.out.println("The Entered character is alphabate");
            if(ch >='A' && ch <='Z') {
                int ch1= (int)ch;
                ch1= ch1+ 32 ;
                ch = (char)ch1;
                System.out.println("ch =   "+ch+" ASCII  "+(int)ch);
            }
            switch(ch){
                case 'a':
                    System.out.println("The alphabate is vowel "+ch);
                    break;
                case 'e':
                    System.out.println("The alphabate is vowel "+ch);
                    break;
                case 'i':
                    System.out.println("The alphabate is vowel "+ch);
                    break;
                case 'o':
                    System.out.println("The alphabate is vowel "+ch);
                    break;
                case 'u':
                    System.out.println("The alphabate is vowel "+ch);
                    break;
                default:
                    System.out.println("The alphabate is Consonante "+ch);
                    break;
            }
        }
        else if(ch >='0' && ch <='9')
            System.out.println("The Entered character is Digits");
        else
            System.out.println("The Entered character is Special Symbol");

        System.out.println("End of main Method");

    }
}
