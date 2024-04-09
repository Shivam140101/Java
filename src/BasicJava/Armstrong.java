package BasicJava;
import  java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3- Digits Number ");
        int num = sc.nextInt();
        System.out.println("The Digits is   "+num);
        int  sum=0,rem=0,tmp;
        tmp = num;

        while(num !=0) {
            rem = num % 10;
            sum += (rem *rem *rem);
            num /= 10;
        }
        System.out.println("The cube of sum for each Digits  "+sum);


        if(tmp == sum)
            System.out.println("The number is Armstrong ");
        else
            System.out.println("The number is not  Armstrong ");
    }
}
