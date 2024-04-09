package Array_Que;

import java.util.Scanner;

public class Q8_Compare_Sum {

    static  int a[];
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
        System.out.println("Output Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("x["+i+"] = "+b[i]);
        }
    }

    static void compare(int a[]){
        int sumEven = 0;
        int sumOdd = 0;

        for (int i=0 ; i<a.length ; i++){

            if (a[i]%2==0){
                sumEven += a[i];
            }
            else {
                sumOdd += a[i];
            }
        }

        System.out.println("Sum of Even elements:- " +sumEven);
        System.out.println("Sum of Odd elements " + sumOdd);
        if (sumEven > sumOdd) {
            System.out.println("Sum of even elements is greater.");
        } else if (sumEven < sumOdd) {
            System.out.println("Sum of odd elements is greater.");
        } else {
            System.out.println("Sum of even and odd elements is equal.");
        }

    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        compare(a);

    }
}
