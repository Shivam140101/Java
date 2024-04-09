package Loop_Que;

// 20.	Write a Java program to print all ASCII character with their values.

public class Q20_Print_ASCII {

    public static void main(String[] args) {

        System.out.println("ASCII character with their values are:-\n ");

        System.out.println("ASCII char \t\t\t Values");

        for (int i = 0; i <= 127; i++) {
            System.out.println("\t"+(char) i + "\t\t\t\t\t" + i);
        }
    }
}
