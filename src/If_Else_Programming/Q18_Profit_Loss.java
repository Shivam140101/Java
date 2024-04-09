package If_Else_Programming;

import java.util.Scanner;

public class Q18_Profit_Loss {
    public static void main(String[] args) {
        //Write a program to calculate profit or loss
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price:-  ");
        int cp = sc.nextInt();
        System.out.println("Cost Price:- "+cp);

        System.out.print("Enter Selling Price:- ");
        int sp = sc.nextInt();
        System.out.println("Selling Price:- "+sp);

        int amt;

        if (cp>sp){
            amt = cp - sp;
            System.out.println("loss = "+amt);
        }
        else if (sp>cp){
            amt = sp - cp;
            System.out.println("Profit = "+amt);
        }
        else
            System.out.println("Neither Profit nor Loss");

    }
}
