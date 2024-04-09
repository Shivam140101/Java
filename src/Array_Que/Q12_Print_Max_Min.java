package Array_Que;

import java.util.Scanner;

public class Q12_Print_Max_Min {

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

    static void maxArray(int a[]){
        int max = a[0];

        for (int i=0 ; i< a.length ; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum No. in Array is:- " +max);
    }

    static void minArray(int a[]){
        int min = a[0];

        for (int i = 0 ; i<a.length ; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum No. in an Array is:-  " +min);
    }

    public static void main(String[] args) {
        a = new int[10];
        inputArray(a);
        outputArray(a);
        maxArray(a);
        minArray(a);

    }
}
