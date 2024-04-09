package Array_Que;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/* WAP enter element in two diff. Array and merge into 3rd:-*/
public class merge {

    static int x[];
    static int y[];
    static int z[];
    static int k;

    static final int size1 = 8;
    static final int size2 = 10;
    static final int size3 = size1 + size2;

    static void inputArray(int a[]){
        System.out.println("input element in Array");
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter a element in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    static void outputArray(int b[]){
        System.out.println("output element in Array:- ");
        for (int i: b){
            System.out.println(" "+i);
        }
    }

    static void mergeArray(int a[]){
        for (int i=0 ; i<a.length ; i++){
            z[k++] = a[i];
        }
    }

    static int searchElement(int a[] , int item){
        int flag = 0;
        for (int i=0 ; i<a.length ; i++){
            if (item==a[i]){
                flag = i+1;
            }
        }
        return flag;
    }

    static void selectionSort(int a[]){
        int temp = 0;
        for (int i=0 ; i<a.length ; i++){
            for (int j=i+1; j<a.length ; j++){
                if (a[j]<a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        x = new int[size1];
        y = new int[size2];
        z = new int[size3];

        inputArray(x);
        inputArray(y);
        System.out.println("Output the first Array Element:-  ");
        outputArray(x);
        System.out.println("Output the second Array Element:- ");
        outputArray(y);
        mergeArray(x);
        mergeArray(y);
        System.out.println("Output the 3rd Array element");
        outputArray(z);

        int loc = searchElement(z,11);
        if (loc!= 0){
            System.out.println("The item is found in the Array:- "+loc);
        }
        else {
            System.out.println("The item is not found in the Array:- ");
        }
        selectionSort(z);
        System.out.print("\n After sorting Array element z");
        outputArray(z);
    }
}
