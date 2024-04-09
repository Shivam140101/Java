package Array_Que;
/* WAP enter element in Array to find the greatest element & sum element: */
import java.util.Scanner;
public class maxSum {

    static int x[];

    static void inputArray(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("input element in Array:-");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    static void outputArray(int b[]){
        System.out.println("output element in Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("x["+i+"]= "+b[i]);
        }
    }

    static int sumArray(int x[]){
        int sum = 0;
        for (int i=0 ; i<x.length ; i++){
            sum = sum + x[i];
        }
        return sum;
    }

    static int maxElement(int x[]){
        int max = x[0];
        for (int i=0 ; i<x.length ; i++){
            if (max<x[i]){
                max = x[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        x = new int[5];
        inputArray(x);
        outputArray(x);
        System.out.println("Sum of Array element " +sumArray(x));
        System.out.println("Greatest element in the Array " +maxElement(x));



    }
}
