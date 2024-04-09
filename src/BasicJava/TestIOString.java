package BasicJava;
import java.util.*;
public class TestIOString {
    public static void main(String ...s)	{
        System.out.println("The Ex. of IO String ");
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter  full name :=>   ");
        String name = sobj.nextLine();
        System.out.println("The Name is  "+name);

        System.out.print("Enter  any String :=>   ");
        String name1 = sobj.next();
        System.out.println("The Name is  "+name1);

        System.out.print("Enter  any String :=>   ");
        String name2 = sobj.next();  //Binay []
        System.out.println("The Name is  "+name2);

        int len = name2.length();
        System.out.println("The  length   "+len);
        len = "Good evening".length();
        System.out.println("The  length   "+len);

        char ch = name2.charAt(4);
        System.out.println("The  ch =  "+ch);
        ch = "Good".charAt(0);
        System.out.println("The  ch =  "+ch);

        System.out.print("Enter   any character :  ");
        char ch1=  sobj.next().charAt(2); //"Hello" l
        System.out.println("The  ch1 =  "+ch1);

        System.out.print("Enter char D.T value  :  ");
        char ch2=  sobj.next().charAt(0);
        System.out.println("The char D.T value is  ch2 =  "+ch2);



    }

}

