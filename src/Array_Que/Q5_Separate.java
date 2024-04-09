package Array_Que;

import java.util.Scanner;

public class Q5_Separate {

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
    static void separate(int a[]){

        int x[] = new int[a.length];
        int xind = 0;

        int y[] = new int[a.length];
        int yind = 0;

        int z[] = new int[a.length];
        int zind = 0;

        for (int i = 0 ; i<a.length ; i++){
            int item = a[i];
            if (item > 0){
                x[xind] = a[i];
                xind++;
            }

            else if (item < 0){
                y[yind] = a[i];
                yind++;
            }
            else {
                z[zind] = a[i];
                zind++;
            }
        }
        System.out.print("Positive elements are:- ");
        for (int i=0 ; i<xind ; i++){
            System.out.print(x[i]);
            if (i<xind-1){
                System.out.print(", ");
            }
        }

        System.out.print("\nnegative elements are:- ");
        for (int i=0 ; i<yind ; i++){
            System.out.print(y[i]);
            if (i<yind-1){
                System.out.print(", ");
            }
        }
        System.out.print("\nzero elements are:- ");
        for (int i=0 ; i<zind ; i++){
            System.out.print(z[i]);
            if (i<zind-1){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {

        a = new int[10];
        inputArray(a);
        outputArray(a);
        separate(a);

    }
}
