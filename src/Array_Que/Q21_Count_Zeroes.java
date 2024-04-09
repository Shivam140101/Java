package Array_Que;

import java.util.Scanner;

public class Q21_Count_Zeroes {

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

    static int countZero(int[][] a){
        int count = 0;

        for (int i = 0 ; i< row ; i++){
            for (int j=0 ; j<col ; j++){
                if (a[i][j]==0){
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("Number of zeros in a Matrix are:- " +countZero(a));


    }
}
