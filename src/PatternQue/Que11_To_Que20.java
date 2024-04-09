package PatternQue;

import java.util.Scanner;

public class Que11_To_Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = sc.nextInt();

        /* 11111
           2222
           333
           44
           5 */
        System.out.println("Ex-11");
        for (int i = 1 ; i<= num ; i++){
            for (int j =num ; j>=i ; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        /* 54321
           4321
           321
           21
           1 */
        System.out.println("Ex-12");
        for (int i=num ; i>=1 ; i--){
            for (int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------");

        /* 1 2 3 4 5
           6 7 8 9
           10 11 12
           13 14
           15 */
        System.out.println("Ex-13");
        int x = 1;
        for (int i = num ; i>=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------");

        /* 15 14 13 12 11
           10 9 8 7
           6 5 4
           3 2
           1 */
        System.out.println("Ex-14");
        int y = 15;
        for (int i = num ; i>=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(y+" ");
                y--;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------");

        /*     1
              12
             123
            1234
           12345 */
        System.out.println("Ex-15");
        for (int i = 1 ; i<= num ; i++){
            for (int k=num ; k>i ; k--){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        /*    5
             45
            345
           2345
          12345 */
        System.out.println("Ex-16");
        for (int i = num ; i>=1 ; i--){
            for (int k=1 ; k<i ; k++ ){
                System.out.print(" ");
            }
            for (int j=i ; j<=num ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------");

        /*    1
             22
            333
           4444
          55555 */
        System.out.println("Ex-17");
        for (int i = 1 ; i<= num ; i++){
            for (int k=num ; k>i ; k--){
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        /*    5
             44
            333
           2222
          11111 */
        System.out.println("Ex-18");
        for (int i = num ; i>=1 ; i--){
            for (int k=1 ; k<i ; k++ ){
                System.out.print(" ");
            }
            for (int j=i ; j<=num ; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------");

        /*    1
            2 3
          4 5 6
        7 8 9 10
       11 12 13 14 15 */
        System.out.println("Ex-19");
        int z=1;
        for (int i=1 ; i<=num ; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + z);
                z++;
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------------");

        /*
           12345
            1234
             123
              12
               1 */
        System.out.println("Ex-20");
        for (int i=num ; i>=1 ; i--){
            for (int k=num ; k>i ; k--){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
