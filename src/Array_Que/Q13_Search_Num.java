package Array_Que;

import java.util.Scanner;

public class Q13_Search_Num {

    static  int a[];
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
            System.out.println("a["+i+"] = "+b[i]);
        }
    }

    static void searchNum(int a[]){
        System.out.println("Enter an element you want to search");
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int flag = 0;

        for (int i = 0 ; i< a.length ; i++){

            if (item==a[i]){
                flag = 1;
                System.out.println("Element found at :- a["+i+"]");
            }
        }
        if (flag==0){
            System.out.println("Element not found!!!");
        }
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        searchNum(a);

    }
}
