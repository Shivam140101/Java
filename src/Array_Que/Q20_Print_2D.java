package Array_Que;

import java.util.Scanner;

public class Q20_Print_2D {

    static int[][] a;
    static int rows , col;
    static void inputArray(int[][] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array:- ");

        for (int i = 0 ; i< rows ; i++){
            for (int j=0 ; j<col; j++){
                System.out.print("Elements in Array ["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void outputArray(int[][] a){
        System.out.println("Output Array:-  ");
        for (int i = 0 ; i<rows ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.println("a["+i+"]["+j+"] = "+ a[i][j] );
            }
        }
        System.out.println();
    }

    static void twoDimArray(int[][] a){
        for (int i = 0 ; i< rows ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows:- ");
        rows = sc.nextInt();
        System.out.print("Enter no. of columns:- ");
        col = sc.nextInt();

        a = new int[rows][col];
        inputArray(a);
        outputArray(a);
        twoDimArray(a);

    }
}
