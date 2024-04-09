package BasicJava;
 class TypePromotion {

     void show(byte x ){
         System.out.println("byte  x = "+x);
     }
     void show(int x ){
         System.out.println("int  x = "+x);
     }
     void show(short x ){
         System.out.println("short  x = "+x);
     }
     void show(long  x ){
         System.out.println("long   x = "+x);
     }

     void show(float x ){
         System.out.println("float  x = "+x);
     }
     void show(double  x ){
         System.out.println("double    x = "+x);
     }

     public static void main(String []s){
         TypePromotion obj =null; //Reference var. declaration
         System.out.println("The value of Ref . var obj  "+obj);
         obj= new  TypePromotion();
         System.out.println("The value of Ref . var is Ref id obj  "+obj);

         TypePromotion obj1= new  TypePromotion();
         System.out.println("The value of Ref . var is Ref id obj1  "+obj1);

         obj1.show(10);  //Integer iliteral 10 20 6556 4 byte  //
         obj1.show((byte)100);
         obj1.show((short)32767);
         obj1.show(56756576576599L); // l or L
         obj.show(56456.56456); // 8 byte
         obj.show(56456.56456f);	 // F or f

     }

 }


