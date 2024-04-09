package Array_Que;

import java.util.Scanner;

public class Q25_Transpose {

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

    static void transpose(int[][] a){
        int n = a.length;
        int m = a[0].length;

        int[][] trans = new int[m][n];

        for (int i = 0 ; i< n ; i++){
            for (int j=0 ; j< m ; j++){
                trans[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of this Matrix is :- ");
        for (int i = 0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
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
        transpose(a);

    }
}
