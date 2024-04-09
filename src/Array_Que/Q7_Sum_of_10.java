package Array_Que;

import java.util.Scanner;

public class Q7_Sum_of_10 {

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

    static void sumOf(int a[]){
        int sum = 0;

        for (int i=0 ; i<a.length ; i++){
            sum+= a[i];
        }
        System.out.println("Sum of Integers are:- " +sum);
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        sumOf(a);

    }
}
