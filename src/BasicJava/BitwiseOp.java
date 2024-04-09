package BasicJava;

public class BitwiseOp {
    public static void main(String[] args) {
        int x = 60;
        int y =13;
        int rs;
        rs = (x  &  y);
        System.out.println("Bitwise  AND &  "+rs);

        rs = (x  | y);
        System.out.println("Bitwise  OR |  "+rs);

        rs = (x  ^  y);
        System.out.println("Bitwise  X-OR ^  "+rs);

        rs = (~x );
        System.out.println("Bitwise  Complement ~  "+rs);

        rs = (x  << 2);
        System.out.println("Bitwise  Left Shift << "+rs);

        rs = (x  >>  2);
        System.out.println("Bitwise Right Shift >> "+rs);


    }
}
