package ex02_Java_basics;

public class ImplicitTypeCastingEg {
    public static void main(String[] args) {
        byte a=10;
        int d=1000;

        //This is implicit typecasting
        int b=a;//widening
 //int b= (int)a;//widening and explicit(its optional)

        //Narrowing
        byte c= (byte)d;
        System.out.println(c);
int cost=200;
float gst=2.1f;
int total= cost+(int)gst;//narrowing explicit
        System.out.println(total);

        int phoneno=980987879;
        short s=(short)phoneno;
        System.out.println("phone number is" + s);

    }
}
