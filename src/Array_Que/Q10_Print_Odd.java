package Array_Que;

import java.util.Scanner;

public class Q10_Print_Odd {

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

    static void oddNumbers(int a[]){

        int count = 0;
        for (int i = 0 ; i<a.length ; i++){
            if (a[i]%2 != 0){
                count++;
            }
        }

        int odd[] = new int[count];
        int index = 0;
        for (int i = 0 ; i<a.length ; i++){
            if (a[i]%2 != 0) {
                odd[index] = a[i];
                index++;
            }
        }

        System.out.println("Odd elements are:- ");
        for (int i = 0 ; i< odd.length ; i++){
            System.out.println(odd[i]);
        }
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        oddNumbers(a);

    }
}
