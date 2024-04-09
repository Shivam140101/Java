package Array_Que;

import java.util.Scanner;

public class Q30_Sum_Upper_Triangular {

    static int[][] a;

    static int row , col;

    static void inputArray(int[][] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array:- ");
        for (int i=0 ; i<row ; i++){
            for (int j = 0 ; j<col ; j++){
                System.out.print("Elements in Array ["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void outputArray(int[][] a){
        System.out.println("Output Array:- ");
        for (int i=0 ; i< row ; i++){
            for(int j=0 ; j<col ; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfUpperTriangular(int[][] a){
        int sum = 0;
        int num = a.length;
        int num1 = a[0].length;

        for (int i=0 ; i< num ; i++){
            for (int j= i+1 ; j< num1 ; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows:- ");
        row = sc.nextInt();
        System.out.print("Enter no. of columns:- ");
        col = sc.nextInt();

        a = new int[row][col];
        inputArray(a);
        outputArray(a);
        System.out.println("The sum of lower triangular elements is:- "+sumOfUpperTriangular(a));


    }
}
