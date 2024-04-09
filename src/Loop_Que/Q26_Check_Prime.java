package Loop_Que;

// 26.	Write a Java program to check whether a number is Prime number or not.

import java.util.Scanner;

public class Q26_Check_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();
        int i;
        for ( i = 2 ; i< num ; i++){
            if (num%i==0){
                System.out.println("Not a prime ");
                break;
            }
        }
        if (i==num){
            System.out.println("Prime");
        }
    }
}
