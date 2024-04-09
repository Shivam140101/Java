package PatternQue;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = sc.nextInt();



        /*  *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *     */
        System.out.println("Ex-1");
         for (int i=1 ; i<=num ; i++){
             for (int k=num ; k>i ; k--){
                 System.out.print(" ");
             }
            for (int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }

        for (int x=num-1 ; x>=1 ; x--){
            for (int y=x ; y<num ; y++){
                System.out.print(" ");
            }
            for (int z=2*x-1 ; z>=1 ; z--){
                System.out.print("*"+"");
            }
            System.out.println();
        }

        System.out.println("=================================================================================");
        System.out.println("=================================================================================");


        /*  *********
             *******
              *****
               ***
                *
               ***
              *****
             *******
            *********  */

        System.out.println("Ex-2");
        for (int x=num ; x>=1 ; x--){
            for (int y=x ; y<num ; y++){
                System.out.print(" ");
            }
            for (int z=2*x-1 ; z>=1 ; z--){
                System.out.print("*"+"");
            }
            System.out.println();
        }

        for (int i=2 ; i<=num ; i++){ 
            for (int k=num ; k>i ; k--){
                System.out.print(" ");
            }
            for (int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*"+"");
            }
            System.out.println();
        }

        System.out.println("======================================================================================");
        System.out.println("======================================================================================");


        /*
         **********
         ****  ****
         ***    ***
         **      **
         *        *
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         */

        System.out.println("Ex-3");
        for (int i=1 ; i<=num ; i++){
            for (int k=i ; k<=num ; k++){
                System.out.print("*");
            }
            for (int z=1; z<=(i*2-2) ; z++){
               System.out.print(" ");
            }
            for (int j=i ; j<=num ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=num; i>=1 ; i--){
            for (int j=i ; j<=num ; j++){
                System.out.print("*");
            }
            for (int k=(i*2-1);k>1 ; k--){
                System.out.print(" ");
            }
            for (int l=i ; l<=num ; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=========================================================================================");
        System.out.println("=========================================================================================");

    }
}
