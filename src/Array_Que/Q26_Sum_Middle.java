package Array_Que;

import java.util.Scanner;

public class Q26_Sum_Middle {

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

    static void sumMiddle(int[][] a){
        int m = a.length;
        int n = a[0].length;

        if (m % 2==0 || n % 2==0){
            System.out.println("Matrix doesn't have any middle rows and columns. ");
        }
        else {
            int middleRow = m/2;
            int middleCol = n/2;

            int rowSum = 0;
            int colSum = 0;

            for (int i= 0 ; i< m ; i++){
                rowSum += a[middleRow][i];
            }
            for (int i= 0 ; i< m ; i++){
                colSum += a[i][middleCol];
            }

            System.out.println("Sum of middle row is :- "+rowSum);
            System.out.println("Sum of middle column is :- " +colSum);

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
        sumMiddle(a);

    }
}
