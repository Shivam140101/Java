package Array_Que;
//                           Armstrong No. in an Array
import java.util.Scanner;
 class armstrong {

     static int a[];
     static void inputArray(int a[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Input Array");
         for (int i = 0; i < a.length; i++) {
             System.out.print("Element in Array [" + i + "] = ");
             a[i] = sc.nextInt();
         }
     }

     static void outputArray(int a[]) {
         System.out.println("Output Array");
         for (int i = 0; i < a.length; i++) {
             System.out.println("a[" + i + "] = " + a[i]);
         }
     }

     static void armstrongNum(int a[]) {

         for (int i = 0 ; i<a.length ; i++){
             int count = 0 , sum=0 ;
             int rem;

             int num = a[i];
             int num1 = num;

             while (num>0){
                 count++;
                 num = num / 10;
             }

             while (num1>0){
                 rem = num1%10;
                 sum = sum + (int)Math.pow(rem,count);
                 num1 = num1/10;

             }
             if (a[i]==sum){
                 System.out.println(a[i]+" is Armstrong");
             }
             /*
             else {
                 System.out.println(a[i]+" is not Armstrong");
             } */
         }
     }

 }

  public class Q4_find_Armstrong extends armstrong {
     public static void main(String[] args) {

             a = new int[10];
             inputArray(a);
             outputArray(a);
             System.out.println("\nArmstrong Numbers are:- ");
             armstrongNum(a);

         }
  }
