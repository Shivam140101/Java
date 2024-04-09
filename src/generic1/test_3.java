package generic1;

public class test_3 {

    static <E> void display(E[] elements){

        Class c1 = elements.getClass();
        System.out.println(c1.getName()+"  ");
        for (E obj : elements){
            System.out.print("  "+obj);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intarray = {8,3,6,8,1,66,33};
        display(intarray);

        Character[] chararray = {'d','u','c','a','t'};
        display(chararray);

        Float[] floatarray = {12.33f , 45.66f , 89.45f};
        display(floatarray);
    }
}
