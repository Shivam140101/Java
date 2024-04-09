package BasicJava;
import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Digits Number ");
        int num = sc.nextInt();
        System.out.println("The Digits is   "+num);
        int rev_digit=0,sum=0,rem=0,tmp;
        tmp = num;

        while(num !=0) {
            rem = num % 10;
            sum += rem;
            rev_digit = (rev_digit * 10)+rem;
            num /= 10;
        }
        System.out.println("The sum of Digits  "+sum);
        System.out.println("The Reverse of Digits  "+rev_digit);
        System.out.println("The Digits is   "+num);
        if(tmp == rev_digit)
            System.out.println("The number is palindrome ");
        else
            System.out.println("The number is not palindrome ");
    }
}
