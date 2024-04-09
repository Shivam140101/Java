package Loop_Que;

// 4.	Write a Java program to print all even numbers between 1 to 100. - using while loop

public class Q4_Even_1_to_100 {
    public static void main(String[] args) {

        System.out.println("Even Numbers between 1 to 100 are");

        int num = 100;
        int i=1;
        while (i <= num){
            if (i % 2==0){
                System.out.println(i);
            }
            i++;

        }

    }
}
