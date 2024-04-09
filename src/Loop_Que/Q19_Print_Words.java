package Loop_Que;

// 19.	Write a Java program to enter a number and print it in words.

import java.util.Scanner;

public class Q19_Print_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number up to 5 digits:- ");
        int number = sc.nextInt();

        String[] units = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        String[] teens = {
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String numberInWords = "";
        int originalNumber = number;

        if (number == 0) {
            numberInWords = "zero";
        } else if (number < 0) {
            numberInWords = "minus ";
            number = Math.abs(number);
        }

        int digit;
        int count = 0;

        while (number > 0) {
            digit = number % 10;
            number /= 10;
            count++;

            if (count == 1) {
                numberInWords = units[digit] + " " + numberInWords;
            } else if (count == 2) {
                if (digit == 1) {
                    numberInWords = teens[number % 10];
                    number = 0;
                } else {
                    numberInWords = tens[digit] + " " + numberInWords;
                }
            } else if (count == 3) {
                numberInWords = units[digit] + " hundred " + numberInWords;
            } else if (count == 4) {
                numberInWords = units[digit] + " thousand " + numberInWords;
            } else if (count == 5) {
                numberInWords = tens[digit] + " " + numberInWords;
            } else if (count == 6) {
                if (digit == 1) {
                    numberInWords = teens[number % 10];
                    number = 0;
                } else {
                    numberInWords = tens[digit] + " " + numberInWords;
                }
            }
        }

        System.out.println("Number: " + originalNumber);
        System.out.println("Number in words: " + numberInWords);





    }


}
