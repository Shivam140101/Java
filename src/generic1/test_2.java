package generic1;

public class test_2 {

    // function as generics

    public static <E> void display(E element){
        System.out.println(element.getClass().getName()+"  "+element);
    }

    public static void main(String[] args) {

        display(1234);
        display("AAAA");
        display(12.45f);
        display(12.67);
        display((byte)123);
        display(12345678L);
        display('D');

    }
}
