package Array_Que;

import java.util.Scanner;

public class Q16_PrimeNo {

    static int a[];

    static boolean primeCheck(int num){

        for (int i=2 ; i <= Math.sqrt(num) ; i++){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }


    static void primeNum(int a[]){

        int count = 0;
        int num1 = 2;

        while (count < a.length){
            if (primeCheck(num1)) {
                a[count] = num1;
                count++;
            }
            num1++;
        }

        System.out.println("The first "+count+" Prime Numbers are :- ");
        for (int i = 0 ; i<a.length ; i++){
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array:- ");
        int size = sc.nextInt();
        a = new int[size];
        primeNum(a);

    }
}
