package generic1;

public class test_1 <T , U> {

    T a;
    U b;

    public test_1(T a, U b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println("  "+a+"  "+b);
    }

    public static void main(String[] args) {

        System.out.println("Integer String obj.............");
        test_1 <Integer , String> isobj = new test_1<>(10,"AAAA");
        isobj.show();

        System.out.println("String Float obj................");
        test_1 <String , Float> sfobj = new test_1<>("SSSS",12.34f);
        sfobj.show();

        System.out.println("Integer Double obj............");
        test_1<Integer , Double> idobj = new test_1<>(88,45.23);
        idobj.show();

        System.out.println("Double Character obj.............");
        test_1<Double , Character> dcobj = new test_1<>(46.89,'S');
        dcobj.show();

    }
}
