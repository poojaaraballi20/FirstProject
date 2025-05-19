package ex02_Java_basics;

public class IncreementExmaple01 {

    public static void main(String[] args) {
        int a=10;
        ++a;
        System.out.println(a);
       int b = a++;
        System.out.println("second time:" +a );
        System.out.println("b:" +b);

        //ERT
        //LN/a/b

        int in1=10;
        System.out.println("value of exp1:");
        System.out.println(in1++ + ++in1);

    }
}
