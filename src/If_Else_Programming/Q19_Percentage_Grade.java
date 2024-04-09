package If_Else_Programming;

import java.util.Scanner;

public class Q19_Percentage_Grade {
    public static void main(String[] args) {
        //Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
        //Calculate percentage and grade according to following:
        //Percentage >= 90% : Grade A
        //Percentage >= 80% : Grade B
        //Percentage >= 70% : Grade C
        //Percentage >= 60% : Grade D
        //Percentage >= 40% : Grade E
        //Percentage < 40% : Grade F

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks in Physics:- ");
        float phy = sc.nextFloat();
        System.out.println("Physics:- "+phy);

        System.out.print("Enter Marks in Chemistry:- ");
        float chem = sc.nextFloat();
        System.out.println("Chemistry:- "+chem);

        System.out.print("Enter Marks in Biology:- ");
        float bio = sc.nextFloat();
        System.out.println("Biology:- "+bio);

        System.out.print("Enter Marks in Mathematics:- ");
        float math = sc.nextFloat();
        System.out.println("Mathematics:- "+math);

        System.out.print("Enter Marks in Computer:- ");
        float comp = sc.nextFloat();
        System.out.println("Computer:- "+comp);

        float per = ((phy + chem + bio + math + comp) / 5f) * 100f/100f;
        System.out.println("Percentage is = "+per+"%");

        if (per>= 90 && per<100)
            System.out.println("Grade A");
        else if (per>= 80 && per<90)
            System.out.println("Grade B");
        else if (per>= 70 && per<80)
            System.out.println("Grade C");
        else if (per>= 60 && per< 70 )
            System.out.println("Grade D");
        else if (per>= 40 && per<60)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");


    }
}
