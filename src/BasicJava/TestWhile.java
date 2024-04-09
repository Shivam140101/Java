package BasicJava;

public class TestWhile {
    public static void main(String[] args) {
        System.out.println("Ex1---------");
        int i;
        i=1;
        while(i <= 5) {
            System.out.println("i = "+i );
            i++;
        }

        System.out.println("Ex2---------");

        i=1;
        while(i <= 5)
            System.out.println("i = "+i++ );

        System.out.println("Ex3---------");

        i=5;
        while(i >= 1) {
            System.out.println("i = "+i );
            i--;
        }

        System.out.println("Ex4---------");

        i=5;
        while(i >= 1)
            System.out.println("i = "+i-- );


        System.out.println("Ex5---------");

        i=1;
        while(true) {
            if(i ==6)
                break;
            System.out.println("i = "+i );
            i++;
        }

        // System.out.println("Out Of Loop");
    }

}
