package Loop_Que;

// 46.	Write a Java program to convert Decimal to Octal number system.

import java.util.Scanner;

public class Q46_Dec_to_Oct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int deci = sc.nextInt();

        int octalNumber = 0;
        int place = 1;

        if (deci == 0) {
            octalNumber = 0;
        } else {
            while (deci > 0) {
                int remainder = deci % 8;
                octalNumber += remainder * place;
                deci /= 8;
                place *= 10;
            }
        }

        System.out.println("Octal number: " + octalNumber);
    }
}
