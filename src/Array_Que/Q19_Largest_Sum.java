package Array_Que;

import java.util.Scanner;

public class Q19_Largest_Sum {

    static int[] a;
    static void inputArray(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }

    }
    static void outputArray(int[] b){
        System.out.println("Output Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("a["+i+"] = "+b[i]);
        }
    }

    static int largestSum(int[] a){
        int current =a[0];
        int max = a[0];

        for (int i = 1; i < a.length ; i++) {
            current = Math.max(a[i], current + a[i]);
            max = Math.max(max,current);

        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:- ");
        int size = sc.nextInt();
        a = new int[size];
        inputArray(a);
        outputArray(a);
        System.out.println("Largest sum in Array is :- "+largestSum(a));

    }
}
