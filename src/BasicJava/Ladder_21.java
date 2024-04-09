package BasicJava;
import java.util.Scanner;
public class Ladder_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float curr_unit=0.0f,prev_unit=0.0f,consumed_unit=0.0f,bill=0.0f,tot_bill=0.0f;
        System.out.print("Enter Current  electricity unit  ");
        curr_unit = sc.nextFloat();
        System.out.println("The Current  electricity unit  "+curr_unit);

        System.out.print("Enter Previous  electricity unit  ");
        prev_unit = sc.nextFloat();
        System.out.println("The Previous  electricity unit  "+prev_unit);

        if(curr_unit > prev_unit) {
            consumed_unit = curr_unit - prev_unit;
            System.out.println("The Consumed   electricity unit  "+consumed_unit);
        }
        else
            System.out.println("Please Verify Meter & unit ");

        if(consumed_unit <= 50)
            bill = consumed_unit * 0.5f;
        else if(consumed_unit > 50 && consumed_unit <=100)
            bill = consumed_unit * 0.75f;

        else if(consumed_unit > 100 && consumed_unit <=250)
            bill = consumed_unit * 1.2f;
        else if(consumed_unit > 250 )
            bill = consumed_unit * 1.5f;
        System.out.println();

        System.out.println("The Bill of  electricity as per  unit  "+bill);
        tot_bill = bill +(bill * 0.2f);
        System.out.println("The Bill of  electricity   unit with additional charges  "+tot_bill);
    }

}
