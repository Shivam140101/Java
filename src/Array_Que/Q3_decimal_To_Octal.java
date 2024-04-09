package Array_Que;

import java.util.Scanner;

public class Q3_decimal_To_Octal {

    static  int a[];

    static int size;
    static void inputArray(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
        sc.close();
    }
    static void outputArray(int b[]){
        System.out.println("Decimal Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("x["+i+"] = "+b[i]);
        }
    }

    static int decimalToOctal(int decimal) {

        int octal = 0;
        int placeValue = 1;

        while (decimal > 0) {
            octal += (decimal % 8) * placeValue;
            decimal /= 8;
            placeValue *= 10;
        }
        return octal;
    }

    static void printDecimalToOctal(int[] a){
        int[] oct = new int[a.length];
        for (int i = 0 ; i<a.length ; i++){
            oct[i] = decimalToOctal(a[i]);
        }

        System.out.println("Octal Array:- ");
        for (int i=0 ; i<oct.length ; i++){
            System.out.println(oct[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:- ");
        size = sc.nextInt();
        a = new int[size];

        inputArray(a);
        outputArray(a);
        printDecimalToOctal(a);
    }
}
