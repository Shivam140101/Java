package Loop_Que;


// 3.	Write a Java program to print all alphabets from a to z. - using while loop
public class Q3_a_to_z {

    public static void main(String[] args) {
        char currentChar = 'a';
        while (currentChar <= 'z') {
            System.out.print(currentChar + " ");
            currentChar++;
        }
    }
}
