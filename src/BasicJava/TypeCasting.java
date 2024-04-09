package BasicJava;
 class TypeCasting {
     public static void main(String ...s){
             System.out.println("Type Casting ");
             int x = 10;
             int y = 3;
             float z;
             z = x/y;
             System.out.println("z = "+z);

             z =(float) x/y;
             System.out.println("z = "+z);
             //Implicit Type casting :=>
             byte a = 127; // 1 byte
             short a1 = a; // 2 byte
             System.out.println("a = "+a+"  a1 = "+a1);
             int a2 = 656565; // 4 byte
             long  a3 = a2; // 8 byte
             System.out.println("a2 = "+a2+"  a3 = "+a3);

             float   a4 = 6556545646.76567f; // 4 byte
             double  a5 = a4; // 8 byte
             System.out.println("a4 = "+a4+"  a5 = "+a5);

             //Explicit Type casting :=>
             int b = 127; // 4 byte ;
             byte b1 =(byte) b; // 1 byte
             System.out.println("b = "+b+"  b1 = "+b1);

             int b2 = 130; // 4 byte ;
             byte b3 =(byte) b2; // 1 byte
             System.out.println("b2 = "+b2+"  b3 = "+b3);

             long b4 = 56567567L; // 8 byte
             int b5 = (int) b4	; // 4 byte
             System.out.println("b4 = "+b4+"  b5 = "+b5);

             double b6 = 654656546456456.5645646;// 8 Byte
             float b7 =(float) b6; // 4 byte

             System.out.println("b6 = "+b6+"  b7 = "+b7);

             long d = 56756576576599L; // 8 byte
             float d1 = d;     // 4 byte
             System.out.println("d = "+d+" d1 = "+d1);

             char ch ='A'; //2 byte
             short ch1 =(short) ch;  // 2 byte
             int ch2 = ch; // 4 byte

             System.out.println("ch = "+ch+" ch1 = "+ch1+" ch2=  "+ch2);
             byte ch3 = 122 ; // 1 byte
             char ch4 = (char)ch3;  // 2 btye
             System.out.println("ch3 = "+ch3+" ch4 = "+ch4);
     }
 }

