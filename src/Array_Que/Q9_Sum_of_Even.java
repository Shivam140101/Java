package Array_Que;

import java.util.Scanner;

public class Q9_Sum_of_Even {

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

    static void sumOfEvenNumbers(int a[]) {

        int sumEven[] = new int[a.length];
        int index = 0;
        int sum = 0;

        for (int i = 0 ; i<a.length ; i++){
            if (a[i]%2==0) {
                sumEven[index] = a[i];
                index++;
            }
        }
        System.out.println("Even elements are:- ");
        for (int i = 0 ; i<index ; i++){
            System.out.println(sumEven[i]);
        }

        for (int i = 0 ; i<index ; i++){
            sum += sumEven[i];
        }
        System.out.println("Sum of Even integers are:- " +sum);
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        sumOfEvenNumbers(a);

    }
}
