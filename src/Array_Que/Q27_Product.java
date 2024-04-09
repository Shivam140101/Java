package Array_Que;

import java.util.Scanner;

public class Q27_Product {

    static int[][] mat1;
    static int[][] mat2;

    static int rows , cols ;

    static void inputArray(int[][] mat1 , int[][] mat2 ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array for Matrix 1 :- ");
        for (int i=0; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                System.out.print("Elements in Matrix1 ["+i+"]["+j+"] = ");
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("\nInput Array for Matrix 2 :- ");
        for (int i=0 ; i<rows ; i++){
            for (int j=0 ; j<cols ; j++){
                System.out.print("Elements in Matrix2 ["+i+"]["+j+"] = ");
                mat2[i][j]= sc.nextInt();
            }
        }
    }

    static void outputArray(int[][] mat1 , int[][]mat2){
        System.out.println("Output Array of Matrix 1 :- ");
        for (int i=0 ; i< rows ; i++){
            for(int j=0 ; j<cols ; j++){

                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Output Array of Matrix 2 :- ");
        for (int i=0 ; i< rows ; i++){
            for(int j=0 ; j<cols ; j++){

                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void product(int[][] mat1 , int[][] mat2){

        int[][] pro = new int[rows][cols];
        int n = mat1.length;

        for (int i = 0 ; i< n ; i++){
            for (int j=0 ; j< n ; j++){
                pro[i][j]=0;

                for (int k = 0 ; k< n ; k++){
                    pro[i][j] = pro[i][j] + (mat1[i][k] * mat2[k][j]);
                }
            }
        }

        for (int i = 0 ; i < n ; i++){
            for (int j=0 ; j<n ; j++){
                System.out.print(pro[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows for Matrix 1 and Matrix 2 :- ");
        rows = sc.nextInt();
        System.out.print("Enter columns for Matrix 1 and Matrix 2 :- ");
        cols = sc.nextInt();


        mat1 = new int[rows][cols];
        mat2 = new int[rows][cols];

        inputArray(mat1,mat2);
        outputArray(mat1,mat2);
        System.out.println("Product of Matrix is:- ");
        product(mat1,mat2);

    }
}
