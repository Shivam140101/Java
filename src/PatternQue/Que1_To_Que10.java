package PatternQue;

import java.util.Scanner;

public class Que1_To_Que10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = sc.nextInt();



        /* 1
           12
           123
           1234
           12345 */
        System.out.println("Ex-1");
        for (int i=1 ; i<=num ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------");

        /* 5
           54
           543
           5432
           54321 */

        System.out.println("Ex-2");
        for (int i = num ; i>=1 ; i--){
            for (int j=num ; j>=i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------");

        /* 1
           22
           333
           4444
           55555 */

        System.out.println("Ex-3");
        for (int i=1 ; i<=num ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------");

        /* 5
           44
           333
           2222
           11111 */

        System.out.println("Ex-4");
        for (int i = num ; i>=1 ; i--){
            for (int j=num ; j>=i ; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------");

        /* 1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15
         */
        System.out.println("Ex-5");
        int k=1;
        for (int i = 1 ; i<=num ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------------------");

        /* 1
           21
           321
           4321
           54321 */

        System.out.println("Ex-6");
        for (int i=1 ; i<=num ; i++){
            for (int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        /* 15
           14 13
           12 11 10
           9 8 7 6
           5 4 3 2 1 */
        System.out.println("Ex-7");
        int s=15;
        for (int i = 1 ; i<=num ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(s+" ");
                s--;
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------------------------");

        /* 12345
           1234
           123
           12
           1 */
        System.out.println("Ex-8");
        for (int i=num ; i>=1 ; i--){
            for (int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------");

        /* 54321
           5432
           543
           54
           5 */
        System.out.println("Ex-9");
        for (int i = 1 ; i<= num ; i++){
            for (int j =num ; j>=i ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        /* 55555
           4444
           333
           22
           1 */
        System.out.println("Ex-10");
        for (int i=num ; i>=1 ; i--){
            for (int j=1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");


    }
}
