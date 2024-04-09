package Array_Que;

import java.util.Scanner;

public class Q15_Count_Occurence {

    static int[] a;
    static void inputArray(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.print("Enter elements in Array ["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }

    static void outputArray(int[] a){
        System.out.println("Output Array");
        for (int i=0 ; i<a.length ; i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }

    static void countOccurrence(int[] a){
        int[] freq = new int[a.length];

        for (int i=0 ; i<a.length ; i++){
            int count = 1;
            for (int j=i+1 ; j<a.length ; j++){
                if (a[i]==a[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1){
                freq[i] = count;
            }
        }

        for (int i=0 ; i<a.length ; i++){
            if (freq[i] != -1){
                System.out.println(a[i]+" occurs "+freq[i]+" times");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array:- ");
        int size = sc.nextInt();
        a = new int[size];

        inputArray(a);
        outputArray(a);
        countOccurrence(a);



    }
}
