package If_Else_Programming;

import java.util.Scanner;

public class Q13_Count_Notes {
    public static void main(String[] args) {
        //Write a program to count total number of notes in given amount.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount:- ");
        int am = sc.nextInt();
        System.out.println("Amount: "+am);

        int note500 , note100 , note50 , note20 , note10 , note5 , note2 , note1;

        note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

        if (am>=500){
            note500 = am/500;
            am = am- (note500*500);
        }
         if (am>=100){
            note100 = am/100;
            am = am - (note100*100);
        }
         if (am>=50) {
            note50 = am/50;
            am = am - (note50*50);
        }
         if (am>=20) {
            note20 = am/20;
            am = am - (note20*20);
        }
         if (am>=10){
            note10 = am/10;
            am = am - (note10*10);
        }
         if (am>=5){
            note5 = am/5;
            am = am - (note5*5);
        }
         if (am>=2){
            note2 = am/2;
            am = am- (note2*2);
        }
         if (am>=1)
            note1 = am-am;

        System.out.println("The total no. of notes:- ");
        System.out.println("500= "+note500);
        System.out.println("100= "+note100);
        System.out.println("50= "+note50);
        System.out.println("20= "+note20);
        System.out.println("10= "+note10);
        System.out.println("5= "+note5);
        System.out.println("2= "+note2);
        System.out.println("1= "+note1);

    }
}
