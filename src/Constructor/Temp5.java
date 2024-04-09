package Constructor;
/*Init Block :=> The Init block can't have any name
  the class can have more one init block
   The  Init bLock is executed whenever new Object of class
   is created  first before any Constructor */
public class Temp5 {
    Temp5(){

        System.out.println("Default Constructor ... ");
    }

    {

        System.out.println("Init Block 1st ");

    }

    Temp5(int x  ){

        System.out.println("x  = "+x);
    }

    {

        System.out.println("Init Block 2nd ");

    }


    public static void main(String  ...s){
        System.out.println("Object1............");

        new Temp5();

        System.out.println("\n\nObject2............");

        new Temp5(100);


        System.out.println("End of  main ");
    }
}
