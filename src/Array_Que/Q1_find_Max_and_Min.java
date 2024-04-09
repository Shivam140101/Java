package Array_Que;

import java.util.Scanner;

                                   // Find min and max Array
public class Q1_find_Max_and_Min {

    static int[] a;
    static void inputArray(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    static void outputArray(int b[]){
        System.out.println("Output Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("x["+i+"] = "+b[i]);
        }
    }

    static int MinArray(int x[]){

        int min = x[0];
        for (int i = 0; i<x.length ; i++){
            if (min > x[i]){
                min = x[i];

            }
        }
        return min;
    }

    static int MaxArray(int x[]){
        int max = x[0];
        for (int i= 0 ; i<x.length ; i++){
            if (max<x[i]){
                max = x[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        a = new int[5];
        inputArray(a);
        outputArray(a);
        System.out.println("Minimum Array element is:- "+MinArray(a));
        System.out.println("Maximum Array element in:- "+MaxArray(a));
    }
}
