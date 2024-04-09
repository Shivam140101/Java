package Array_Que;

import java.util.Scanner;

public class Q6_Reverse_Elements {

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

    static void reverseArray(int a[]){
          int rev[] = new int[a.length];
          int i =0;

          for (int j = a.length-1 ; j>= 0 ; j--){
              rev[j] = a[i];
              i++;
          }

        System.out.println("Reverse order of this Array is:- ");
          for (int k = 0 ; k < rev.length ; k++){
              System.out.print(rev[k]);
              if (k < rev.length-1){
                  System.out.print(", ");
              }
          }
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        reverseArray(a);

    }
}
