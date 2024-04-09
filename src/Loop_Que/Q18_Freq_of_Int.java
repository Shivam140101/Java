package Loop_Que;

// 18.	Write a Java program to find frequency of each digit in a given integer.

import java.util.Scanner;

public class Q18_Freq_of_Int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        int num = sc.nextInt();

        int[] digitFrequencies = new int[10];
        int originalNumber = num;

        while (num != 0) {
            int digit = num % 10;
            digitFrequencies[digit]++;
            num /= 10;
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Digit Frequencies:");

        for (int i = 0; i < digitFrequencies.length; i++) {
            if (digitFrequencies[i] > 0) {
                System.out.println(i + ": occurs " + digitFrequencies[i] +" times");
            }
        }


    }
}
