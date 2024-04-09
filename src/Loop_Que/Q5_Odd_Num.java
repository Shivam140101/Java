package Loop_Que;

// 5.	Write a Java program to print all odd number between 1 to 100.

public class Q5_Odd_Num {

    public static void main(String[] args) {

        System.out.println("Odd Numbers from 1 to 100 are:- ");
        for (int i=1 ; i<=100 ; i++){
            if ((i+1) % 2==0){
                System.out.println(i);
            }
        }

    }
}
