package Loop_Que;

import java.util.Scanner;

public class Q31_Armstrong_Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int num = sc.nextInt();
        System.out.println("Armstrong No. between 1 to "+num+" is :- ");
        for (int i = 1 ; i<=num ; i++) {
            int sum = 0, count = 0, rem;
            int num1 = i;
            while (i > 0) {
                count++;
                i = i / 10;

            }
            i = num1;

            while (i > 0) {
                rem = i % 10;
                sum = sum + (int) Math.pow(rem, count);
                i = i / 10;
            }
            i = num1;

            if (i==sum){
                System.out.print(i+" ");
            }
        }
    }
}
