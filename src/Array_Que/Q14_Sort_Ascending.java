package Array_Que;

import java.util.Scanner;

public class Q14_Sort_Ascending {

    static  int a[];
    static void inputArray(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }

    }
    static void outputArray(int b[]){
        System.out.println("Output Array:- ");
        for (int i=0 ; i<b.length ; i++){
            System.out.println("a["+i+"] = "+b[i]);
        }
    }

    static void sortAscending(int a[]){
        int sort[] = new int[a.length];
        int ind = 0;
        int temp;
        for (int i = 0 ; i<a.length ; i++){
            for (int j = i+1 ; j<a.length ; j++){
                    if (a[i] > a[j]){
                      temp = a[i];
                      a[i] = a[j];
                      a[j] = temp;
                    }
            }
        }
        System.out.println("After Sorting in Ascending Order:- ");
        for (int i = 0 ; i<a.length ; i++){
            sort[ind] = a[i];
            ind++;
        }
        for (int i=0 ; i<sort.length ; i++){
            System.out.println(sort[i]);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:- ");
        int size = sc.nextInt();
        a = new int[size];

        inputArray(a);
        outputArray(a);
        sortAscending(a);

    }
}
